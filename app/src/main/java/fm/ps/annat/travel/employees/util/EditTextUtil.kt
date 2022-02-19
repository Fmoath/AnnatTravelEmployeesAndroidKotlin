package fm.ps.annat.travel.employees.util

import android.text.TextUtils
import android.widget.EditText

/**
 * Created With Love For : Annat travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 2/20/2022
 * @InTheHour : 01 : 17 : 06
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
object EditTextUtil {

    fun isEmpty(editText: EditText?): Boolean {
        if (editText == null) {
            return true
        }
        val str: CharSequence = editText.getText().toString()
        return TextUtils.isEmpty(str)
    }

    fun getText(editText: EditText?): String {
        return if (editText == null) "" else editText.getText().toString().trim { it <= ' ' }
    }

}