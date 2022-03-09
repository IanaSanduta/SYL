package com.example.syl

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.syl.ui.theme.*
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


@Composable
fun HomeScreen(navController: NavController) {



/*
    ImageWithBackground(
        painter = painterResource(id = R.drawable.newlogo),
        backgroundDrawableResId = R.drawable.newlogo,
        contentDescription = "",
        modifier = Modifier
            .fillMaxSize(),
        //contentScale = ContentScale.Crop
    )
   

 */



    Scaffold() {
        ImageWithBackground(
            painter = painterResource(id = R.drawable.newlogo),
            backgroundDrawableResId = R.drawable.newlogo,
            contentDescription = "",
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp, vertical = 40.dp)//top = 120.dp)
            //contentScale = ContentScale.Crop
        )
        //Spacer(modifier = Modifier.padding(top = 170.dp))

        val scrollState = rememberScrollState()
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 10.dp),
            verticalArrangement = Arrangement.Top
        ) {
            Column(
                modifier = Modifier
                    .padding(20.dp)
                    .align(Alignment.CenterHorizontally)
            )
            {

                Text(
                    text = "Track Your Habits", fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .clickable {
                            //navController.navigate(Screen.Login.route)
                        },
                    //style = MaterialTheme.typography.h2,
                    //style = Typography.h1,
                    fontSize = 78.sp,
                    color = LightModeDarkBlue

                )

                Spacer(modifier = Modifier.padding(top = 300.dp))
                Text(
                    text = "Be inspired by your success",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.Bold,
                        color = Color.Gray
                    )
                )
                Spacer(modifier = Modifier.padding(top = 20.dp))
                Text(
                    text = "Explore some of the tips to help boost your productivity throughout  the day ",
                    style = MaterialTheme.typography.body1,
                    color = lightFont

                )
                Spacer(modifier = Modifier.padding(top = 55.dp))
                Button(
                    onClick = { navController.navigate(Screen.Login.route) },
                    modifier = Modifier.fillMaxWidth().padding(5.dp),
                    colors = ButtonDefaults.textButtonColors
                        (
                        backgroundColor = purple
                    ),
                    shape = RoundedCornerShape(40),
                ) {
                    Text("Explore",
                        fontWeight = FontWeight.Bold,
                        style = MaterialTheme.typography.button,
                        color = Color(0xFFFFFFFF),
                        fontSize = 18.sp,
                    )
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview() {
    HomeScreen(navController = rememberNavController())
}
