package fm.ps.annat.travel.employees.adapter.recycler.action.pilgrism.start

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import fm.ps.annat.travel.employees.R
import fm.ps.annat.travel.employees.databinding.ItemPilgrismBinding
import fm.ps.annat.travel.employees.model.Pilgrism

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 3/10/2022
 * @InTheHour : 12 : 37 : 55
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
class ActionStartPilgrismRecyclerAdapter(private var pilgrism: ArrayList<Pilgrism>) : RecyclerView.Adapter<ActionPilgrismStartViewHolder>() {

    //==============================================================================================
    // Binding ...
    private lateinit var binding : ItemPilgrismBinding

    //==============================================================================================
    // On Create View Holder ...
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActionPilgrismStartViewHolder {
        binding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_pilgrism , parent, false)
        return ActionPilgrismStartViewHolder(binding)
    }

    //==============================================================================================
    // On Bind View Holder ...
    override fun onBindViewHolder(holder: ActionPilgrismStartViewHolder, position: Int) {
        holder.createItem(pilgrism[position])
    }

    //==============================================================================================
    // get Item Count ...
    override fun getItemCount(): Int = pilgrism.size

}