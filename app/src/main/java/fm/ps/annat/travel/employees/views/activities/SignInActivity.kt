package fm.ps.annat.travel.employees.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import fm.ps.annat.travel.employees.R
import fm.ps.annat.travel.employees.databinding.ActivitySignInBinding
import fm.ps.annat.travel.employees.keys.Activities
import fm.ps.annat.travel.employees.repository.SignInRepository

class SignInActivity : BaseActivity() , View.OnClickListener {

    //==============================================================================================
    // Binding ...
    private lateinit var binding : ActivitySignInBinding

    //==============================================================================================
    // Variable ...
    private lateinit var signInRepository : SignInRepository

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
        signInRepository = SignInRepository( binding.signInEmail , binding.signInPassword)

        initializeViews()

        listener()
    }
    private fun initializeViews(){
        binding.signInProgress.visibility = View.GONE
    }

    //==============================================================================================
    // Listeners ...
    private fun listener(){
        binding.signIn.setOnClickListener( this )
        binding.signInForgetPassword.setOnClickListener( this )
    }
    override fun onClick(view: View?) {
        when (view) {
            binding.signIn -> signUp()
            binding.signInForgetPassword -> Toast.makeText( this , "ستصلك رسالة على هاتفك المدخل لدينا تتضمن كلمة المرور" , Toast.LENGTH_LONG).show()
        }
    }

    //==============================================================================================
    // Sign In User ...
    private fun signUp(){
        val sign = signInRepository.signIn()
        useAnimationWithView(binding.signIn , R.anim.fade_out)
        useAnimationWithView(binding.signInProgress , R.anim.fade_in)
        if(sign){
            startNavigationActivity( "تم تسجيل الدخول بنجاح" , "لقد تم تسجيل دخولك بنجاح نتمنى ان تقوةم بمراجعة بريدك الإلكتروني من اجل تنشيط حسابك" , "كل الإحترام والتقدير لكم" , "متابعة" , Activities.MAIN_ACTIVITY )
        }else{
            useAnimationWithView(binding.signIn , R.anim.fade_in)
            useAnimationWithView(binding.signInProgress , R.anim.fade_out)
            Toast.makeText( this , "Error" , Toast.LENGTH_LONG).show()
        }
    }

}