package com.architecture.clean.data.datasources.network.exceptions

/**
 * Created by Maxim Bircu on 12/27/17.
 */

class NetworkConnectionException(error: Error) : RuntimeException(error)