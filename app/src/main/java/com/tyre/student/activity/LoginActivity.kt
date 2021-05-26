package com.tyre.student.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.tyre.student.R
import com.tyre.student.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, LoginActivity::class.java)
            return intent
        }
    }

    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        initialization()

    }

    fun initialization() {
        binding.btnSignIn.setOnClickListener(this)
        binding.txtSignUp.setOnClickListener(this)

    }


    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.btnSignIn -> {
                startActivity(MainActivity.getIntent(this))
                finish()
            }
            R.id.txtSignUp -> {
                startActivity(SignUpActivity.getIntent(this))
                finish()
            }

        }
    }


}