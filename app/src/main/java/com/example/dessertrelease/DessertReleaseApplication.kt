package com.example.dessertrelease

import android.app.Application
import android.content.Context
import androidx.datastore.preferences.preferencesDataStore
import com.example.dessertrelease.local.UserPreferencesRepository

class DessertReleaseApplication: Application() {
    lateinit var userPreferencesRepository: UserPreferencesRepository

    override fun onCreate() {
        super.onCreate()

        userPreferencesRepository = UserPreferencesRepository(datastore)
    }
}

private const val LAYOUT_PREFERENCES_KEY = "layout_preferences"
private val Context.datastore by preferencesDataStore(name = LAYOUT_PREFERENCES_KEY)
