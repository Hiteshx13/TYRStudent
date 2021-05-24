package com.example.tyr.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.tyre.student.R
import com.tyre.student.activity.InstructorsActivity
import com.tyre.student.databinding.FragmentDashboardBinding
import com.tyre.student.fragment.BaseFragment

class DashboardFragment : BaseFragment(), View.OnClickListener {

    lateinit var binding: FragmentDashboardBinding


    companion object {
        fun newInstance(): DashboardFragment {
            return DashboardFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_dashboard, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnBookClass.setOnClickListener(this)
    }
    override fun onClick(view: View?) {
         when(view?.id){
             R.id.btnBookClass->{
                 launchActivity(InstructorsActivity.getIntent(mContext))
             }
         }
    }


}