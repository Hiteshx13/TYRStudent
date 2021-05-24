package com.tyre.student.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {
    lateinit var mContext: Context
    lateinit var mActivity: AppCompatActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mContext = this
        mActivity = this

    }

    open fun launchActivity(intent: Intent) {
        startActivity(intent)
    }

    open fun unsubscribe() {

    }

    override fun onDestroy() {
        super.onDestroy()
        unsubscribe()
    }
}