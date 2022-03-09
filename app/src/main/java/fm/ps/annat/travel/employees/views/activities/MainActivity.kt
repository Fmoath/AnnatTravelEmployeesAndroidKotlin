package fm.ps.annat.travel.employees.views.activities

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationBarView
import fm.ps.annat.travel.employees.R
import fm.ps.annat.travel.employees.databinding.ActivityMainBinding
import fm.ps.annat.travel.employees.keys.Locations
import fm.ps.annat.travel.employees.util.BottomNavigationUtil.deselectAllItems
import fm.ps.annat.travel.employees.views.fragments.ContactUsFragment
import fm.ps.annat.travel.employees.views.fragments.HomeFragment
import fm.ps.annat.travel.employees.views.fragments.LocationFragment

class MainActivity : BaseActivity() , View.OnClickListener , NavigationBarView.OnItemSelectedListener {

    //==============================================================================================
    // Binding ...
    private lateinit var binding : ActivityMainBinding

    //==============================================================================================
    // Variable ...

    //==============================================================================================
    // On Create ...
    override fun onCreate(savedInstanceState: Bundle?) {
        changeStatusBarIconsColor( true )
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView( this , R.layout.activity_main)
        initializeActivity()
    }

    //==============================================================================================
    // Initialize Activity ...
    private fun initializeActivity(){
        initializeViews()
        listener()
        replaceFragment( HomeFragment() , "home_fragment")
    }

    private fun initializeViews(){
        binding.mainBottomBarOption.selectedItemId = R.id.main_menu_home
    }

    //==============================================================================================
    // Listener Views In Activity ...
    private fun listener(){
        binding.fragmentHomeProfile.setOnClickListener( this )
        binding.mainBottomBarOption.setOnItemSelectedListener( this )
    }

    override fun onClick(view: View?) {
        if (view == binding.fragmentHomeProfile){
            binding.fragmentHomeProfile.isSelected = true
            binding.mainBottomBarOption.deselectAllItems()
            //replaceFragment( ProfileFragment() , "profile_fragment")
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.main_menu_home -> {
                replaceFragment( HomeFragment() , "home_fragment")
                true
            }
            R.id.main_menu_location -> {
                replaceFragment( LocationFragment(Locations.LOCATION_FULL) , "location_fragment")
                true
            }
            R.id.main_menu_contact_us -> {
                replaceFragment( ContactUsFragment() , "contact_us_fragment")
                true
            }
            R.id.main_menu_notification -> {
                //replaceFragment( NotificationFragment() , "notification_fragment")
                true
            }
            R.id.main_menu_setting -> {
                //replaceFragment( SettingFragment() , "setting_fragment")
                true
            }
            else -> false
        }
    }

    //==============================================================================================
    // More ...
    private fun replaceFragment(fragment: Fragment, tag: String) {
        binding.fragmentHomeProfile.isSelected = false
        replaceFragment(fragment, tag , R.id.main_container , true)
    }
}