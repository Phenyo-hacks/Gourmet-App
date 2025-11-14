package com.gourmet.cakeshop.data.models


data class Order(
    val id: String,
    val userId: String,
    val totalAmount: Double,
    val status: String, // "pending", "confirmed", "preparing", "ready", "delivered"
    val deliveryAddress: String,
    val orderDate: String,
    val deliveryDate: String? = null
)

data class OrderItem(
    val id: String,
    val orderId: String,
    val productId: String,
    val quantity: Int,
    val unitPrice: Double
)