package com.tyre.student.fragment

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.tyre.student.activity.BaseActivity

open class BaseFragment : Fragment() {

    lateinit var mContext: Context
    lateinit var mActivity: AppCompatActivity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
        mActivity = context as AppCompatActivity
    }

    fun getParentActivity(): BaseActivity {
        return mActivity as BaseActivity
    }


    open fun launchActivity(intent: Intent) {
        mActivity.startActivity(intent)
    }
}