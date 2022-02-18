package fm.ps.annat.travel.employees.views.activities

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import fm.ps.annat.travel.employees.util.ActivityUtil
import fm.ps.annat.travel.employees.util.DeviceUtil

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 2/18/2022
 * @InTheHour : 22 : 10 : 54
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
open class BaseActivity : AppCompatActivity() {


    //==============================================================================================
    // Activities ...
    fun restart() {
        ActivityUtil.restart(this )
    }
    fun startNewActivity(newActivity: String, extras: Intent?, clearStack: Boolean) {
        ActivityUtil.startNewActivity( this , newActivity , extras, clearStack)
    }
    fun startNewActivity(newActivity: String, delay: Long, extras: Intent?, clearStack: Boolean) {
        ActivityUtil.startNewActivity(this , newActivity , delay , extras, clearStack)
    }
    fun startNavigationActivity(title: String, description: String, hint: String, textButton: String, newActivity: String) {
        ActivityUtil.startNavigationActivity(this , title , description , hint, textButton , newActivity)
    }

    //==============================================================================================
    // Device ...
    /** Key Board **/
    fun isKeyboardVisible() : Boolean {
        return DeviceUtil.isKeyboardVisible(this)
    }
    fun hideKeyboard() {
        DeviceUtil.hideKeyboard( this)
    }

    /** Status Bar **/
    fun hideStatusBar() {
        DeviceUtil.hideStatusBar(this)
    }
    fun setStatusBarTransparent(activity: Activity) {
        DeviceUtil.setStatusBarTransparent(this)
    }
    fun changeStatusBarColor(color: Int) {
        DeviceUtil.changeStatusBarColor(this , color)
    }
    fun changeStatusBarIconsColor(shouldChangeStatusBarTintToDark: Boolean) {
        DeviceUtil.changeStatusBarIconsColor( this , shouldChangeStatusBarTintToDark)
    }

    /** Navigation Bar **/
    fun hideNavigationBar() {
        DeviceUtil.hideNavigationBar(this)
    }

}