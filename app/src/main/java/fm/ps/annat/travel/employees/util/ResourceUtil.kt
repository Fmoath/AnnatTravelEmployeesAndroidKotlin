package fm.ps.annat.travel.employees.util

import android.annotation.SuppressLint
import android.app.Activity
import android.graphics.drawable.Drawable

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 2/19/2022
 * @InTheHour : 23 : 59 : 20
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
object ResourceUtil {

    //==============================================================================================
    // String ...
    fun getResourcesString(activity: Activity, id: Int): String {
        return activity.resources.getString(id)
    }

    //==============================================================================================
    // Color ...
    fun getResourcesColor(activity: Activity, id: Int): Int {
        return activity.resources.getColor(id)
    }

    //==============================================================================================
    // Drawable ...
    @SuppressLint("UseCompatLoadingForDrawables")
    fun getResourcesDrawable(activity: Activity?, id: Int): Drawable {
        return activity?.resources?.getDrawable(id , activity.theme)!!
    }

}