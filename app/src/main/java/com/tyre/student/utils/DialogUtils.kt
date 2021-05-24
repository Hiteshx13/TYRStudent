package com.example.tyr.utils

import android.app.Dialog
import android.content.Context
import android.view.Gravity
import android.view.Window
import android.view.WindowManager
import android.widget.LinearLayout
import com.example.tyr.`interface`.NavMenuClickListener
import com.tyre.student.R


fun showMessageDialog(
    context: Context?,
    listener: NavMenuClickListener
) {
    val mDialog = Dialog(context!!)
    mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
    mDialog.setContentView(R.layout.dialog_message)
    mDialog.setCancelable(true)
    mDialog.window!!.setBackgroundDrawableResource(R.color.colorTransparent)

    val window: Window = mDialog.window!!
    val wlp = window.attributes
    wlp.gravity = Gravity.TOP
    wlp.flags = wlp.flags and WindowManager.LayoutParams.FLAG_DIM_BEHIND.inv()
    window.attributes = wlp

    val llNavHome: LinearLayout = mDialog.findViewById(R.id.llNavHome)
    val llNavMyClasses: LinearLayout = mDialog.findViewById(R.id.llNavMyClasses)
    val llNavChat: LinearLayout = mDialog.findViewById(R.id.llNavChat)
    val llNavMyProfile: LinearLayout = mDialog.findViewById(R.id.llNavMyProfile)
    val llNavPayout: LinearLayout = mDialog.findViewById(R.id.llNavPayout)
    val llNavNotification: LinearLayout = mDialog.findViewById(R.id.llNavNotifications)
    val llNavFaq: LinearLayout = mDialog.findViewById(R.id.llNavFaq)
    val llNavLogout: LinearLayout = mDialog.findViewById(R.id.llNavLogout)


    llNavHome.setOnClickListener {
        listener.onClick(it)
        mDialog.dismiss()
    }
    llNavMyClasses.setOnClickListener {
        listener.onClick(it)
        mDialog.dismiss()
    }
    llNavChat.setOnClickListener {
        listener.onClick(it)
        mDialog.dismiss()
    }
    llNavMyProfile.setOnClickListener {
        listener.onClick(it)
        mDialog.dismiss()
    }
    llNavPayout.setOnClickListener {
        listener.onClick(it)
        mDialog.dismiss()
    }
    llNavNotification.setOnClickListener {
        listener.onClick(it)
        mDialog.dismiss()
    }

    llNavFaq.setOnClickListener {
        listener.onClick(it)
        mDialog.dismiss()
    }

    llNavLogout.setOnClickListener {
        listener.onClick(it)
        mDialog.dismiss()
    }

    mDialog.show()
}

