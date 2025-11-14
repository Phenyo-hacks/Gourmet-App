package com.gourmet.cakeshop.ui.admin

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun AdminOrderDetailScreen(navController: NavController, orderId: String) {
    var status by remember { mutableStateOf("Pending") }

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
            Text("Admin Order: $orderId", style = MaterialTheme.typography.titleLarge)
            Spacer(modifier = Modifier.height(24.dp))

            Text("Update Status:")
            Spacer(modifier = Modifier.height(8.dp))

            Row {
                listOf("Pending", "Processing", "Ready", "Delivered").forEach { s ->
                    FilterChip(
                        selected = status == s,
                        onClick = { status = s },
                        label = { Text(s) },
                        modifier = Modifier.padding(4.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            Button(onClick = { /* Update status */ }) {
                Text("Update Status")
            }
        }
    }
}