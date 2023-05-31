package com.example.shoppingtest1

import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow

class ProductItemRepository(private val productItemDao: ProductItemDao) {
    val allProductItems: Flow<List<ProductItem>> = productItemDao.allProductItems()

    @WorkerThread
    suspend fun insertProductItem(productItem: ProductItem) {
        productItemDao.insertProductItem(productItem)
    }

    @WorkerThread
    suspend fun updateProductItem(productItem: ProductItem) {
        productItemDao.updateProductItem(productItem)
    }

    /**
     * TODO
     * Utwórz funkcję deleteProductItem() na wzór powyższych funkcji
     * Pamiętaj o dodaniu adnotacji @WorkerThread
     * Kolejny krok: plik ProductViewModel.kt
     */

}