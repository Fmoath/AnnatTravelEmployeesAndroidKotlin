package fm.ps.annat.travel.employees.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import fm.ps.annat.travel.employees.R
import fm.ps.annat.travel.employees.databinding.FragmentHomeBinding

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
class HomeFragment : BaseFragment() {

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

    }

    //==============================================================================================
    // Listener ...
    private fun listener() {

    }
}