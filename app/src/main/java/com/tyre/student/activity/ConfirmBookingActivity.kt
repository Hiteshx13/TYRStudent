package com.tyre.student.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.tyre.student.R
import com.tyre.student.databinding.ActivityConfirmBookingBinding
import com.tyre.student.databinding.ActivityFaqBinding

class ConfirmBookingActivity : BaseActivity(), View.OnClickListener {

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, ConfirmBookingActivity::class.java)
            return intent
        }
    }

    lateinit var binding: ActivityConfirmBookingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_confirm_booking)
        initialization()

    }

    fun initialization() {
        binding.ivBack.setOnClickListener {
            finish()
        }
        binding.btnConfirmBooking.setOnClickListener {
            launchActivity(ConfirmBookingMessageActivity.getIntent(mContext))
            finish()
        }

    }


    override fun onClick(view: View?) {
        when (view?.id) {


        }
    }


}