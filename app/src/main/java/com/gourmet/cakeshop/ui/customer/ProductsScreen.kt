package com.gourmet.cakeshop.ui.customer

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.gourmet.cakeshop.ui.navigation.Screen
import com.gourmet.cakeshop.ui.components.BottomNavBar

@Composable
fun ProductsScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(  // CHANGE THIS
                title = { Text("Our Products") }
            )
        },
        bottomBar = {
            BottomNavBar(navController = navController, currentRoute = Screen.Products.route)
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            items(10) { index ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    onClick = {
                        navController.navigate(Screen.ProductDetail.createRoute("product-$index"))
                    }
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text("Product ${index + 1}", style = MaterialTheme.typography.titleMedium)
                        Text("R${(index + 1) * 25}.00", style = MaterialTheme.typography.bodyLarge)
                        Button(
                            onClick = { /* Add to cart */ },
                            modifier = Modifier.padding(top = 8.dp)
                        ) {
                            Text("Add to Cart")
                        }
                    }
                }
            }
        }
    }
}