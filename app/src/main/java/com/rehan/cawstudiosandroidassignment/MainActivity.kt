package com.rehan.cawstudiosandroidassignment

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.AutoTransition
import android.transition.TransitionManager
import android.view.View
import androidx.databinding.DataBindingUtil
import com.rehan.cawstudiosandroidassignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        view1()
        view2()
        view3()
    }

    private fun view1(){
        binding.iconUp1.setOnClickListener {
            // If the CardView is already expanded, set its visibility to gone and change the expand more icon to expand less icon
            if (binding.hiddenCardView1.visibility == View.VISIBLE) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    TransitionManager.beginDelayedTransition(binding.hiddenCardView1, AutoTransition())
                }
                binding.hiddenCardView1.visibility = View.GONE
                binding.iconUp1.setImageResource(R.drawable.arrow_up)
            } else {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    TransitionManager.beginDelayedTransition(binding.hiddenCardView1, AutoTransition())
                }
                binding.hiddenCardView1.visibility = View.VISIBLE
                binding.iconUp1.setImageResource(R.drawable.arrow_down)

                // Hiding CardViews of other views if it is expanded
                binding.hiddenCardView2.visibility = View.GONE
                binding.hiddenCardView3.visibility = View.GONE
            }
        }
    }

    private fun view2(){
        binding.iconUp2.setOnClickListener {
            // If the CardView is already expanded, set its visibility to gone and change the expand more icon to expand less icon
            if (binding.hiddenCardView2.visibility == View.VISIBLE) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    TransitionManager.beginDelayedTransition(binding.hiddenCardView2, AutoTransition())
                }
                binding.hiddenCardView2.visibility = View.GONE
                binding.iconUp2.setImageResource(R.drawable.arrow_up)
            } else {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    TransitionManager.beginDelayedTransition(binding.hiddenCardView2, AutoTransition())
                }
                binding.hiddenCardView2.visibility = View.VISIBLE
                binding.iconUp2.setImageResource(R.drawable.arrow_down)

                // Hiding CardViews of other views if it is expanded
                binding.hiddenCardView1.visibility = View.GONE
                binding.hiddenCardView3.visibility = View.GONE
            }
        }
    }

    private fun view3(){
        binding.iconUp3.setOnClickListener {
            // If the CardView is already expanded, set its visibility to gone and change the expand more icon to expand less icon
            if (binding.hiddenCardView3.visibility == View.VISIBLE) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    TransitionManager.beginDelayedTransition(binding.hiddenCardView3, AutoTransition())
                }
                binding.hiddenCardView3.visibility = View.GONE
                binding.iconUp3.setImageResource(R.drawable.arrow_up)
            } else {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    TransitionManager.beginDelayedTransition(binding.hiddenCardView3, AutoTransition())
                }
                binding.hiddenCardView3.visibility = View.VISIBLE
                binding.iconUp3.setImageResource(R.drawable.arrow_down)

                // Hiding CardViews of other views if it is expanded
                binding.hiddenCardView1.visibility = View.GONE
                binding.hiddenCardView2.visibility = View.GONE
            }
        }
    }
}