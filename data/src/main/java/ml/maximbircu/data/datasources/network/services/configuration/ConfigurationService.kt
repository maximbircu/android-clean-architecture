package ml.maximbircu.data.datasources.network.services.configuration

/**
 * Created by Maxim Bircu on 12/27/17.
 */

interface ConfigurationService {
    var apiEndPoint: String?
    var logcatLogLevel: String?
    var crashlyticsLogLevel: String?
}