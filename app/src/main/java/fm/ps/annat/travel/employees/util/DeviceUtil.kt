package fm.ps.annat.travel.employees.util

import android.app.Activity
import android.os.Build
import android.view.View
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 2/18/2022
 * @InTheHour : 22 : 02 : 35
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
class DeviceUtil {
    //==============================================================================================
    // Key Board ...
    private var inputMethodManager: InputMethodManager? = null
    fun isKeyboardVisible(activity: Activity) : Boolean{
        inputMethodManager = activity.getSystemService(AppCompatActivity.INPUT_METHOD_SERVICE) as InputMethodManager
        return inputMethodManager!!.isAcceptingText
    }
    fun hideKeyboard(activity: Activity) {
        try {
            inputMethodManager = activity.getSystemService(AppCompatActivity.INPUT_METHOD_SERVICE) as InputMethodManager
            if (inputMethodManager != null) {
                inputMethodManager!!.hideSoftInputFromWindow(activity.currentFocus!!.windowToken, 0)
            }
        } catch (e: Exception) {
        }
    }

    //==============================================================================================
    // Status Bar ...
    fun hideStatusBar(activity: Activity) {
        activity.window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
    }
    fun setStatusBarTransparent(activity: Activity) {
        val w = activity.window
        w.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        w.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION)
    }
    fun changeStatusBarColor(activity: Activity, color: Int) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            activity.window.statusBarColor = activity.resources.getColor(color, activity.theme)
        } else
            activity.window.statusBarColor = activity.resources.getColor(color)
    }
    fun changeStatusBarIconsColor(activity: Activity, shouldChangeStatusBarTintToDark: Boolean) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            val decor = activity.window.decorView
            if (shouldChangeStatusBarTintToDark) {
                decor.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
            } else {
                decor.systemUiVisibility = 0
            }
        }
    }

    //==============================================================================================
    // Navigation Bar ...
    fun hideNavigationBar(activity: Activity) {
        val decorView = activity.window.decorView
        val uiOptions = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN)
        decorView.systemUiVisibility = uiOptions
    }
}