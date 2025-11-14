package com.gourmet.cakeshop.data.models

data class User(
    val id: String,
    val email: String,
    val role: String = "customer"
)

data class Profile(
    val id: String,
    val fullName: String,
    val email: String,
    val phoneNumber: String? = null,
    val role: String = "customer"
)