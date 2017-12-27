package com.architecture.clean.data.datasources.network.services.configuration

import android.content.Context
import android.content.res.Resources

/**
 * Created by Maxim Bircu on 12/27/17.
 */

class ConfigurationServiceImpl(context: Context, resources: Resources) : DeviceConfigurationProvider(context, resources), ConfigurationService {
    private val TAG: String? = ConfigurationServiceImpl::class.simpleName

    override var apiEndPoint: String? = null

    init {
        apiEndPoint = getString("client_api_endpoint")
    }
}