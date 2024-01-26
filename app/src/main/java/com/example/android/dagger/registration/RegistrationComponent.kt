package com.example.android.dagger.registration

import com.example.android.dagger.di.scope.ActivityScope
import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface RegistrationComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): RegistrationComponent
    }

    fun inject(activity: RegistrationActivity)

    fun inject(enterDetailsFragment: EnterDetailsFragment)

    fun inject(termsAndConditionsFragment: TermsAndConditionsFragment)

}