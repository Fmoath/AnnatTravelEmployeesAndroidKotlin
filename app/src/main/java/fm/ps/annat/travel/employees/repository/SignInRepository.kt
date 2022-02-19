package fm.ps.annat.travel.employees.repository

import android.widget.EditText
import fm.ps.annat.travel.employees.validator.Validation

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 2/20/2022
 * @InTheHour : 01 : 22 : 02
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
class SignInRepository(private var email : EditText, private var password : EditText) {

    fun signIn() : Boolean{
        return signInDevice()
    }

    //==============================================================================================
    // Device Level Sign In Process ...
    private fun signInDevice() : Boolean{
        return validateSignInInformation()
    }

    //==============================================================================================
    // API Level Sign In Process ...


    //==============================================================================================
    // Validation ...
    private fun validateSignInInformation(): Boolean {
        val validation = Validation()
        validation.addEmptyValidator( email , password )
        if (validation.isValid){
            validation.emailValidation( email )
            validation.passwordValidation( password )
        }
        return validation.isValid
    }
}