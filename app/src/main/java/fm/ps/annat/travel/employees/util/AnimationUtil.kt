package fm.ps.annat.travel.employees.util

import android.animation.Animator
import android.content.Context
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 2/20/2022
 * @InTheHour : 00 : 00 : 35
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
object AnimationUtil {

    //==============================================================================================
    // Use Animations With Views ...
    fun useAnimationWithView(view: View, animation: Animation){
        view.visibility = View.VISIBLE
        view.startAnimation(animation)
    }

    fun useAnimationWithView(view: View, animation: Animation, whatDoYouWantAfterTheAnimationVisibleOrInvisibleOrGoneView :Int ){
        view.visibility = View.VISIBLE
        view.startAnimation(animation)
        view.animate().setListener(object : Animator.AnimatorListener {
            override fun onAnimationRepeat(animation: Animator?) {}
            override fun onAnimationCancel(animation: Animator?) {}
            override fun onAnimationStart(animation: Animator?) {

            }
            override fun onAnimationEnd(animation: Animator?) {
                view.visibility = whatDoYouWantAfterTheAnimationVisibleOrInvisibleOrGoneView
            }
        })
    }

    //==============================================================================================
    // Animations ...
    fun getAnimationFromAnim(context : Context, anim :Int) : Animation {
        return AnimationUtils.loadAnimation(context, anim)
    }


}