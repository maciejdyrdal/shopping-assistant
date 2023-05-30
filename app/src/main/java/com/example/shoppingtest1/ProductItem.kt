package com.example.shoppingtest1

import android.content.Context
import androidx.core.content.ContextCompat
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(tableName = "product_item_table")
class ProductItem(
    @ColumnInfo(name = "name") var name: String,
    @ColumnInfo(name = "desc") var desc: String,
    @ColumnInfo(name = "isPurchased") var isPurchased: Boolean = false,
    @PrimaryKey(autoGenerate = true) var id: Int = 0
) {
    fun imageResource(): Int = if (isPurchased) R.drawable.ic_checked_24 else R.drawable.ic_unchecked_24
    fun imageColor(context: Context): Int = if (isPurchased) colorPurchased(context) else colorNotPurchased(context)

    private fun colorPurchased(context: Context) = ContextCompat.getColor(context, R.color.green_light)
    private fun colorNotPurchased(context: Context) = ContextCompat.getColor(context, R.color.green)
}