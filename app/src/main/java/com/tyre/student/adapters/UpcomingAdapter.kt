package com.tyre.student.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.tyr.`interface`.UpcomingListener
import com.tyre.student.R
import com.tyre.student.databinding.RowUpcomingBinding


class UpcomingAdapter(
    private val mContext: Context,
    var mCount: Int,
    var listener: UpcomingListener
    ) : RecyclerView.Adapter<UpcomingAdapter.ViewHolder>() {
    var isVisible = false

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val inflater = LayoutInflater.from(
            parent.context
        )
        val binding: RowUpcomingBinding =
            DataBindingUtil.inflate(inflater, R.layout.row_upcoming, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


    }

    override fun getItemCount(): Int {
        return mCount
    }

    inner class ViewHolder internal constructor(var binding: RowUpcomingBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {

            binding.tvReportCard.setOnClickListener {
                listener.onClickReportCards(it)
            }
            binding.tvReschedule.setOnClickListener {
                listener.onClickReschedule(it)
            }
            binding.tvCancel.setOnClickListener {
                listener.onClickCancel(it)
            }
            binding.ivMessage.setOnClickListener {
                listener.onClickMessage(it)
            }
            binding.ivProfile.setOnClickListener {
                listener.onClickProfile(it)
            }
        }
    }
}