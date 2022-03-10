package fm.ps.annat.travel.employees.adapter.recycler.action.pilgrism.end

import androidx.recyclerview.widget.RecyclerView
import fm.ps.annat.travel.employees.databinding.ItemPilgrismBinding
import fm.ps.annat.travel.employees.model.Pilgrism

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 3/10/2022
 * @InTheHour : 12 : 40 : 38
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
class ActionPilgrismEndViewHolder(private var binding: ItemPilgrismBinding) : RecyclerView.ViewHolder(binding.root) {

    //==============================================================================================
    // Model ...
    private lateinit var pilgrism: Pilgrism

    //==============================================================================================
    // Interface ...

    //==============================================================================================
    // On Create Item  ...
    fun createItem(pilgrism: Pilgrism) {
        this.pilgrism = pilgrism
        initializeItem()
    }

    //==============================================================================================
    // Initialize Item  ...
    private fun initializeItem() {
        initializeViews()
        listener()
    }

    private fun initializeViews() {
        binding.itemPilgrismName.text = pilgrism.getName()
        binding.itemPilgrismPassport.text = pilgrism.getPassport()
        binding.itemPilgrismSwitcher.setChecked(false , withAnimation = false)
    }

    //==============================================================================================
    // Listener In Views  ...
    private fun listener() {

    }
}