package com.tyre.student.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tyr.`interface`.CompleteListener
import com.example.tyr.adapters.ConversationsAdapter
import com.tyre.student.R
import com.tyre.student.databinding.ActivityConversationsBinding

class ConversationsActivity : BaseActivity(), View.OnClickListener {

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, ConversationsActivity::class.java)
            return intent
        }
    }

    lateinit var binding: ActivityConversationsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_conversations)
        initialization()

    }

    fun initialization() {

        binding.ivBack.setOnClickListener(this)

        binding.rvConversations.setHasFixedSize(true)
        binding.rvConversations.layoutManager =
            LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, false)

        binding.rvConversations.adapter = ConversationsAdapter(mContext, 30,object: CompleteListener {
            override fun onClickPerformance(view: View) {
                TODO("Not yet implemented")
            }

            override fun onClickProfile(view: View) {
                launchActivity(ChatActivity.getIntent(mContext))
            }
        })
    }


    override fun onClick(view: View?) {
        when (view?.id) {

            R.id.ivBack -> {
                finish()
            }


        }
    }


}