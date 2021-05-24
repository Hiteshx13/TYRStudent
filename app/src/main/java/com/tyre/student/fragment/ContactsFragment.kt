package com.tyre.student.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tyr.`interface`.CompleteListener
import com.example.tyr.`interface`.UpcomingListener
import com.tyre.student.R
import com.tyre.student.activity.ChatActivity
import com.tyre.student.activity.PerformanceActivity
import com.tyre.student.activity.ReportCardsActivity
import com.tyre.student.activity.StartClassActivity
import com.tyre.student.adapters.CompletedAdapter
import com.tyre.student.adapters.UpcomingAdapter
import com.tyre.student.databinding.FragmentContactsBinding

class ContactsFragment : BaseFragment(), View.OnClickListener {

    lateinit var binding: FragmentContactsBinding

    companion object {
        fun newInstance(): ContactsFragment {
            return ContactsFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_contacts, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.llTabUpcoming.setOnClickListener(this)
        binding.llTabCompleted.setOnClickListener(this)
        binding.ivClose.setOnClickListener(this)
        binding.btnSubmit.setOnClickListener(this)
        binding.llTabCompleted.callOnClick()

        binding.rvData.setHasFixedSize(true)
        binding.rvData.layoutManager =
            LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, false)

    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.ivClose -> {
                binding.cvRatings.visibility = View.GONE
            }
            R.id.btnSubmit -> {
                binding.cvRatings.visibility = View.GONE
            }
            R.id.llTabCompleted -> {
                binding.tvPayout.isSelected = true
                binding.viewPayout.isSelected = true

                binding.tvRemainingPayout.isSelected = false
                binding.viewRemainingPayout.isSelected = false

                binding.rvData.adapter = null
                binding.rvData.adapter = CompletedAdapter(mContext, 30, object : CompleteListener {
                    override fun onClickPerformance(view: View) {
                        launchActivity(PerformanceActivity.getIntent(mContext))
                    }

                    override fun onClickProfile(view: View) {
//                        launchActivity(UserDataActivity.getIntent(mContext))
                    }

                    override fun onClickRatings(view: View) {
                        binding.cvRatings.visibility = View.VISIBLE
                    }
                })
            }
            R.id.llTabUpcoming -> {
                binding.tvPayout.isSelected = false
                binding.viewPayout.isSelected = false

                binding.tvRemainingPayout.isSelected = true
                binding.viewRemainingPayout.isSelected = true

                binding.rvData.adapter = null
                binding.rvData.adapter = UpcomingAdapter(mContext, 30, object : UpcomingListener {
                    override fun onClickReportCards(view: View) {
                        launchActivity(ReportCardsActivity.getIntent(mContext))
                    }

                    override fun onClickCancel(view: View) {

                    }

                    override fun onClickReschedule(view: View) {
                        launchActivity(StartClassActivity.getIntent(mContext))
                    }

                    override fun onClickMessage(view: View) {
                        launchActivity(ChatActivity.getIntent(mContext))
                    }

                    override fun onClickProfile(view: View) {
//                        launchActivity(UserDataActivity.getIntent(mContext))
                    }
                })
            }

        }
    }


}