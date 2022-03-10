package fm.ps.annat.travel.employees.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import fm.ps.annat.travel.employees.R
import fm.ps.annat.travel.employees.databinding.FragmentHomeBinding
import fm.ps.annat.travel.employees.keys.Activities
import fm.ps.annat.travel.employees.keys.Recyclers

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 3/9/2022
 * @InTheHour : 11 : 42 : 27
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
class HomeFragment : BaseFragment() , View.OnClickListener{

    //==============================================================================================
    // Binding ...
    private lateinit var binding: FragmentHomeBinding

    //==============================================================================================
    // Variable ...

    //==============================================================================================
    // On Create Fragment  ...
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initializeFragment()
    }

    //==============================================================================================
    // Initialize Fragment ...
    private fun initializeFragment() {
        initializeView()
        listener()
    }

    private fun initializeView() {
        replaceFragment( RecyclerFragment(Recyclers.RECYCLER_ACTION) , "actions_recycler")
    }

    //==============================================================================================
    // Listener ...
    private fun listener() {
        binding.fragmentHomeViewAllAction.setOnClickListener( this )
    }

    override fun onClick(view: View?) {
        if (view == binding.fragmentHomeViewAllAction){
            startNewActivity(Activities.ACTION_ACTIVITY , null , false)
        }
    }

    //==============================================================================================
    // More Function ...
    private fun replaceFragment(fragment: Fragment, tag: String) {
        replaceFragment(fragment , tag , R.id.fragment_home_container , true)
    }
}