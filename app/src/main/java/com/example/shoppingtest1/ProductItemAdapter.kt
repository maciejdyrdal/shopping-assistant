package com.example.shoppingtest1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shoppingtest1.databinding.ProductItemCellBinding

class ProductItemAdapter(
    private val productItems: List<ProductItem>,
    private val clickListener: ProductItemClickListener
): RecyclerView.Adapter<ProductItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductItemViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = ProductItemCellBinding.inflate(from, parent, false)
        return ProductItemViewHolder(parent.context, binding, clickListener)
    }

    override fun getItemCount(): Int = productItems.size

    override fun onBindViewHolder(holder: ProductItemViewHolder, position: Int) {
        holder.bindProductItem(productItems[position])
    }
}