package com.gourmet.cakeshop.ui.customer

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.gourmet.cakeshop.ui.navigation.Screen

@Composable
fun CheckoutScreen(navController: NavController) {
    var address by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Checkout") },
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
                .padding(16.dp)
        ) {
            OutlinedTextField(
                value = address,
                onValueChange = { address = it },
                label = { Text("Delivery Address") },
                modifier = Modifier.fillMaxWidth(),
                placeholder = { Text("Enter your delivery address") }
            )

            Spacer(modifier = Modifier.height(24.dp))

            Text("Order Total: R150.00", style = MaterialTheme.typography.titleMedium)

            Spacer(modifier = Modifier.height(32.dp))

            Button(
                onClick = {
                    // TEMPORARY: Navigate to orders after "purchase"
                    navController.navigate(Screen.Orders.route)
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Place Order")
            }
        }
    }
}