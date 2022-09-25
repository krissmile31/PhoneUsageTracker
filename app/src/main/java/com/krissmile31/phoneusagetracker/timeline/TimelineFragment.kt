package com.krissmile31.phoneusagetracker.timeline

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.krissmile31.phoneusagetracker.R
import com.krissmile31.phoneusagetracker.databinding.FragmentTimelineBinding
import com.krissmile31.phoneusagetracker.timeline.adapter.TimelineAdapter
import com.krissmile31.phoneusagetracker.timeline.model.Timeline
import java.sql.Time

class TimelineFragment : Fragment() {
    private lateinit var binding: FragmentTimelineBinding
    private var timelineList: ArrayList<Timeline> = ArrayList()
    private lateinit var timelineAdapter: TimelineAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTimelineBinding.inflate(layoutInflater, container, false)
        setTimeLineView()

        return binding.root
    }

    private fun setTimeLineView() {
        timelineList.add(Timeline(R.drawable.youtube_demo, "Youtube", 48.0))
        timelineList.add(Timeline(R.drawable.youtube_demo, "Youtube", 48.0))
        timelineList.add(Timeline(R.drawable.youtube_demo, "Youtube", 48.0))
        timelineList.add(Timeline(R.drawable.youtube_demo, "Youtube", 48.0))
        timelineList.add(Timeline(R.drawable.youtube_demo, "Youtube", 48.0))

        timelineAdapter = TimelineAdapter(timelineList)
        binding.rclTimeline.adapter = timelineAdapter
        binding.rclTimeline.layoutManager = LinearLayoutManager(context)
    }
}