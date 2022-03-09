package fm.ps.annat.travel.employees.util

import android.widget.EditText
import fm.ps.lib.validation.keys.Patterns

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 2/20/2022
 * @InTheHour : 01 : 00 : 27
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
object VariableUtil {

    fun isTheNameCorrect(editText: EditText): Boolean {
        val name = editText.text.toString()
        return name.matches(Patterns.PATTERN_NAME.toRegex())
    }

    fun isTheEmailCorrect(editText: EditText): Boolean {
        val email = editText.text.toString()
        return email.matches(Patterns.PATTERN_EMAIL.toRegex())
    }

    fun isThePasswordCorrect(editText: EditText): Boolean {
        val password = editText.text.toString()
        return password.matches(Patterns.PATTERN_PASSWORD.toRegex())
    }

}