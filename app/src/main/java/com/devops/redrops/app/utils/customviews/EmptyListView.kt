package com.devops.redrops.app.utils.customviews

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.devops.redrops.app.R
import com.devops.redrops.app.databinding.EmptyListViewBinding

/**
 * A simple custom view to display a empty list message
 */
class EmptyListView(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {

    val binding: EmptyListViewBinding = EmptyListViewBinding.inflate(LayoutInflater.from(context), this, true)

    init {
        val attributes = context.obtainStyledAttributes(attrs, R.styleable.EmptyListView)
        binding.emptyListImage.setImageDrawable(attributes.getDrawable(R.styleable.EmptyListView_image))
        binding.emptyListText.text = attributes.getString(R.styleable.EmptyListView_text)

        attributes.recycle()
    }
}