package com.example.tyr.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.tyre.student.R
import com.tyre.student.databinding.FragmentUsersBinding
import com.tyre.student.fragment.BaseFragment

class UsersFragment : BaseFragment(), View.OnClickListener {

    var binding: FragmentUsersBinding? = null


    companion object {
        fun newInstance(): UsersFragment {
            return UsersFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_users, container, false)
        return binding?.root
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }


}