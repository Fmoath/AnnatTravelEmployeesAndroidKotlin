package fm.ps.annat.travel.employees.adapter.recycler.contactus

import androidx.recyclerview.widget.RecyclerView
import fm.ps.annat.travel.employees.databinding.ItemContactUsDateBinding
import fm.ps.annat.travel.employees.model.ContactUs

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 3/9/2022
 * @InTheHour : 23 : 15 : 07
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
class ContactUsDateViewHolder(private var binding: ItemContactUsDateBinding) :
    RecyclerView.ViewHolder(binding.root) {

    //==============================================================================================
    // Model ...
    private lateinit var contactUs: ContactUs

    //==============================================================================================
    // Interface ...

    //==============================================================================================
    // On Create Item  ...
    fun createItem(contactUs: ContactUs) {
        this.contactUs = contactUs
        initializeItem()
    }

    //==============================================================================================
    // Initialize Item  ...
    private fun initializeItem() {
        initializeViews()
        listener()
    }

    private fun initializeViews() {
        binding.itemContactUsDateDate.text = contactUs.getDate()
    }

    //==============================================================================================
    // Listener In Views  ...
    private fun listener() {

    }
}