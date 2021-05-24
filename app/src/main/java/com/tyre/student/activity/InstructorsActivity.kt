package com.tyre.student.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tyr.`interface`.CompleteListener
import com.example.tyr.adapters.InstructorsAdapter
import com.tyre.student.R
import com.tyre.student.databinding.ActivityInstructorsBinding

class InstructorsActivity : BaseActivity(), View.OnClickListener {

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, InstructorsActivity::class.java)
            return intent
        }
    }

    lateinit var binding: ActivityInstructorsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_instructors)
        initialization()

    }

    fun initialization() {

        binding.ivBack.setOnClickListener(this)
        binding.ivMap.setOnClickListener(this)

        binding.rvConversations.setHasFixedSize(true)
        binding.rvConversations.layoutManager =
            LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, false)

        binding.rvConversations.adapter =
            InstructorsAdapter(mContext, 30, object : CompleteListener {
                override fun onClickPerformance(view: View) {

                }

                override fun onClickProfile(view: View) {
                    launchActivity(InstructorsDetailsActivity.getIntent(mContext))
                }

                override fun onClickRatings(view: View) {

                }
            })
    }


    override fun onClick(view: View?) {
        when (view?.id) {

            R.id.ivBack -> {
                finish()
            }
            R.id.ivMap -> {
                launchActivity(InstructorsMapActivity.getIntent(mContext))
            }


        }
    }


}