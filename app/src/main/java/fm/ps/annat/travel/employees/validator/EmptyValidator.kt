package fm.ps.annat.travel.employees.validator

import android.widget.EditText
import fm.ps.annat.travel.employees.abstract.ValidatorAbstract
import fm.ps.annat.travel.employees.keys.Messages
import fm.ps.annat.travel.employees.util.EditTextUtil

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 2/20/2022
 * @InTheHour : 01 : 04 : 20
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
class EmptyValidator(private var editText: EditText) : ValidatorAbstract(editText) {

    override val isValid: Boolean
        get() {
            if (EditTextUtil.isEmpty(editText)) {
                editText.error = getErrorMessage(editText)
                return false
            }
            editText.error = null
            return true
        }

    private fun getErrorMessage(editText: EditText): String {
        return editText.context.getString(Messages.ERROR_MESSAGE_EMPTY, editText.hint)
    }

}