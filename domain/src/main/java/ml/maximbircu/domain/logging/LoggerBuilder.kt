package ml.maximbircu.domain.logging

/**
 * Created by Maxim Bircu on 2/5/18.
 */

class LoggerBuilder(private var firstLogger: Logger) {
    private var lastLogger: Logger = firstLogger

    fun appendNextLogger(logger: Logger): LoggerBuilder {
        lastLogger.nextLogger = logger
        lastLogger = logger
        return this
    }

    fun build(): Logger {
        return firstLogger
    }
}