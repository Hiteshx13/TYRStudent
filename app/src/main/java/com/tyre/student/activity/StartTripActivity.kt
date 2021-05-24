package com.tyre.student.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.tyre.student.R
import com.tyre.student.databinding.ActivityStartTripBinding

class StartTripActivity : BaseActivity(), View.OnClickListener {

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, StartTripActivity::class.java)
            return intent
        }
    }

    lateinit var binding: ActivityStartTripBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_start_trip)
        initialization()

    }

    fun initialization() {
        binding.btnStartTrip.setOnClickListener(this)
        binding.ivBack.setOnClickListener(this)

    }


    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.ivBack->{
                finish()
            }
            R.id.btnStartTrip->{
//                launchActivity(EndTripActivity.getIntent(mContext))
                finish()
            }

        }
    }



}