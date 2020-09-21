package com.example.sunflower

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.sunflower.databinding.FragmentPlantListBinding
import com.example.sunflower.utilities.InjectorUtils
import com.example.sunflower.viewmodels.PlantListViewModel

class PlantListFragment : Fragment() {
    private val viewModel: PlantListViewModel by viewModels {
        InjectorUtils.providePlantListViewModelFactory(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentPlantListBinding.inflate(inflater, container, false)
        context ?: return binding.root

        return inflater.inflate(R.layout.fragment_plant_list, container, false)
    }

}