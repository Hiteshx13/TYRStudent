package com.tyre.student.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.tyre.student.R
import com.tyre.student.databinding.ActivityNotificationsBinding

class NotificationsActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, NotificationsActivity::class.java)
            return intent
        }
    }

    lateinit var binding: ActivityNotificationsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_notifications)
        initialization()

    }

    fun initialization() {
        binding.ivBack.setOnClickListener {
            finish()
        }

    }


    override fun onClick(view: View?) {
        when (view?.id) {


        }
    }


}