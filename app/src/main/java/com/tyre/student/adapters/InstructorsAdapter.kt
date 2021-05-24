package com.example.tyr.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.tyr.`interface`.CompleteListener
import com.tyre.student.R
import com.tyre.student.databinding.RowInstructorsBinding


class InstructorsAdapter(
    private val mContext: Context,
    var mCount: Int,
    var listener: CompleteListener
) : RecyclerView.Adapter<InstructorsAdapter.ViewHolder>() {
    var isVisible = false

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val inflater = LayoutInflater.from(
            parent.context
        )
        val binding: RowInstructorsBinding =
            DataBindingUtil.inflate(inflater, R.layout.row_instructors, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


    }

    override fun getItemCount(): Int {
        return mCount
    }

    inner class ViewHolder internal constructor(var binding: RowInstructorsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {

            binding.llRoot.setOnClickListener {
                listener.onClickProfile(it)
            }
        }
    }
}