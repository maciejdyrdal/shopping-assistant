package com.example.shoppingtest1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shoppingtest1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), ProductItemClickListener {

    private lateinit var binding: ActivityMainBinding
    private val productViewModel: ProductViewModel by viewModels {
        ProductItemModelFactory((application as ShoppingApplication).repository)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.myToolbar)

        binding.newProductButton.setOnClickListener {
            NewProductSheet(null).show(supportFragmentManager, "newProductTag")
        }

        setRecyclerView()
    }

    private fun setRecyclerView() {
        val mainActivity = this
        productViewModel.productItems.observe(this) {
            binding.productListRecyclerView.apply {
//                layoutManager = LinearLayoutManager(applicationContext)
                layoutManager = GridLayoutManager(applicationContext, 3)
                adapter = ProductItemAdapter(it, mainActivity)
            }
        }
    }

    override fun editProductItem(productItem: ProductItem) {
        NewProductSheet(productItem).show(supportFragmentManager, "newProductTag")
    }

    override fun toggleCompleteProductItem(productItem: ProductItem) {
        productViewModel.togglePurchased(productItem)
    }
}