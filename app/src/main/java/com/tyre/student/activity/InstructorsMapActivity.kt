package com.tyre.student.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.tyre.student.R
import com.tyre.student.databinding.ActivityInstructorsMapBinding

class InstructorsMapActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, InstructorsMapActivity::class.java)
            return intent
        }
    }

    lateinit var binding: ActivityInstructorsMapBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_instructors_map)
        initialization()

    }

    fun initialization() {
        binding.btnListView.setOnClickListener(this)
        binding.ivFilter.setOnClickListener(this)
        binding.btnApply.setOnClickListener(this)
        binding.btnReset.setOnClickListener(this)
        binding.ivClose.setOnClickListener(this)


    }


    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.btnListView -> {
                finish()
            }

            R.id.ivFilter -> {
                binding.cvFilters.visibility = View.VISIBLE
            }

            R.id.btnReset -> {
                binding.cvFilters.visibility = View.GONE
            }
            R.id.btnApply -> {
                binding.cvFilters.visibility = View.GONE
            }
            R.id.ivClose -> {
                binding.cvFilters.visibility = View.GONE
            }

        }
    }


}