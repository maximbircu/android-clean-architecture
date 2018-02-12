package ml.maximbircu.data.datasources.network.services.configuration

import android.content.Context
import android.content.pm.PackageManager
import android.content.res.Resources

/**
 * Created by Maxim Bircu on 12/27/17.
 */

open class DeviceConfigurationProvider() {

    private val TAG: String? = DeviceConfigurationProvider::class.simpleName

    private lateinit var context: Context
    private lateinit var resources: Resources

    constructor(context: Context, resources: Resources): this()  {
        this.context = context
        this.resources = resources
    }

    fun getString(key: String): String? {
        val id = resources.getIdentifier(key, "string", context.packageName)
        return if (id != 0) resources.getString(id) else null
    }

    fun getStringArray(key: String?): Array<String>? {
        val id = resources.getIdentifier(key, "array", context.packageName)
        return if (id != 0) resources.getStringArray(id) else null
    }

    fun getBoolean(key: String): Boolean? {
        val id = resources.getIdentifier(key, "bool", context.packageName)
        return if (id != 0) resources.getBoolean(id) else null
    }

    fun getApplicationVersion(): String? {
        var version : String? = "4.0.0"
        try {
            version = context
                    .packageManager
                    .getPackageInfo(context.packageName, 0)
                    .versionName
        } catch (exception: PackageManager.NameNotFoundException) {
            //TODO log here exception !
        }

        return version
    }
}