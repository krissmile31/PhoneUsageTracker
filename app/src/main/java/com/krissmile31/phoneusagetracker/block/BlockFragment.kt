package com.krissmile31.phoneusagetracker.block

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.krissmile31.phoneusagetracker.R
import com.krissmile31.phoneusagetracker.block.adapter.BlockAdapter
import com.krissmile31.phoneusagetracker.block.model.Block
import com.krissmile31.phoneusagetracker.databinding.FragmentBlockBinding

class BlockFragment : Fragment() {
    private lateinit var binding: FragmentBlockBinding
    private lateinit var blockAdapter: BlockAdapter
    private var blockList: ArrayList<Block> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBlockBinding.inflate(layoutInflater, container, false)
        setBlockView()

        return binding.root
    }

    private fun setBlockView() {
        blockList.add(Block(R.drawable.youtube_demo))
        blockList.add(Block(R.drawable.youtube_demo))
        blockList.add(Block(R.drawable.youtube_demo))
        blockList.add(Block(R.drawable.youtube_demo))
        blockList.add(Block(R.drawable.youtube_demo))

        blockAdapter = BlockAdapter(blockList)
        binding.rclBlock.adapter = blockAdapter
        binding.rclBlock.layoutManager = LinearLayoutManager(context)
    }
}