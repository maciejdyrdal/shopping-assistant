package com.example.shoppingtest1

import android.app.Application

class ShoppingApplication: Application() {
    private val database by lazy { ProductItemDatabase.getDatabase(this) }
    val repository by lazy { ProductItemRepository(database.productItemDao()) }
}