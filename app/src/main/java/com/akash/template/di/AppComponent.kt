package com.akash.template.di

import android.content.Context
import com.akash.template.ui.MainFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface AppComponent {

    @Component.Factory
    interface Factory  {
        fun create(@BindsInstance context: Context) : AppComponent
    }

    fun injectFragment(mainFragment: MainFragment)
}