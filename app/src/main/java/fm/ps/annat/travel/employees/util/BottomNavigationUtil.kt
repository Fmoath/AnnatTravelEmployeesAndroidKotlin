package fm.ps.annat.travel.employees.util

import android.annotation.SuppressLint
import androidx.appcompat.view.menu.MenuItemImpl
import com.google.android.material.bottomnavigation.BottomNavigationView

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 2/22/2022
 * @InTheHour : 17 : 52 : 53
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
object BottomNavigationUtil {

    //==============================================================================================
    // Deselect ...
    @SuppressLint("RestrictedApi")
    fun BottomNavigationView.deselectAllItems() {
        val menu = this.menu
        for(i in 0 until menu.size()) {
            (menu.getItem(i) as? MenuItemImpl)?.let {
                it.isExclusiveCheckable = false
                it.isChecked = false
                it.isExclusiveCheckable = true
            }
        }
    }

}