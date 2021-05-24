package com.example.tyr.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.tyr.`interface`.CompleteListener
import com.tyre.student.R
import com.tyre.student.databinding.RowConversationsBinding


class ConversationsAdapter(
    private val mContext: Context,
    var mCount: Int,
    var listener: CompleteListener
    ) : RecyclerView.Adapter<ConversationsAdapter.ViewHolder>() {
    var isVisible = false

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val inflater = LayoutInflater.from(
            parent.context
        )
        val binding: RowConversationsBinding =
            DataBindingUtil.inflate(inflater, R.layout.row_conversations, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


    }

    override fun getItemCount(): Int {
        return mCount
    }

    inner class ViewHolder internal constructor(var binding: RowConversationsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {

            binding.llRoot.setOnClickListener {
                listener.onClickProfile(it)
            }
        }
    }
}