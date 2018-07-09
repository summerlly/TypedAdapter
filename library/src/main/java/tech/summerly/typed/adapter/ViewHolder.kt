package tech.summerly.typed.adapter

import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

open class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    constructor(layoutId: Int, parent: ViewGroup)
            : this(LayoutInflater.from(parent.context).inflate(layoutId, parent, false))

    companion object {

        fun from(@LayoutRes layoutId: Int, parent: ViewGroup): ViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            return ViewHolder(inflater.inflate(layoutId, parent, false))
        }
    }

}