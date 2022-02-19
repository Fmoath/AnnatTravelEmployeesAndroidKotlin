package fm.ps.annat.travel.employees.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.viewpager.widget.ViewPager
import fm.ps.annat.travel.employees.R
import fm.ps.annat.travel.employees.adapter.pager.SliderPagerAdapter
import fm.ps.annat.travel.employees.databinding.ActivityOnBoardingBinding
import fm.ps.annat.travel.employees.keys.Activities
import fm.ps.annat.travel.employees.views.fragments.OnBoardingSliderFragment

class OnBoardingActivity : BaseActivity() , View.OnClickListener {

    //==============================================================================================
    // Binding ...
    private lateinit var binding : ActivityOnBoardingBinding

    //==============================================================================================
    // Slider ...
    private lateinit var sliderPagerAdapter: SliderPagerAdapter

    //==============================================================================================
    // Variables ...
    private var isItInTheLastInterface :Boolean = false

    //==============================================================================================
    // On Create ...
    override fun onCreate(savedInstanceState: Bundle?) {
        changeStatusBarIconsColor(true)
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView( this , R.layout.activity_on_boarding)
        initializeActivity()
    }

    //==============================================================================================
    // Initialize Activity ...
    private fun initializeActivity(){
        sliderPagerAdapter = SliderPagerAdapter(supportFragmentManager)
        initializeViews()
        setupPagerAdapter()
        listener()
    }

    private fun initializeViews(){
        binding.onBoardingGetStarted.visibility = View.GONE
    }

    //==============================================================================================
    // Listeners ...
    private fun listener() {
        binding.onBoardingSkip.setOnClickListener(this)
        binding.onBoardingGetStarted.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view){
            binding.onBoardingSkip -> binding.onBoardingContainer.currentItem = binding.onBoardingContainer.currentItem + 1
            binding.onBoardingGetStarted -> startNewActivity(Activities.SIGN_IN_ACTIVITY , null , false)
        }
    }

    //==============================================================================================
    //Start Initialize On Boarding ...
    private fun setupPagerAdapter() {
        sliderPagerAdapter.addFragment(prepareIntroSliders(R.drawable.im_on_boarding , R.string.on_boarding_title_one , R.string.on_boarding_description_one ), "INTRO SCREEN")
        sliderPagerAdapter.addFragment(prepareIntroSliders(R.drawable.im_on_boarding , R.string.on_boarding_title_two , R.string.on_boarding_description_two ), "INTRO SCREEN")
        sliderPagerAdapter.addFragment(prepareIntroSliders(R.drawable.im_on_boarding , R.string.on_boarding_title_three , R.string.on_boarding_description_three ), "INTRO SCREEN")
        sliderPagerAdapter.addFragment(prepareIntroSliders(R.drawable.im_on_boarding , R.string.on_boarding_title_four , R.string.on_boarding_description_four ), "INTRO SCREEN")
        sliderPagerAdapter.addFragment(prepareIntroSliders(R.drawable.im_on_boarding , R.string.on_boarding_title_five, R.string.on_boarding_description_five ), "INTRO SCREEN")

//        binding.onBoardingContainer.setPageTransformer(true, ZoomOutPagerTransformer())
        binding.onBoardingContainer.adapter = sliderPagerAdapter
        sliderPagerAdapter.notifyDataSetChanged()
        binding.onBoardingContainer.addOnPageChangeListener(
            viewPagerPageChangeListener
        )
        binding.onBoardingDots.setViewPager(binding.onBoardingContainer)
    }

    private fun prepareIntroSliders( imageName: Int , title: Int , description: Int): OnBoardingSliderFragment {
        val outBoardingSliderFragment = OnBoardingSliderFragment()
        val bundle = Bundle()
        bundle.putInt("image", imageName)
        bundle.putInt("title", title)
        bundle.putInt("description", description)
        outBoardingSliderFragment.arguments = bundle
        return outBoardingSliderFragment
    }

    private var viewPagerPageChangeListener : ViewPager.OnPageChangeListener = object :
        ViewPager.OnPageChangeListener {
        override fun onPageScrolled( position: Int , positionOffset: Float , positionOffsetPixels: Int ) {
        }

        override fun onPageSelected(position: Int) {
            if(position == sliderPagerAdapter.count-1){
                isItInTheLastInterface = true
                useAnimationWithView(binding.onBoardingSkip , R.anim.fade_out , View.GONE)
                useAnimationWithView(binding.onBoardingGetStarted , R.anim.fade_in)
            }
            else if(position == sliderPagerAdapter.count-2){
                if (isItInTheLastInterface){
                    useAnimationWithView(binding.onBoardingSkip , R.anim.fade_in)
                    useAnimationWithView(binding.onBoardingGetStarted , R.anim.fade_out)
                }
                isItInTheLastInterface = false
            }
        }

        override fun onPageScrollStateChanged(state: Int) {}
    }
}