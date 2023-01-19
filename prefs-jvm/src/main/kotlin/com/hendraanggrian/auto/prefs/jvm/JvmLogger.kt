package com.hendraanggrian.auto.prefs.jvm

import com.hendraanggrian.auto.prefs.PreferencesLogger

/** Logger that prints to [System.out], matching its supported channels. */
val PreferencesLogger.Companion.System: PreferencesLogger
    get() = object : PreferencesLogger {
        override fun info(message: String) = println("INFO: $message")
        override fun warn(message: String) = println("WARN: $message")
    }
