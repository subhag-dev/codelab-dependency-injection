package com.example.android.dagger.di.component

import android.content.Context
import com.example.android.dagger.di.module.AppSubcomponents
import com.example.android.dagger.di.module.StorageModule
import com.example.android.dagger.login.LoginComponent
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationComponent
import com.example.android.dagger.settings.SettingsActivity
import com.example.android.dagger.user.UserManager
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [StorageModule::class, AppSubcomponents::class])
interface AppComponent {

    fun provideUserManager(): UserManager

    fun registrationComponent(): RegistrationComponent.Factory

    fun loginComponent(): LoginComponent.Factory

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

}