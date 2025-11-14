package com.gourmet.cakeshop.ui.customer

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.gourmet.cakeshop.ui.navigation.Screen
import com.gourmet.cakeshop.ui.components.BottomNavBar

@Composable
fun OrdersScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(  // CHANGE THIS
                title = { Text("My Orders") }
            )
        },
        // ... rest stays the same
        bottomBar = {
            BottomNavBar(navController = navController, currentRoute = Screen.Orders.route)
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            items(5) { index ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    onClick = {
                        navController.navigate(Screen.OrderDetail.createRoute("order-$index"))
                    }
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text("Order #${index + 1}", style = MaterialTheme.typography.titleMedium)
                        Text("Status: ${if (index % 2 == 0) "Delivered" else "Processing"}")
                        Text("Total: R${(index + 1) * 45}.00")
                    }
                }
            }
        }
    }
}