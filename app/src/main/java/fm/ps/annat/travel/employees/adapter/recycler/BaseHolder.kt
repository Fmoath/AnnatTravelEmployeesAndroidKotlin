package fm.ps.annat.travel.employees.adapter.recycler

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import android.content.Intent
import android.view.View
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import fm.ps.annat.travel.employees.util.ActivityUtil

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 3/10/2022
 * @InTheHour : 13 : 03 : 37
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
open class BaseHolder(private var view : View) : RecyclerView.ViewHolder(view)  {

    //==============================================================================================
    // Activities ...
    fun restart() {
        ActivityUtil.restart( itemView.context.findActivity() )
    }
    fun startNewActivity(newActivity: String, extras: Intent?, clearStack: Boolean) {
        ActivityUtil.startNewActivity( itemView.context.findActivity() , newActivity , extras, clearStack)
    }
    fun startNewActivity(newActivity: String, delay: Long, extras: Intent?, clearStack: Boolean) {
        ActivityUtil.startNewActivity( itemView.context.findActivity() , newActivity , delay , extras, clearStack)
    }
    fun startNavigationActivity(title: String, description: String, hint: String, textButton: String, newActivity: String) {
        ActivityUtil.startNavigationActivity( itemView.context.findActivity() , title , description , hint, textButton , newActivity)
    }

    private tailrec fun Context.findActivity(): Activity {
        if (this is Activity) {
            @Suppress("UNCHECKED_CAST")
            return this
        } else {
            if (this is ContextWrapper) {
                return this.baseContext.findActivity()
            }
            throw IllegalStateException("The context chain does not contain Activity!")
        }
    }
}