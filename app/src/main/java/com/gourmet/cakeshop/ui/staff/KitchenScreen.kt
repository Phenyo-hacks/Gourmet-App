package com.gourmet.cakeshop.ui.staff

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun KitchenScreen(navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(title = { Text("Kitchen Orders") })
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
                        .padding(16.dp)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text("Order #K${index + 1}", style = MaterialTheme.typography.titleMedium)
                        Text("Items: ${index + 2} cakes")
                        Text("Status: ${if (index < 2) "Preparing" else "Ready"}")
                        Row {
                            Button(onClick = { /* Mark ready */ }) {
                                Text(if (index < 2) "Start Prep" else "Mark Ready")
                            }
                        }
                    }
                }
            }
        }
    }
}