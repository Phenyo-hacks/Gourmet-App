package com.gourmet.cakeshop.ui.components

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.gourmet.cakeshop.ui.navigation.Screen

@Composable
fun BottomNavBar(navController: NavController, currentRoute: String) {
    val navigationItems = listOf(
        Screen.Home,
        Screen.Products,
        Screen.Cart,
        Screen.Orders
    )

    NavigationBar {
        navigationItems.forEach { screen ->
            NavigationBarItem(
                icon = {
                    Text("•")
                },
                label = { Text(screen.route) },
                selected = currentRoute == screen.route,
                onClick = {
                    navController.navigate(screen.route)
                }
            )
        }
    }
}