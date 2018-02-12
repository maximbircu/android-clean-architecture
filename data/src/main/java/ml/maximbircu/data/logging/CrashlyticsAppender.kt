package ml.maximbircu.data.logging

import android.util.Log
import com.crashlytics.android.Crashlytics
import ml.maximbircu.domain.logging.LogLevel
import ml.maximbircu.domain.logging.Logger

/**
 * Created by Maxim Bircu on 2/5/18.
 */

class CrashlyticsAppender(logLevel: LogLevel) : Logger(logLevel) {
    override fun write(logLevel: LogLevel, tag: String?, message: String) {
        when (logLevel) {
            LogLevel.ERROR -> Crashlytics.log(Log.ERROR, tag, message)
            LogLevel.WARNING -> Crashlytics.log(Log.WARN, tag, message)
            LogLevel.INFO -> Crashlytics.log(Log.INFO, tag, message)
            LogLevel.DEBUG -> Crashlytics.log(Log.DEBUG, tag, message)
            LogLevel.VERBOSE -> Crashlytics.log(Log.VERBOSE, tag, message)
            else -> {
            }
        }
    }

    override fun write(logLevel: LogLevel, tag: String?, message: String, exception: Exception) {
        when (logLevel) {
            LogLevel.ERROR -> Crashlytics.logException(exception)
            LogLevel.WARNING -> Crashlytics.logException(exception)
            LogLevel.INFO -> Crashlytics.logException(exception)
            LogLevel.DEBUG -> Crashlytics.logException(exception)
            LogLevel.VERBOSE -> Crashlytics.logException(exception)
            else -> {
            }
        }
    }
}