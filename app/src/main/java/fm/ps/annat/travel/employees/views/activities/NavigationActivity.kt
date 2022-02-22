package fm.ps.annat.travel.employees.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import fm.ps.annat.travel.employees.R
import fm.ps.annat.travel.employees.databinding.ActivityNavigationBinding
import fm.ps.annat.travel.employees.keys.Variables

class NavigationActivity : BaseActivity()  , View.OnClickListener{


    //==============================================================================================
    // Binding ...
    private lateinit var binding : ActivityNavigationBinding

    //==============================================================================================
    // Variable ...
    private lateinit var extras : Bundle

    //==============================================================================================
    // On Create Activity ...
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView( this , R.layout.activity_navigation)
        initializeActivity()
    }

    //==============================================================================================
    // Initialize Activity ...
    private fun initializeActivity(){
        extras = intent.extras!!
        initializeViews()
        listeners()
    }

    private fun initializeViews(){
        binding.navigationTitle.text = extras.getString(Variables.TITLE)
        binding.navigationDescription.text = extras.getString(Variables.DESCRIPTION)
        binding.navigationHint.text = extras.getString(Variables.HINT)
        binding.navigationButton.text = extras.getString(Variables.TEXT_BUTTON)
    }

    //==============================================================================================
    // On Listener In Activity ...
    private fun listeners(){
        binding.navigationButton.setOnClickListener( this )
        binding.navigationSkip.setOnClickListener( this )
    }

    override fun onClick(view: View?) {
        when(view){
            binding.navigationButton -> startNewActivity(extras.getString(Variables.ACTIVITY).toString() , null , true )
            binding.navigationButton -> Toast.makeText( this , "تخطي دون تغيير كلمة المرور" , Toast.LENGTH_LONG).show()
        }
    }


}