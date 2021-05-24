package com.tyre.student.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.tyre.student.R
import com.tyre.student.databinding.ActivityEditProfileBinding

class EditProfileActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, EditProfileActivity::class.java)
            return intent
        }
    }

    lateinit var binding: ActivityEditProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_edit_profile)
        initialization()

    }

    fun initialization() {
        binding.btnCancel.setOnClickListener(this)
        binding.btnSave.setOnClickListener(this)
        binding.ivBack.setOnClickListener(this)

    }


    override fun onClick(view: View?) {
        when (view?.id) {

            R.id.ivBack -> {
                finish()
            }
            R.id.btnSave -> {
                finish()
            }
            R.id.btnCancel -> {
                finish()
            }

        }
    }


}