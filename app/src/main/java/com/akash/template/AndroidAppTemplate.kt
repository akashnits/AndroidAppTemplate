package com.akash.template

import android.app.Application
import com.akash.template.di.AppComponent
import com.akash.template.di.DaggerAppComponent

class AndroidAppTemplate : Application() {

    val appComponent : AppComponent by lazy {
        initializeComponent()
    }

    open fun initializeComponent() : AppComponent {
        return DaggerAppComponent.factory().create(applicationContext)
    }
}