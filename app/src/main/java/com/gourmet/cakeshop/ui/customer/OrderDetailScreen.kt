package com.gourmet.cakeshop.ui.customer

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun OrderDetailScreen(navController: NavController, orderId: String) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Order Details") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Text("Back")
                    }
                }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Order: $orderId", style = MaterialTheme.typography.titleLarge)
            Spacer(modifier = Modifier.height(16.dp))
            Text("Status: Delivered")
            Text("Total: R150.00")
            Text("Delivery Address: 123 Main St")
            Spacer(modifier = Modifier.height(24.dp))
            Button(onClick = { /* Reorder */ }) {
                Text("Reorder")
            }
        }
    }
}