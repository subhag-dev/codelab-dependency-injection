package com.example.android.dagger.di.component

import android.content.Context
import com.example.android.dagger.di.module.StorageModule
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationActivity
import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [StorageModule::class])
interface AppComponent {

    fun inject(activity: RegistrationActivity)

    fun inject(activity: MainActivity)

    fun inject(enterDetailsFragment: EnterDetailsFragment)

    fun inject(termsAndConditionsFragment: TermsAndConditionsFragment)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

}