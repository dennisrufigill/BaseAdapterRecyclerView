package com.example.baseadapterrecyclerview

import com.example.baseadapterrecyclerview.databinding.CountryItemBinding

class CountryAdapter : BaseRecyclerViewAdapter<String, CountryItemBinding>() {

    override fun getLayout() = R.layout.country_item

    override fun onBindViewHolder(
        holder: Companion.BaseViewHolder<CountryItemBinding>,
        position: Int
    ) {
        holder.binding.tvCountryName.text = listItems[position]
        holder.binding.root.setOnClickListener {
            itemClickListener?.invoke(it, listItems[position], position)
        }
    }
}