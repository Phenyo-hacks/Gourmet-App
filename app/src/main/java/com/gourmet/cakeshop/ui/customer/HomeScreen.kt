package com.gourmet.cakeshop.ui.customer


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.gourmet.cakeshop.ui.navigation.Screen
import com.gourmet.cakeshop.ui.components.BottomNavBar

@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(  // CHANGE THIS
                title = { Text("GOURMET") }
            )
        },
        // ... rest stays the same
        bottomBar = {
            BottomNavBar(navController = navController, currentRoute = Screen.Home.route)
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item {
                Text(
                    text = "Welcome to GOURMET",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(16.dp)
                )

                Button(
                    onClick = { navController.navigate(Screen.Products.route) },
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text("Browse Products")
                }

                Button(
                    onClick = { navController.navigate(Screen.Orders.route) },
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text("My Orders")
                }
            }
        }
    }
}