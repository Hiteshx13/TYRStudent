package com.tyre.student.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.tyr.`interface`.NavMenuClickListener
import com.example.tyr.fragment.DashboardFragment
import com.example.tyr.fragment.UsersFragment
import com.example.tyr.utils.showMessageDialog
import com.tyre.student.R
import com.tyre.student.databinding.ActivityMainBinding
import com.tyre.student.fragment.ContactsFragment

class MainActivity : BaseActivity(), View.OnClickListener {

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, MainActivity::class.java)
            return intent
        }
    }

    lateinit var binding: ActivityMainBinding
    private var TAB_SELECTED = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        initialization()
        binding.llTabHome.callOnClick()
    }

    fun initialization() {
        binding.llTabHome.setOnClickListener(this)
        binding.llTabContact.setOnClickListener(this)
        binding.llTabUser.setOnClickListener(this)
        binding.ivNavigation.setOnClickListener(this)
        binding.ivRight.setOnClickListener(this)

    }

    fun replaceFragment(fragment: Fragment, isBackStack: Boolean) {
        val fm = supportFragmentManager
        val fragmentTransaction = fm.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        if (isBackStack) {
            fragmentTransaction.addToBackStack(fragment.javaClass.name)
        }
        fragmentTransaction.commit() // save the changes

    }

    override fun onClick(view: View?) {
        when (view?.id) {

            R.id.llTabHome -> {
                resetView()
                TAB_SELECTED = 0
                binding.ivRight.visibility = View.GONE
                binding.llTabHome.isSelected = true
                replaceFragment(DashboardFragment.newInstance(), false)
            }
            R.id.llTabContact -> {
                TAB_SELECTED = 1
                resetView()
                binding.llTabContact.isSelected = true
                replaceFragment(ContactsFragment.newInstance(), false)
                binding.ivRight.visibility = View.VISIBLE
                binding.ivRight.setImageDrawable(getDrawable(R.drawable.icn_calendar))
            }
            R.id.llTabUser -> {
                TAB_SELECTED = 2
                resetView()
                binding.llTabUser.isSelected = true
                replaceFragment(UsersFragment.newInstance(), false)
                binding.ivRight.visibility = View.VISIBLE
                binding.ivRight.setImageDrawable(getDrawable(R.drawable.ic_pen))
            }

            R.id.ivRight -> {
                when (TAB_SELECTED) {
                    1 -> {

                    }
                    2 -> {
                        launchActivity(EditProfileActivity.getIntent(mContext))
                    }

                }

            }
            R.id.ivNavigation -> {
                showMessageDialog(this, object : NavMenuClickListener {
                    override fun onClick(view: View) {
                        when (view.id) {

                            R.id.llNavHome -> {
                                binding.llTabHome.callOnClick()
                            }
                            R.id.llNavMyClasses -> {
                                binding.llTabContact.callOnClick()
                            }
                            R.id.llNavChat -> {
                                launchActivity(ChatActivity.getIntent(mContext))
                            }
                            R.id.llNavMyProfile -> {
                                binding.llTabUser.callOnClick()
                            }
                            R.id.llNavPayout -> {
//                                launchActivity(PayoutsActivity.getIntent(mContext))
                            }
                            R.id.llNavNotifications -> {
                                launchActivity(NotificationsActivity.getIntent(mContext))
                            }
                            R.id.llNavFaq -> {
                                launchActivity(FAQActivity.getIntent(mContext))
                            }
                            R.id.llNavLogout -> {
                                finish()
                            }
                        }
                    }
                })
            }
        }
    }

    fun resetView() {
        binding.llTabHome.isSelected = false
        binding.llTabUser.isSelected = false
        binding.llTabContact.isSelected = false
    }
}