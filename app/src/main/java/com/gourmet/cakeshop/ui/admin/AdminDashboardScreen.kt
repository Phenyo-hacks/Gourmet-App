package com.gourmet.cakeshop.ui.admin

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.gourmet.cakeshop.ui.navigation.Screen

@Composable
fun AdminDashboardScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Admin Dashboard") })  // CHANGE THIS LINE
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item {
                Text("Admin Controls", style = MaterialTheme.typography.titleLarge)
                Spacer(modifier = Modifier.height(24.dp))

                Button(
                    onClick = { navController.navigate(Screen.AdminProducts.route) },
                    modifier = Modifier.padding(8.dp)
                ) {
                    Text("Manage Products")
                }

                Button(
                    onClick = { navController.navigate(Screen.AdminOrders.route) },
                    modifier = Modifier.padding(8.dp)
                ) {
                    Text("Manage Orders")
                }

                Button(
                    onClick = { navController.navigate(Screen.AdminStaff.route) },
                    modifier = Modifier.padding(8.dp)
                ) {
                    Text("Manage Staff")
                }

                Spacer(modifier = Modifier.height(32.dp))

                Button(
                    onClick = { navController.navigate(Screen.Home.route) },
                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondary)
                ) {
                    Text("Back to Customer View")
                }
            }
        }
    }
}