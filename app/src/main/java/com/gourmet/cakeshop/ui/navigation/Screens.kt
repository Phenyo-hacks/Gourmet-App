package com.gourmet.cakeshop.ui.navigation


sealed class Screen(val route: String) {
    // Auth
    object Login : Screen("login")
    object SignUp : Screen("signup")

    // Customer
    object Home : Screen("home")
    object Products : Screen("products")
    object ProductDetail : Screen("product/{productId}") {
        fun createRoute(productId: String) = "product/$productId"
    }
    object Cart : Screen("cart")
    object Checkout : Screen("checkout")
    object Orders : Screen("orders")
    object OrderDetail : Screen("order/{orderId}") {
        fun createRoute(orderId: String) = "order/$orderId"
    }

    // Admin
    object AdminDashboard : Screen("admin/dashboard")
    object AdminProducts : Screen("admin/products")
    object AdminOrders : Screen("admin/orders")
    object AdminOrderDetail : Screen("admin/order/{orderId}") {
        fun createRoute(orderId: String) = "admin/order/$orderId"
    }
    object AdminStaff : Screen("admin/staff")

    // Staff
    object Kitchen : Screen("kitchen")
    object Delivery : Screen("delivery")
}