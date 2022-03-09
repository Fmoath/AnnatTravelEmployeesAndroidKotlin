package fm.ps.annat.travel.employees.adapter.recycler.notification

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import fm.ps.annat.travel.employees.R
import fm.ps.annat.travel.employees.databinding.ItemNotificationBinding
import fm.ps.annat.travel.employees.model.Notification

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 3/9/2022
 * @InTheHour : 22 : 54 : 34
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
class NotificationRecyclerAdapter (private var notifications: ArrayList<Notification>) : RecyclerView.Adapter<NotificationViewHolder>() {

    //==============================================================================================
    // Binding ...
    private lateinit var binding : ItemNotificationBinding

    //==============================================================================================
    // On Create View Holder ...
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationViewHolder {
        binding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_notification , parent, false)
        return NotificationViewHolder(binding)
    }

    //==============================================================================================
    // On Bind View Holder ...
    override fun onBindViewHolder(holder: NotificationViewHolder, position: Int) {
        holder.createItem(notifications[position])
    }

    //==============================================================================================
    // get Item Count ...
    override fun getItemCount(): Int = notifications.size

}