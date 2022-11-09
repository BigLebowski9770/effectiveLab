package com.android.marvlabeff.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter
import com.android.marvlabeff.R
import com.android.marvlabeff.navigation.NavRoute
import com.android.marvlabeff.textHero


@Composable
fun IronManScreen(navController: NavHostController) {

    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            Modifier
                .background(Color.DarkGray)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row(modifier = Modifier
                .fillMaxWidth()
                .background(Color.DarkGray)
                .padding(6.dp),
                horizontalArrangement = Arrangement.Start
            ) {
                Button(onClick = {navController.navigate(route = NavRoute.Main.route)},
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.DarkGray,
                        contentColor = Color.White)
                )
                {
                    Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = null,


                        )


                }
            }

            Spacer(modifier = Modifier.size(10.dp))

            Image(
                painter = rememberAsyncImagePainter(
                    "https://img3.akspic.ru/crops/7/2/7/7/6/167727/167727-iron_man_with_batman_cape-1440x2960.jpg"),
                contentDescription = null,
                modifier =
                Modifier
                    .fillMaxSize(0.8f)
            )

            textHero(replica = "Iron Man")


//            Text(
//                text = "I am Hero",
//                modifier = Modifier
//                    .padding(top = 6.dp),
//                fontSize = 40.sp,
//                color = Color.White,
//                fontWeight = FontWeight.Bold,
//                style = TextStyle(
//                    fontSize = 24.sp,
//                    shadow = Shadow(
//                        color = Color.Blue,
//                        blurRadius = 3f
//                    )
//                )
//            )

        }

    }
}


@Preview(showBackground = true)
@Composable
fun PreviewByIronman() {
    CptAmericaScreen(navController = rememberNavController())
}