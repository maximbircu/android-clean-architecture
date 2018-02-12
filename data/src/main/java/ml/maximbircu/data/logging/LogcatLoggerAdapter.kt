package ml.maximbircu.data.logging

import android.util.Log
import ml.maximbircu.domain.logging.LogLevel
import ml.maximbircu.domain.logging.Logger

/**
 * Created by Maxim Bircu on 2/5/18.
 */

class LogcatLoggerAdapter(logLevel: LogLevel) : Logger(logLevel) {
    override fun write(logLevel: LogLevel, tag: String?, message: String, exception: Exception) {
        when (logLevel) {
            LogLevel.ERROR -> Log.e(tag, message, exception)
            LogLevel.WARNING -> Log.w(tag, message, exception)
            LogLevel.INFO -> Log.i(tag, message, exception)
            LogLevel.DEBUG -> Log.d(tag, message, exception)
            LogLevel.VERBOSE -> Log.v(tag, message, exception)
            else -> {
            }
        }
    }

    override fun write(logLevel: LogLevel, tag: String?, message: String) {
        when (logLevel) {
            LogLevel.ERROR -> Log.e(tag, message)
            LogLevel.WARNING -> Log.w(tag, message)
            LogLevel.INFO -> Log.i(tag, message)
            LogLevel.DEBUG -> Log.d(tag, message)
            LogLevel.VERBOSE -> Log.v(tag, message)
            else -> {
            }
        }
    }
}