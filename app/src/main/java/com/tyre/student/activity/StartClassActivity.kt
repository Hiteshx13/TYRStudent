package com.tyre.student.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.tyre.student.R
import com.tyre.student.databinding.ActivityStartClassBinding

class StartClassActivity : BaseActivity(), View.OnClickListener {

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, StartClassActivity::class.java)
            return intent
        }
    }

    lateinit var binding: ActivityStartClassBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_start_class)
        initialization()

    }

    fun initialization() {
        binding.btnStartClass.setOnClickListener(this)
        binding.ivBack.setOnClickListener(this)

    }


    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.ivBack->{
                finish()
            }
            R.id.btnStartClass->{
                launchActivity(PaymentActivity.getIntent(mContext))
                finish()
            }

        }
    }



}