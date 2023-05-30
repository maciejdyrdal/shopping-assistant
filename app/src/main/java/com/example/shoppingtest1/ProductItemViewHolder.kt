package com.example.shoppingtest1

import android.content.Context
import android.graphics.Paint
import androidx.recyclerview.widget.RecyclerView
import com.example.shoppingtest1.databinding.ProductItemCellBinding

class ProductItemViewHolder(
    private val context: Context,
    private val binding: ProductItemCellBinding,
    private val clickListener: ProductItemClickListener
): RecyclerView.ViewHolder(binding.root) {
    fun bindProductItem(productItem: ProductItem) {
        binding.name.text = productItem.name
        binding.desc.text = productItem.desc

        if (productItem.isPurchased) {
            binding.name.paintFlags = Paint.STRIKE_THRU_TEXT_FLAG
            binding.desc.paintFlags = Paint.STRIKE_THRU_TEXT_FLAG
        }

        binding.completeButton.setImageResource(productItem.imageResource())
        binding.completeButton.setColorFilter(productItem.imageColor(context))

        binding.completeButton.setOnClickListener {
            clickListener.toggleCompleteProductItem(productItem)
        }

        binding.productCellContainer.setOnClickListener {
            clickListener.editProductItem(productItem)
        }
    }
}