package com.gourmet.cakeshop.ui.customer

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun ProductDetailScreen(navController: NavController, productId: String) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Product Details") },
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
            Text("Product: $productId", style = MaterialTheme.typography.titleLarge)
            Spacer(modifier = Modifier.height(16.dp))
            Text("Delicious cake description goes here...")
            Spacer(modifier = Modifier.height(24.dp))
            Button(onClick = { /* Add to cart */ }) {
                Text("Add to Cart")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = { navController.navigate(com.gourmet.cakeshop.ui.navigation.Screen.Cart.route) }
            ) {
                Text("View Cart")
            }
        }
    }
}