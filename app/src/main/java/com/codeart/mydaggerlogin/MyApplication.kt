package com.codeart.mydaggerlogin

import android.app.Application
import com.codeart.mydaggerlogin.di.AppComponent
import com.codeart.mydaggerlogin.di.DaggerAppComponent

open class MyApplication : Application() {
    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(
            applicationContext
        )
    }
}