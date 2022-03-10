package fm.ps.annat.travel.employees.adapter.recycler.action

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import fm.ps.annat.travel.employees.R
import fm.ps.annat.travel.employees.databinding.ItemActionCompletedBinding
import fm.ps.annat.travel.employees.databinding.ItemActionDidNotStartBinding
import fm.ps.annat.travel.employees.databinding.ItemActionUnderwayBinding
import fm.ps.annat.travel.employees.keys.ActionStatus
import fm.ps.annat.travel.employees.model.Action

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 3/10/2022
 * @InTheHour : 10 : 49 : 29
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
class ActionRecyclerAdapter (private var actions: ArrayList<Action>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    //==============================================================================================
    // Binding ...
    private lateinit var bindingCompleted : ItemActionCompletedBinding
    private lateinit var bindingUnderway : ItemActionUnderwayBinding
    private lateinit var bindingDidNotStart : ItemActionDidNotStartBinding

    override fun getItemViewType(position: Int): Int {
        return actions[position].getType()
    }

    //==============================================================================================
    // On Create View Holder ...
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        bindingCompleted = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_action_completed , parent, false)
        bindingUnderway = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_action_underway , parent, false)
        bindingDidNotStart = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_action_did_not_start , parent, false)
        return when(viewType){
            ActionStatus.ACTION_COMPLETED -> ActionCompletedViewHolder(bindingCompleted)
            ActionStatus.ACTION_UNDERWAY -> ActionUnderwayViewHolder(bindingUnderway)
            else -> ActionDidNotStartViewHolder(bindingDidNotStart)
        }
    }

    //==============================================================================================
    // On Bind View Holder ...
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder){
            is ActionCompletedViewHolder -> (holder as ActionCompletedViewHolder).createItem(actions[position])
            is ActionUnderwayViewHolder -> (holder as ActionUnderwayViewHolder).createItem(actions[position])
            is ActionDidNotStartViewHolder -> (holder as ActionDidNotStartViewHolder).createItem(actions[position])
        }
    }

    //==============================================================================================
    // get Item Count ...
    override fun getItemCount(): Int = actions.size

}