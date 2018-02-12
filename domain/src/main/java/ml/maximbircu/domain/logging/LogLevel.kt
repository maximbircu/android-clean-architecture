package ml.maximbircu.domain.logging

/**
 * Created by Maxim Bircu on 2/5/18.
 */

enum class LogLevel private constructor(private val priority: Int, val errorName: String) {
    CRITICAL(1, "[CRITICAL]"),
    ERROR(2, "[ERROR]"),
    WARNING(3, "[WARNING]"),
    INFO(4, "[INFO]"),
    DEBUG(5, "[DEBUG]"),
    VERBOSE(6, "[VERBOSE]");

    fun accept(logLevel: LogLevel): Boolean {
        return logLevel.priority <= this.priority
    }

    companion object {
        fun getLogLevelByString(logLevel: String?): LogLevel {
            values().filter { it.toString() == logLevel?.toUpperCase() }.forEach { return it }
            return ERROR
        }
    }
}