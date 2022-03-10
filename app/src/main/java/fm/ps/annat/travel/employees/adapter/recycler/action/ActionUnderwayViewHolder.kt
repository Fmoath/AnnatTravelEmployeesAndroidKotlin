package fm.ps.annat.travel.employees.adapter.recycler.action

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import fm.ps.annat.travel.employees.adapter.recycler.BaseHolder
import fm.ps.annat.travel.employees.databinding.ItemActionUnderwayBinding
import fm.ps.annat.travel.employees.keys.Activities
import fm.ps.annat.travel.employees.model.Action

/**
 * Created With Love For : Anat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 3/10/2022
 * @InTheHour : 10 : 46 : 18
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
class ActionUnderwayViewHolder(private var binding: ItemActionUnderwayBinding) :
    BaseHolder(binding.root) , View.OnClickListener {

    //==============================================================================================
    // Model ...
    private lateinit var action: Action

    //==============================================================================================
    // Interface ...

    //==============================================================================================
    // On Create Item  ...
    fun createItem(action: Action) {
        this.action = action
        initializeItem()
    }

    //==============================================================================================
    // Initialize Item  ...
    private fun initializeItem() {
        initializeViews()
        listener()
    }

    private fun initializeViews() {
        binding.itemActionUnderwayTitle.text = action.getTitle()
        binding.itemActionUnderwayDate.text = action.getDate()
    }

    //==============================================================================================
    // Listener In Views  ...
    private fun listener() {
        binding.itemActionUnderway.setOnClickListener( this )
    }

    override fun onClick(view: View?) {
        if (view == binding.itemActionUnderway){
            startNewActivity(Activities.ACTION_ACTIVITY , null , false )
        }
    }
}
