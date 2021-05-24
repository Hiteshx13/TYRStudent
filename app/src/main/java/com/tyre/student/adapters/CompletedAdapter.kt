package com.tyre.student.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.tyr.`interface`.CompleteListener
import com.tyre.student.R
import com.tyre.student.databinding.RowCompletedBinding


class CompletedAdapter(
    private val mContext: Context,
    var mCount: Int,
    var listener: CompleteListener
    ) : RecyclerView.Adapter<CompletedAdapter.ViewHolder>() {
    var isVisible = false

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val inflater = LayoutInflater.from(
            parent.context
        )
        val binding: RowCompletedBinding =
            DataBindingUtil.inflate(inflater, R.layout.row_completed, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


    }

    override fun getItemCount(): Int {
        return mCount
    }

    inner class ViewHolder internal constructor(var binding: RowCompletedBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            binding.tvPerformance.setOnClickListener {
                listener.onClickPerformance(it)
            }
            binding.tvRating.setOnClickListener {
                listener.onClickRatings(it)
            }

            binding.ivProfile.setOnClickListener {
                listener.onClickProfile(it)
            }
        }
    }
}