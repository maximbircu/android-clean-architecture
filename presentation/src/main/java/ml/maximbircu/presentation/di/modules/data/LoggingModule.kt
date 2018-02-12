package ml.maximbircu.presentation.di.modules.data

import dagger.Module
import dagger.Provides
import ml.maximbircu.data.datasources.network.services.configuration.ConfigurationService
import ml.maximbircu.data.logging.CrashlyticsAppender
import ml.maximbircu.data.logging.LogcatLoggerAdapter
import ml.maximbircu.domain.logging.LogLevel
import ml.maximbircu.domain.logging.Logger
import ml.maximbircu.domain.logging.LoggerBuilder
import ml.maximbircu.presentation.di.scopes.PerApplication

/**
 * Created by Maxim Bircu on 2/5/18.
 */

@Module
class LoggingModule {
    private lateinit var logger: Logger

    @Provides
    @PerApplication
    fun getLogger(configurationService: ConfigurationService): Logger {
        logger = LoggerBuilder(LogcatLoggerAdapter(LogLevel.getLogLevelByString(configurationService.logcatLogLevel)))
                .appendNextLogger(CrashlyticsAppender(LogLevel.getLogLevelByString(configurationService.crashlyticsLogLevel)))
                .build()
        return logger
    }
}
