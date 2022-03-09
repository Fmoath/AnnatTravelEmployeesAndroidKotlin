package fm.ps.annat.travel.employees.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import fm.ps.annat.travel.employees.R
import fm.ps.annat.travel.employees.databinding.ActivityActionBinding

class ActionActivity : BaseActivity() {

    //==============================================================================================
    // Binding ...
    private lateinit var binding : ActivityActionBinding

    //==============================================================================================
    // Variable ...

    //==============================================================================================
    // On Create Activity ...
    override fun onCreate(savedInstanceState: Bundle?) {
        changeStatusBarIconsColor( true )
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView( this , R.layout.activity_action)
        initializeActivity()
    }

    //==============================================================================================
    // Initialize Activity ...
    private fun initializeActivity(){

    }

    //==============================================================================================
    // On Listener In Activity ...
}