package com.tyre.student.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.tyre.student.R
import com.tyre.student.databinding.ActivityConfBookingMessageBinding
import com.tyre.student.databinding.ActivityConfirmBookingBinding

class ConfirmBookingMessageActivity : BaseActivity(), View.OnClickListener {

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, ConfirmBookingMessageActivity::class.java)
            return intent
        }
    }

    lateinit var binding: ActivityConfBookingMessageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_conf_booking_message)
        initialization()

    }

    fun initialization() {
        binding.ivClose.setOnClickListener(this)
        binding.btnGoToBookings.setOnClickListener(this)

    }


    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.ivClose -> {
                finish()
            }
            R.id.btnGoToBookings -> {

            }

        }
    }


}