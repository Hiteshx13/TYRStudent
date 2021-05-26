package com.tyre.student.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.tyre.student.R
import com.tyre.student.databinding.ActivitySignupBinding

class SignUpActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, SignUpActivity::class.java)
            return intent
        }
    }

    lateinit var binding: ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_signup)
        initialization()

    }

    fun initialization() {
        binding.btnSignUp.setOnClickListener(this)
        binding.tvSignIn.setOnClickListener(this)

    }


    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.tvSignIn -> {
                startActivity(LoginActivity.getIntent(this))
                finish()
            }

            R.id.btnSignUp -> {
                startActivity(LoginMapActivity.getIntent(this))
                finish()
            }
        }
    }


}