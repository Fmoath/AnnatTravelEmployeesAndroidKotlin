package fm.ps.annat.travel.employees.util

import android.text.TextUtils
import android.view.View
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
object ViewsUtil {


    //==============================================================================================
    // Enabled And Disabled View  ...
    fun disabledViews(vararg view: View){
        for (thisView in view) {
            thisView.isEnabled = false
        }
    }

    fun enabledViews(vararg view: View){
        for (thisView in view) {
            thisView.isEnabled = true
        }
    }

    //==============================================================================================
    // Edit Text ...
    fun isTheEditTextEmpty(editText: EditText?): Boolean {
        if (editText == null) {
            return true
        }
        val str: CharSequence = editText.getText().toString()
        return TextUtils.isEmpty(str)
    }

    fun getTextFromEditText(editText: EditText?): String {
        return if (editText == null) "" else editText.getText().toString().trim { it <= ' ' }
    }

}