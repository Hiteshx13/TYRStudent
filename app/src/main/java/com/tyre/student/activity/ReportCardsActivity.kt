package com.tyre.student.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.tyre.student.R
import com.tyre.student.databinding.ActivityRepotyCardsBinding

class ReportCardsActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, ReportCardsActivity::class.java)
            return intent
        }
    }

    lateinit var binding: ActivityRepotyCardsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_repoty_cards)
        initialization()

    }

    fun initialization() {
        binding.ivBack.setOnClickListener(this)

    }


    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.ivBack -> {
                finish()
            }

        }
    }


}