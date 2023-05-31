package com.example.shoppingtest1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import java.lang.IllegalArgumentException
import java.util.UUID

class ProductViewModel(private val repository: ProductItemRepository): ViewModel() {
    var productItems: LiveData<List<ProductItem>> = repository.allProductItems.asLiveData()

    fun addProductItem(newProduct: ProductItem) = viewModelScope.launch {
        repository.insertProductItem(newProduct)
    }

    fun updateProductItem(productItem: ProductItem) = viewModelScope.launch {
        repository.updateProductItem(productItem)
    }

    fun deleteProductItem(productItem: ProductItem) = viewModelScope.launch {
        repository.deleteProductItem(productItem)
    }

    fun togglePurchased(productItem: ProductItem) = viewModelScope.launch {
        productItem.isPurchased = !productItem.isPurchased
        repository.updateProductItem(productItem)
    }
}

class ProductItemModelFactory(private val repository: ProductItemRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ProductViewModel::class.java))
            return ProductViewModel(repository) as T

        throw IllegalArgumentException("Unknown Class for View Model")
    }
}