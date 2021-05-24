package com.tyre.student.activity

import android.content.Context
import android.content.Intent
import android.content.res.ColorStateList
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.core.widget.ImageViewCompat
import androidx.databinding.DataBindingUtil
import com.tyre.student.R
import com.tyre.student.databinding.ActivityPerformanceBinding

class PerformanceActivity : BaseActivity(), View.OnClickListener {

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, PerformanceActivity::class.java)
            return intent
        }
    }

    lateinit var binding: ActivityPerformanceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_performance)
        initialization()

    }

    fun initialization() {
        binding.llTabClassDetails.setOnClickListener(this)
        binding.llTabReportCard.setOnClickListener(this)
        binding.ivBack.setOnClickListener(this)
        binding.llTabClassDetails.callOnClick()

    }


    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.ivBack -> {
                finish()
            }
            R.id.llTabClassDetails -> {
                binding.tvClassDetails.isSelected = true
                binding.viewClassDetails.isSelected = true

                binding.tvReportCard.isSelected = false
                binding.viewReportCard.isSelected = false
                binding.llTabs.setBackgroundResource(R.drawable.bg_black_rounded)
                binding.rlRoot.setBackgroundResource(R.drawable.map_flat)

                binding.rlClassDetails.visibility = View.VISIBLE
                binding.llReportCard.visibility = View.GONE
                ImageViewCompat.setImageTintList(
                    binding.ivBack, ColorStateList.valueOf(
                        ContextCompat.getColor(mContext, R.color.colorBlack)
                    )
                )


            }
            R.id.llTabReportCard -> {
                binding.tvClassDetails.isSelected = false
                binding.viewClassDetails.isSelected = false

                binding.tvReportCard.isSelected = true
                binding.viewReportCard.isSelected = true
                binding.llTabs.setBackgroundResource(R.drawable.bg_edit_text)
                binding.rlRoot.setBackgroundResource(R.drawable.bg_blue_black)


                binding.rlClassDetails.visibility = View.GONE
                binding.llReportCard.visibility = View.VISIBLE
                ImageViewCompat.setImageTintList(
                    binding.ivBack, ColorStateList.valueOf(
                        ContextCompat.getColor(mContext, R.color.colorWhite)
                    )
                )

            }

        }
    }


}