package fm.ps.annat.travel.employees.views.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import fm.ps.annat.travel.employees.R
import fm.ps.annat.travel.employees.databinding.ActivityActionBinding
import fm.ps.annat.travel.employees.keys.ActionStatus
import fm.ps.annat.travel.employees.keys.Activities

class ActionActivity : BaseActivity() , View.OnClickListener{

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
        initializeViews()
        listener()
    }

    private fun initializeViews(){

    }

    //==============================================================================================
    // On Listener In Activity ...
    private fun listener(){
        binding.actionStart.setOnClickListener( this )
        binding.actionEnd.setOnClickListener( this )
    }

    override fun onClick(view: View?) {
        when(view){
            binding.actionStart -> startActionStatusActivity(ActionStatus.ACTION_START)
            binding.actionEnd -> startActionStatusActivity(ActionStatus.ACTION_END)
        }
    }

    //==============================================================================================
    // More Function ...
    private fun startActionStatusActivity(status: Int){
        val intent = Intent()
        intent.putExtra( ActionStatus.ACTION_STATUS , status )
        startNewActivity(Activities.ACTION_STATUS_ACTIVITY , intent , false)
    }
}