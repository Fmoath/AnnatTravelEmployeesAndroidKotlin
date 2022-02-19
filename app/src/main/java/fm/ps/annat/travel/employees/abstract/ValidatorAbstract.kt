package fm.ps.annat.travel.employees.abstract

import android.view.View

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 2/20/2022
 * @InTheHour : 01 : 06 : 52
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
abstract class ValidatorAbstract(var view: View) {

    abstract val isValid: Boolean

    fun requestFocus() {
        view.requestFocus()
    }

}