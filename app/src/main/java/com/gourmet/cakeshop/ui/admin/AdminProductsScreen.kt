package com.gourmet.cakeshop.ui.admin

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun AdminProductsScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Manage Products") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Text("Back")
                    }
                }
            )
        },
        floatingActionButton = {
            ExtendedFloatingActionButton(
                onClick = { /* Add product */ }
            ) {
                Text("Add Product")
            }
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            items(8) { index ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text("Product ${index + 1}", style = MaterialTheme.typography.titleMedium)
                        Text("Stock: ${index + 5}")
                        Text("Price: R${(index + 1) * 25}.00")
                        Row {
                            Button(onClick = { /* Edit */ }) {
                                Text("Edit")
                            }
                            Spacer(modifier = Modifier.width(8.dp))
                            Button(
                                onClick = { /* Delete */ },
                                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.error)
                            ) {
                                Text("Delete")
                            }
                        }
                    }
                }
            }
        }
    }
}