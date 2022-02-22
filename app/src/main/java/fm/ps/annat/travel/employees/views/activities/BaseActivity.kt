package fm.ps.annat.travel.employees.views.activities

import android.app.Activity
import android.content.Intent
import android.graphics.drawable.Drawable
import android.view.View
import android.view.animation.Animation
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import fm.ps.annat.travel.employees.util.*

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
    // Fragments ...
    fun replaceFragment(fragment: Fragment, tag: String, container: Int, addToBackStack: Boolean) {
        FragmentUtil.replaceFragment(fragment, supportFragmentManager , tag, container, addToBackStack)
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

    //==============================================================================================
    // Views ...
    fun disabledViews(vararg views: View){
        ViewsUtil.disabledViews(*views)
    }
    fun enabledViews(vararg views: View){
        ViewsUtil.enabledViews(*views)
    }

    //==============================================================================================
    // Resources ...
    fun getResourcesString(id: Int) : String{
        return ResourceUtil.getResourcesString( this , id)
    }
    fun getResourcesColor(id: Int) : Int{
        return ResourceUtil.getResourcesColor( this , id)
    }
    fun getResourcesDrawable(id: Int) : Drawable {
        return ResourceUtil.getResourcesDrawable( this , id)
    }

    //==============================================================================================
    // Animation ...
    fun useAnimationWithView(view: View, anim: Int){
        AnimationUtil.useAnimationWithView( view , getAnimationFromAnim(anim))
    }
    fun useAnimationWithView(view: View, anim: Int, whatDoYouWanAfterTheAnimationVisibleOrInvisibleOrGoneView :Int){
        AnimationUtil.useAnimationWithView( view , getAnimationFromAnim(anim) , whatDoYouWanAfterTheAnimationVisibleOrInvisibleOrGoneView)
    }
    private fun getAnimationFromAnim(anim :Int) : Animation {
        return AnimationUtil.getAnimationFromAnim(this , anim)
    }

}