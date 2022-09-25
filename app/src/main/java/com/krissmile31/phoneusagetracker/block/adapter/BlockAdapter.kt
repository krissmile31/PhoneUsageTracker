package com.krissmile31.phoneusagetracker.block.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.krissmile31.phoneusagetracker.block.model.Block
import com.krissmile31.phoneusagetracker.databinding.ItemBlockBinding

class BlockAdapter(private var blockList: ArrayList<Block>) :
    RecyclerView.Adapter<BlockAdapter.BlockViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlockAdapter.BlockViewHolder {
        val context = parent.context
        val itemtBinding = ItemBlockBinding.inflate(LayoutInflater.from(context), parent, false)
        return BlockViewHolder(itemtBinding)
    }

    override fun onBindViewHolder(holder: BlockAdapter.BlockViewHolder, position: Int) {
        holder.bind(blockList[position])
    }

    override fun getItemCount(): Int {
        return blockList.size
    }

    inner class BlockViewHolder(private val itemtBinding: ItemBlockBinding) :
        RecyclerView.ViewHolder(itemtBinding.root) {
        fun bind(block: Block) {
            itemtBinding.imgApp.setImageResource(block.appIcon)
        }

    }

}