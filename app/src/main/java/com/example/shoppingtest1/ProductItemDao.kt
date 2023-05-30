package com.example.shoppingtest1

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface ProductItemDao {
    @Query("SELECT * FROM product_item_table ORDER BY id ASC")
    fun allProductItems(): Flow<List<ProductItem>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProductItem(productItem: ProductItem)

    @Update
    suspend fun updateProductItem(productItem: ProductItem)

    @Delete
    suspend fun deleteProductItem(productItem: ProductItem)
}