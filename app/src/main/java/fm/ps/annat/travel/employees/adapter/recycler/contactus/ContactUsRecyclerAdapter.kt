package fm.ps.annat.travel.employees.adapter.recycler.contactus

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import fm.ps.annat.travel.employees.R
import fm.ps.annat.travel.employees.databinding.ItemContactUsCompanyBinding
import fm.ps.annat.travel.employees.databinding.ItemContactUsDateBinding
import fm.ps.annat.travel.employees.databinding.ItemContactUsEmployeesBinding
import fm.ps.annat.travel.employees.keys.ContactUss
import fm.ps.annat.travel.employees.model.ContactUs

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 3/9/2022
 * @InTheHour : 23 : 16 : 02
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
class ContactUsRecyclerAdapter(private var contactuss: ArrayList<ContactUs>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    //==============================================================================================
    // Binding ...
    private lateinit var bindingEmployees : ItemContactUsEmployeesBinding
    private lateinit var bindingCompany : ItemContactUsCompanyBinding
    private lateinit var bindingDate : ItemContactUsDateBinding

    override fun getItemViewType(position: Int): Int {
        return contactuss[position].getType()
    }

    //==============================================================================================
    // On Create View Holder ...
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        bindingEmployees = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_contact_us_employees , parent, false)
        bindingCompany = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_contact_us_company , parent, false)
        bindingDate = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_contact_us_date , parent, false)
        return when(viewType){
            ContactUss.CONTACT_US_CLIENT -> ContactUsEmployeesViewHolder(bindingEmployees)
            ContactUss.CONTACT_US_COMPANY -> ContactUsCompanyViewHolder(bindingCompany)
            else -> ContactUsDateViewHolder(bindingDate)
        }
    }

    //==============================================================================================
    // On Bind View Holder ...
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder){
            is ContactUsEmployeesViewHolder -> (holder as ContactUsEmployeesViewHolder).createItem(contactuss[position])
            is ContactUsCompanyViewHolder -> (holder as ContactUsCompanyViewHolder).createItem(contactuss[position])
            is ContactUsDateViewHolder -> (holder as ContactUsDateViewHolder).createItem(contactuss[position])
        }
    }

    //==============================================================================================
    // get Item Count ...
    override fun getItemCount(): Int = contactuss.size

}