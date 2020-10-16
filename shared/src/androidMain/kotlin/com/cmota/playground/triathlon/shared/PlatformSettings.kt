package com.cmota.playground.triathlon.shared

import androidx.preference.PreferenceManager
import com.cmota.playground.triathlon.shared.data.SettingsRepository
import com.russhwolf.settings.AndroidSettings

actual object PlatformSettings {

    actual val settingsRepository : SettingsRepository by lazy {
        createSettingsRepository()
    }

    actual fun createSettingsRepository(): SettingsRepository {
        val sharedPrefs = PreferenceManager.getDefaultSharedPreferences(appContext)
        val settings = AndroidSettings(sharedPrefs)
        return SettingsRepository(settings)
    }
}