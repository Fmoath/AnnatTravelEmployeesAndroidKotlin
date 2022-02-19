package fm.ps.annat.travel.employees.validator

import android.widget.EditText
import fm.ps.annat.travel.employees.abstract.ValidatorAbstract
import fm.ps.annat.travel.employees.keys.Validations
import java.util.ArrayList

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 2/20/2022
 * @InTheHour : 01 : 03 : 35
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
class Validation {

    private val validators = ArrayList<ValidatorAbstract>()

    fun addEmptyValidator(vararg editText: EditText?) {
        for (editText1 in editText) {
            validators.add(EmptyValidator(editText1!!))
        }
    }

    fun nameValidation(editText: EditText) {
        validators.add(IncorrectValidator(editText , Validations.NAME))
    }

    fun emailValidation(editText: EditText) {
        validators.add(IncorrectValidator(editText , Validations.EMAIL))
    }

    fun passwordValidation(editText: EditText) {
        validators.add(IncorrectValidator(editText , Validations.PASSWORD))
    }

    val isValid: Boolean
        get() {
            var isValid = true
            for (validator in validators) {
                if (!validator.isValid) {
                    if (isValid) {
                        validator.requestFocus()
                    }
                    isValid = false
                }
            }
            return isValid
        }

}