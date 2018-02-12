package ml.maximbircu.domain.logging

/**
 * Created by Maxim Bircu on 2/5/18.
 */

abstract class Logger(private val defaultLogLevel: LogLevel) {
    var nextLogger: Logger? = null

    internal fun setNextLogger(nextLogger: Logger) {
        this.nextLogger = nextLogger
    }

    fun log(logLevel: LogLevel, tag: String?, message: String) {
        if (this.defaultLogLevel.accept(logLevel)) {
            write(logLevel, tag, message)
        }
        if (nextLogger != null) {
            nextLogger!!.log(logLevel, tag, message)
        }
    }

    fun log(logLevel: LogLevel, tag: String?, message: String, exception: Exception) {
        if (this.defaultLogLevel.accept(logLevel)) {
            write(logLevel, tag, message, exception)
        }
        if (nextLogger != null) {
            nextLogger!!.log(logLevel, tag, message)
        }
    }

    protected abstract fun write(logLevel: LogLevel, tag: String?, message: String)

    protected abstract fun write(logLevel: LogLevel, tag: String?, message: String, exception: Exception)

    fun critical(tag: String?, message: String) {
        log(LogLevel.CRITICAL, tag, message)
    }

    fun error(tag: String?, message: String) {
        log(LogLevel.ERROR, tag, message)
    }

    fun error(tag: String?, message: String, exception: Exception) {
        log(LogLevel.ERROR, tag, message, exception)
    }

    fun warning(tag: String?, message: String) {
        log(LogLevel.WARNING, tag, message)
    }

    fun info(tag: String?, message: String) {
        log(LogLevel.INFO, tag, message)
    }

    fun debug(tag: String?, message: String) {
        log(LogLevel.DEBUG, tag, message)
    }

    fun verbose(tag: String?, message: String) {
        log(LogLevel.VERBOSE, tag, message)
    }
}