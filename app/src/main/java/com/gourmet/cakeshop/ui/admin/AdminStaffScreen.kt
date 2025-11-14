package com.gourmet.cakeshop.ui.admin

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun AdminStaffScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Manage Staff") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Text("Back")
                    }
                }
            )
        },
        floatingActionButton = {
            ExtendedFloatingActionButton(
                onClick = { /* Add staff */ }
            ) {
                Text("Add Staff")
            }
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
                        Text("Staff Member ${index + 1}", style = MaterialTheme.typography.titleMedium)
                        Text("Role: ${if (index == 0) "Admin" else if (index < 3) "Kitchen" else "Delivery"}")
                        Text("Email: staff${index + 1}@gourmet.com")
                        Button(onClick = { /* Edit */ }) {
                            Text("Edit Role")
                        }
                    }
                }
            }
        }
    }
}