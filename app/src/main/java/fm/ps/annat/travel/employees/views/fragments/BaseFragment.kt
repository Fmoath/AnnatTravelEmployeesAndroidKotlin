package fm.ps.annat.travel.employees.views.fragments

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.fragment.app.Fragment
import fm.ps.annat.travel.employees.util.ActivityUtil
import fm.ps.annat.travel.employees.util.DeviceUtil
import fm.ps.annat.travel.employees.util.FragmentUtil
import fm.ps.annat.travel.employees.util.ResourceUtil

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 2/19/2022
 * @InTheHour : 19 : 59 : 26
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
open class BaseFragment() : Fragment() {

    //==============================================================================================
    // Activities ...
    fun restart() {
        ActivityUtil.restart(requireActivity())
    }
    fun startNewActivity(newActivity: String, extras: Intent?, clearStack: Boolean) {
        ActivityUtil.startNewActivity( requireActivity() , newActivity , extras, clearStack)
    }
    fun startNewActivity(newActivity: String, delay: Long, extras: Intent?, clearStack: Boolean) {
        ActivityUtil.startNewActivity(requireActivity() , newActivity , delay , extras, clearStack)
    }
    fun startNavigationActivity(title: String, description: String, hint: String, textButton: String, newActivity: String) {
        ActivityUtil.startNavigationActivity(requireActivity() , title , description , hint, textButton , newActivity)
    }

    //==============================================================================================
    // Fragments ...
    fun replaceFragment(fragment: Fragment, tag: String, container: Int, addToBackStack: Boolean) {
        FragmentUtil.replaceFragment(fragment, requireActivity().supportFragmentManager , tag, container, addToBackStack)
    }

    //==============================================================================================
    // Device ...
    /** Key Board **/
    fun isKeyboardVisible() : Boolean {
        return DeviceUtil.isKeyboardVisible(requireActivity())
    }
    fun hideKeyboard() {
        DeviceUtil.hideKeyboard( requireActivity())
    }

    /** Status Bar **/
    fun hideStatusBar() {
        DeviceUtil.hideStatusBar(requireActivity())
    }
    fun setStatusBarTransparent() {
        DeviceUtil.setStatusBarTransparent(requireActivity())
    }
    fun changeStatusBarColor(color: Int) {
        DeviceUtil.changeStatusBarColor(requireActivity() , color)
    }
    fun changeStatusBarIconsColor(shouldChangeStatusBarTintToDark: Boolean) {
        DeviceUtil.changeStatusBarIconsColor( requireActivity() , shouldChangeStatusBarTintToDark)
    }

    /** Navigation Bar **/
    fun hideNavigationBar() {
        DeviceUtil.hideNavigationBar(requireActivity())
    }

    //==============================================================================================
    // Resources ...
    fun getResourcesString(id: Int) : String{
        return ResourceUtil.getResourcesString( requireActivity() , id)
    }
    fun getResourcesColor(id: Int) : Int{
        return ResourceUtil.getResourcesColor( requireActivity() , id)
    }
    fun getResourcesDrawable(id: Int) : Drawable {
        return ResourceUtil.getResourcesDrawable( requireActivity() , id)
    }

}