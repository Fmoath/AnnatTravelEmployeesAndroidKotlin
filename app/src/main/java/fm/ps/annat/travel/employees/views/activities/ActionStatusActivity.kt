package fm.ps.annat.travel.employees.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import fm.ps.annat.travel.employees.R
import fm.ps.annat.travel.employees.databinding.ActivityActionStatusBinding
import fm.ps.annat.travel.employees.keys.ActionStatus

class ActionStatusActivity : AppCompatActivity() {

    //==============================================================================================
    // Binding ...
    private lateinit var binding : ActivityActionStatusBinding

    //==============================================================================================
    // Variable ...
    private var status : Int = 0

    //==============================================================================================
    // On Create Activity ...
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView( this , R.layout.activity_action_status)
        initializeActivity()
    }

    //==============================================================================================
    // Initialize Activity ...
    private fun initializeActivity(){
        status = intent.extras?.getInt(ActionStatus.ACTION_STATUS)!!

        initializeViews()
    }
    private fun initializeViews(){
        when(status){
            ActionStatus.ACTION_START -> initializeStartAction()
            ActionStatus.ACTION_END -> initializeEndAction()
        }
    }

    //==============================================================================================
    // On Listener In Activity ...

    //==============================================================================================
    // More Function...
    private fun initializeStartAction(){
        binding.actionStatusTitle.text = "بدء إجراء إستقبال المعتمرين من المطار"
        binding.actionStatusApplyAll.text = "بدء الإجراء للجميع"
    }

    private fun initializeEndAction(){
        binding.actionStatusTitle.text = "إنهاء إجراء إستقبال المعتمرين من المطار"
        binding.actionStatusApplyAll.text = "إنهاء الإجراء للجميع"
    }
}