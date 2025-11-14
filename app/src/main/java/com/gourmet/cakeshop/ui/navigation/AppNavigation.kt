package com.gourmet.cakeshop.ui.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.gourmet.cakeshop.ui.auth.LoginScreen
import com.gourmet.cakeshop.ui.auth.SignUpScreen
import com.gourmet.cakeshop.ui.customer.HomeScreen
import com.gourmet.cakeshop.ui.customer.ProductsScreen
import com.gourmet.cakeshop.ui.customer.ProductDetailScreen
import com.gourmet.cakeshop.ui.customer.CartScreen
import com.gourmet.cakeshop.ui.customer.CheckoutScreen
import com.gourmet.cakeshop.ui.customer.OrdersScreen
import com.gourmet.cakeshop.ui.customer.OrderDetailScreen
import com.gourmet.cakeshop.ui.admin.AdminDashboardScreen
import com.gourmet.cakeshop.ui.admin.AdminProductsScreen
import com.gourmet.cakeshop.ui.admin.AdminOrdersScreen
import com.gourmet.cakeshop.ui.admin.AdminOrderDetailScreen
import com.gourmet.cakeshop.ui.admin.AdminStaffScreen
import com.gourmet.cakeshop.ui.staff.KitchenScreen
import com.gourmet.cakeshop.ui.staff.DeliveryScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Login.route
    ) {
        // Auth Screens
        composable(Screen.Login.route) {
            LoginScreen(navController = navController)
        }
        composable(Screen.SignUp.route) {
            SignUpScreen(navController = navController)
        }

        // Customer Screens
        composable(Screen.Home.route) {
            HomeScreen(navController = navController)
        }
        composable(Screen.Products.route) {
            ProductsScreen(navController = navController)
        }
        composable(Screen.ProductDetail.route) { backStackEntry ->
            val productId = backStackEntry.arguments?.getString("productId") ?: ""
            ProductDetailScreen(navController = navController, productId = productId)
        }
        composable(Screen.Cart.route) {
            CartScreen(navController = navController)
        }
        composable(Screen.Checkout.route) {
            CheckoutScreen(navController = navController)
        }
        composable(Screen.Orders.route) {
            OrdersScreen(navController = navController)
        }
        composable(Screen.OrderDetail.route) { backStackEntry ->
            val orderId = backStackEntry.arguments?.getString("orderId") ?: ""
            OrderDetailScreen(navController = navController, orderId = orderId)
        }

        // Admin Screens
        composable(Screen.AdminDashboard.route) {
            AdminDashboardScreen(navController = navController)
        }
        composable(Screen.AdminProducts.route) {
            AdminProductsScreen(navController = navController)
        }
        composable(Screen.AdminOrders.route) {
            AdminOrdersScreen(navController = navController)
        }
        composable(Screen.AdminOrderDetail.route) { backStackEntry ->
            val orderId = backStackEntry.arguments?.getString("orderId") ?: ""
            AdminOrderDetailScreen(navController = navController, orderId = orderId)
        }
        composable(Screen.AdminStaff.route) {
            AdminStaffScreen(navController = navController)
        }

        // Staff Screens
        composable(Screen.Kitchen.route) {
            KitchenScreen(navController = navController)
        }
        composable(Screen.Delivery.route) {
            DeliveryScreen(navController = navController)
        }
    }
}