package fm.ps.annat.travel.employees.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import fm.ps.annat.travel.employees.R
import fm.ps.annat.travel.employees.databinding.ActivitySignInBinding

class SignInActivity : BaseActivity() , View.OnClickListener {

    //==============================================================================================
    // Binding ...
    private lateinit var binding : ActivitySignInBinding

    //==============================================================================================
    // Variable ...

    //==============================================================================================
    // On Create ...
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView( this , R.layout.activity_sign_in)
        initializeActivity()
    }

    //==============================================================================================
    // Initialize Activity ...
    private fun initializeActivity(){
        binding.signInProgress.visibility = View.GONE
        listener()
    }

    //==============================================================================================
    // Listeners ...
    private fun listener(){

    }
    override fun onClick(view: View?) {
        when (view) {

        }
    }

}