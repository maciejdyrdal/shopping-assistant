package com.example.shoppingtest1

import android.os.Bundle
import android.text.Editable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.shoppingtest1.databinding.FragmentNewProductSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class NewProductSheet(var productItem: ProductItem?) : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentNewProductSheetBinding
    private lateinit var productViewModel: ProductViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (productItem != null) {
            binding.productTitle.text = "Edit Product"
            val editable = Editable.Factory.getInstance()
            binding.name.text = editable.newEditable(productItem!!.name)
            binding.desc.text = editable.newEditable(productItem!!.desc)
        } else {
            binding.productTitle.text = "New Product"
        }

        val activity = requireActivity()
        productViewModel = ViewModelProvider(activity).get(ProductViewModel::class.java)
        binding.saveButton.setOnClickListener {
            saveAction()
        }

        binding.deleteButton.setOnClickListener {
            if (productItem != null) {
                deleteProduct()
            }
            dismiss()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentNewProductSheetBinding.inflate(inflater, container, false)
        return binding.root
    }

    private fun saveAction() {
        val name = binding.name.text.toString()
        val desc = binding.desc.text.toString()
        if (name.isNotEmpty()) {
            if (productItem == null) {
                val newProduct = ProductItem(name, desc)
                productViewModel.addProductItem(newProduct)
            } else {
                productItem!!.name = name
                productItem!!.desc = desc
                productViewModel.updateProductItem(productItem!!)
            }

            binding.name.setText("")
            binding.desc.setText("")
            dismiss()
        } else {
            Toast.makeText(
                activity, "Please enter a name.",
                Toast.LENGTH_LONG).show();
        }
    }

    private fun deleteProduct() {
        productViewModel.deleteProductItem(productItem!!)
    }
}