package com.tyre.student.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.tyre.student.R
import com.tyre.student.databinding.ActivityInstructorsDetailsBinding

class InstructorsDetailsActivity : BaseActivity(), View.OnClickListener {

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, InstructorsDetailsActivity::class.java)
            return intent
        }
    }

    lateinit var binding: ActivityInstructorsDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_instructors_details)
        initialization()

    }

    fun initialization() {
        binding.ivBack.setOnClickListener(this)
        binding.btnBookAClass.setOnClickListener(this)
        binding.llChat.setOnClickListener(this)

    }


    override fun onClick(view: View?) {
        when (view?.id) {

            R.id.ivBack -> {
                finish()
            }
            R.id.btnBookAClass -> {
                finish()
                launchActivity(CalenderActivity.getIntent(mContext))
            }

            R.id.llChat -> {
                launchActivity(ChatActivity.getIntent(mContext))
            }


        }
    }


}