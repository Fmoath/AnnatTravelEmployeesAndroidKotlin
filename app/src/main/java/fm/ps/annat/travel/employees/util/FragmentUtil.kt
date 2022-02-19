package fm.ps.annat.travel.employees.util

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 2/19/2022
 * @InTheHour : 23 : 58 : 05
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
object FragmentUtil {

    //==============================================================================================
    // Variables ...
    private lateinit var transaction: FragmentTransaction

    //==============================================================================================
    // Replace ...
    fun replaceFragment(fragment: Fragment, supportFragmentManager: FragmentManager, tag: String, container: Int, addToBackStack: Boolean) {
        transaction = supportFragmentManager.beginTransaction()
        if (!addToBackStack) {
            transaction.replace(container, fragment, tag)
        } else {
            transaction.replace(container, fragment, tag)
            transaction.addToBackStack(tag)
        }
        transaction.commit()
    }
}