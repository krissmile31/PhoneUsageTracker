package com.krissmile31.phoneusagetracker.timeline.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.krissmile31.phoneusagetracker.databinding.ItemTimelineBinding
import com.krissmile31.phoneusagetracker.timeline.model.Timeline

class TimelineAdapter(private var timelineList: List<Timeline>) : RecyclerView.Adapter<TimelineAdapter.TimelineViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TimelineViewHolder {
        val context = parent.context
        val itemBinding = ItemTimelineBinding.inflate(LayoutInflater.from(context), parent, false)
        return TimelineViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: TimelineViewHolder, position: Int) {
        holder.bind(timelineList[position])
    }

    override fun getItemCount(): Int {
        return timelineList.size
    }

    inner class TimelineViewHolder(private val itemBinding: ItemTimelineBinding) :
        RecyclerView.ViewHolder(itemBinding.root){
        fun bind(timeline: Timeline) {
            itemBinding.imgApp.setImageResource(timeline.appIcon)
            itemBinding.tvAppName.text = timeline.appName
            itemBinding.tvTimeUseInApp.text = "${timeline.timeUseInApp}m"
        }

    }
}