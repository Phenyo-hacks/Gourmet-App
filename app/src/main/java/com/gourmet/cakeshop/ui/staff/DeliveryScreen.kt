package com.gourmet.cakeshop.ui.staff

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DeliveryScreen(navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(title = { Text("Delivery Management") })
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            items(4) { index ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text("Order #D${index + 1}", style = MaterialTheme.typography.titleMedium)
                        Text("Address: ${index + 123} Main St")
                        Text("Status: ${when (index) { 0 -> "Dispatched" 1 -> "Out for Delivery" else -> "Delivered" }}")
                        Button(onClick = { /* Update status */ }) {
                            Text("Update Delivery")
                        }
                    }
                }
            }
        }
    }
}