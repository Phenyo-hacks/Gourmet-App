package com.gourmet.cakeshop.ui.admin

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.gourmet.cakeshop.ui.navigation.Screen

@Composable
fun AdminOrdersScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Manage Orders") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Text("Back")
                    }
                }
            )
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            items(6) { index ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    onClick = {
                        navController.navigate(Screen.AdminOrderDetail.createRoute("admin-order-$index"))
                    }
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text("Order #${index + 1}", style = MaterialTheme.typography.titleMedium)
                        Text("Customer: Customer ${index + 1}")
                        Text("Status: ${when (index % 3) { 0 -> "Pending" 1 -> "Processing" else -> "Delivered" }}")
                        Text("Total: R${(index + 1) * 45}.00")
                    }
                }
            }
        }
    }
}