package com.example.shoppingtest1

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [ProductItem::class], version = 1, exportSchema = false)
abstract class ProductItemDatabase: RoomDatabase() {
    abstract fun productItemDao(): ProductItemDao

    companion object {
        @Volatile
        private var INSTANCE: ProductItemDatabase? = null

        fun getDatabase(context: Context): ProductItemDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(context.applicationContext,
                ProductItemDatabase::class.java,
                "product_item_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}