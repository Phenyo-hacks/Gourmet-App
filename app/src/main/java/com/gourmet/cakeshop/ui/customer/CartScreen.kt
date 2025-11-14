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
fun CartScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(  // CHANGE THIS
                title = { Text("Shopping Cart") }
            )
        },

        bottomBar = {
            BottomNavBar(navController = navController, currentRoute = Screen.Cart.route)
        },
        floatingActionButton = {
            ExtendedFloatingActionButton(
                onClick = { navController.navigate(Screen.Checkout.route) },
                modifier = Modifier.padding(16.dp)
            ) {
                Text("Checkout")
            }
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            items(3) { index ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text("Cart Item ${index + 1}", style = MaterialTheme.typography.titleMedium)
                        Text("R${(index + 1) * 25}.00", style = MaterialTheme.typography.bodyLarge)
                    }
                }
            }
        }
    }
}