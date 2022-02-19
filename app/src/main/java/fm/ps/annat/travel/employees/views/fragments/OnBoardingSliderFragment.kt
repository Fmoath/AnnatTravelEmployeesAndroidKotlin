package fm.ps.annat.travel.employees.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import fm.ps.annat.travel.employees.R
import fm.ps.annat.travel.employees.databinding.FragmentOnBoardingBinding

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 2/19/2022
 * @InTheHour : 19 : 59 : 50
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
class OnBoardingSliderFragment : BaseFragment() {

    //==============================================================================================
    // Binding ...
    private lateinit var binding: FragmentOnBoardingBinding

    //==============================================================================================
    // Variable ...

    //==============================================================================================
    // On Create Fragment  ...
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_on_boarding, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
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