package com.example.sunflower.utilities

import android.content.Context
import androidx.fragment.app.Fragment
import com.example.sunflower.data.AppDatabase
import com.example.sunflower.data.PlantRepository
import com.example.sunflower.viewmodels.PlantListViewModelFactory

object InjectorUtils {
    private fun getPlantRepository(context: Context): PlantRepository {
        return PlantRepository.getInstance(
            AppDatabase.getInstance(context.applicationContext).plantDao()
        )
    }

    fun providePlantListViewModelFactory(fragment: Fragment): PlantListViewModelFactory {
        return PlantListViewModelFactory(getPlantRepository(fragment.requireContext()), fragment)
    }
}