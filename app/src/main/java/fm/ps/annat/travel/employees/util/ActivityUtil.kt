package fm.ps.annat.travel.employees.util

import android.app.Activity
import android.content.Intent
import android.os.Handler
import android.os.Looper
import fm.ps.annat.travel.employees.keys.Activities
import fm.ps.annat.travel.employees.keys.Application
import fm.ps.annat.travel.employees.keys.Variables

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 2/18/2022
 * @InTheHour : 22 : 04 : 55
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
object ActivityUtil {
    fun restart(activity: Activity) {
        val intent = activity.intent
        activity.finish()
        activity.startActivity(intent)
    }

    fun startNewActivity(activity: Activity, newActivity: String, extras: Intent?, clearStack: Boolean) {
        val intent = Intent(Application.PACKAGE_NAME)
        intent.addCategory(newActivity)

        if (clearStack) {
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        }
        if (extras != null) {
            intent.putExtras(extras)
        }
        activity.startActivity(intent)
        if (clearStack) {
            activity.finish()
        }
//        activity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
    }
    fun startNewActivity(activity: Activity, newActivity: String, delay: Long, extras: Intent?, clearStack: Boolean) {
        Handler(Looper.getMainLooper()).postDelayed({

            val intent = Intent(Application.PACKAGE_NAME)
            intent.addCategory(newActivity)

            if (clearStack) {
                intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            }
            if (extras != null) {
                intent.putExtras(extras)
            }

            activity.startActivity(intent)
            if (clearStack) {
                activity.finish()
            }
            //        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

        } , delay)
    }

    fun startNavigationActivity(activity: Activity, title: String, description: String, hint: String, textButton: String, newActivity: String) {
        val intent = Intent()
        intent.putExtra( Variables.TITLE , title)
        intent.putExtra( Variables.DESCRIPTION , description)
        intent.putExtra( Variables.HINT , hint)
        intent.putExtra( Variables.TEXT_BUTTON , textButton)
        intent.putExtra( Variables.ACTIVITY , newActivity)
        startNewActivity(activity , Activities.NAVIGATION_ACTIVITY , intent , true)
    }
}