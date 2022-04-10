package com.example.syl

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.Absolute.Center
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIconDefaults.Text
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.syl.ui.theme.LightBack
import com.example.syl.ui.theme.SYLTheme
import com.example.syl.ui.theme.purple
import com.example.syl.ui.theme.white


@Composable
fun DashboardScreen(navController: NavController) {

    Scaffold() {
        Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Top) {
            TopAppBar(
                title = { Text("Dashboard") },
                navigationIcon = {
                    IconButton(onClick = { /* doSomething() */ }) {
                        Icon(Icons.Filled.Menu, contentDescription = null)
                    }
                },
                actions = {
                    // RowScope here, so these icons will be placed horizontally
                    IconButton(onClick = { /* doSomething() */ }) {
                        Icon(Icons.Filled.Favorite, contentDescription = "Localized description")
                    }
                    IconButton(onClick = { /* doSomething() */ }) {
                        Icon(Icons.Filled.Search, contentDescription = "Localized description")
                    }
                }
            )
            //Spacer(modifier = Modifier.padding(20.dp))

            Row(
                Modifier
                    //.fillMaxSize()
                    .padding(12.dp)
            ) {
                Column(
                    Modifier
                        //.fillMaxSize()
                        .padding(22.dp)
                ) {
                    Card(
                       // Modifier
                           // .weight(9f),
                        //.padding(8.dp),
                        //Modifier.padding(30.dp),
                        backgroundColor = purple,
                        shape = RoundedCornerShape(32.dp),
                    ) {
                        Text(
                            modifier = Modifier.padding(10.dp),
                            text = "New Habit",
                            color = white
                        )
                    }
                }
            }
            Row(
                Modifier
                   // .fillMaxSize()
                    .padding(12.dp)
            ) {
                Card(
                   // Modifier
                        //.weight(9f),
                    //.padding(8.dp),
                    //Modifier.padding(30.dp),
                    backgroundColor = purple,
                    shape = RoundedCornerShape(32.dp),
                ) {
                    Text(
                        modifier = Modifier.padding(10.dp),
                        text = "New Habit",
                        color = white

                    )
                }
            }
        }

    }


}

@Composable
@Preview(showBackground = true)
fun DashboardScreenPreview() {
    DashboardScreen(navController = rememberNavController())
}