package com.gourmet.cakeshop.data.models

data class Product(
    val id: String,
    val name: String,
    val description: String?,
    val category: String,
    val price: Double,
    val stockQty: Int,
    val imageUrl: String?,
    val isAvailable: Boolean = true
)