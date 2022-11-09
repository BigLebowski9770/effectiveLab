package com.android.marvlabeff.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Card
import androidx.compose.material.Text
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
import com.android.marvlabeff.R
import com.android.marvlabeff.navigation.NavRoute
import com.android.marvlabeff.ui.theme.*
import androidx.compose.foundation.layout.Column as Column1


@Composable
fun MainScreen(navController: NavHostController) {


    Card(
        modifier = Modifier
            .background(Color.Gray)
            .padding(10.dp)
            .fillMaxSize()
    ) {
        Column1(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.DarkGray),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.marvel_studio_logo),
                contentDescription = "This is logo",
                modifier = Modifier
                    .size(150.dp)
            )

            Spacer(
                modifier = Modifier
                    .size(30.dp)
            )

            Text(
                text = "Choose your hero",
                modifier = Modifier,
                fontSize = 40.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                style = TextStyle(
                    fontSize = 24.sp,
                    shadow = Shadow(
                        color = Color.Blue,
                        blurRadius = 3f
                    )
                )
            )
            Spacer(
                modifier = Modifier
                    .size(30.dp)
            )


            LazyRow(
                modifier = Modifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,


                ) {

                item {
                    Column1(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(GreenForCpt)
                            .clickable {
                                navController.navigate(route = NavRoute.Cpt_america.route)
                            },
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,


                    ) {
                        Image(
                            painter = painterResource(R.drawable.america),
                            contentDescription = "Ctp",
                            modifier = Modifier
                                .size(370.dp)
                                .padding(5.dp)

                        )

                        Text(
                            text = "Captain America",
                            fontSize = 40.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }

                item {
                    Column1(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(PinkForDeadpool)
                            .clickable {
                                navController.navigate(route = NavRoute.Deadpool.route)
                            },
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(R.drawable.deadpool),
                            contentDescription = "Deadpool",
                            modifier = Modifier
                                .size(370.dp)
                                .padding(5.dp)
                        )

                        Text(
                            text = "Deadpool",
                            fontSize = 40.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }

                item {
                    Column1(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(ForDoctor)
                            .clickable {
                                       navController.navigate(route = NavRoute.Doctor.route)
                            },
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(R.drawable.doctor),
                            contentDescription = "Doctor Strange",
                            modifier = Modifier
                                .size(370.dp)
                                .padding(5.dp)
                        )

                        Text(
                            text = "Doctor Strange",
                            fontSize = 40.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }

                item {
                    Column1(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(GrayForIronMan)
                            .clickable {
                                navController.navigate(route = NavRoute.Iron_man.route)
                            },
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(R.drawable.ironman),
                            contentDescription = "Iron Man",
                            modifier = Modifier
                                .size(370.dp)
                                .padding(5.dp)
                        )

                        Text(
                            text = "Iron Man",
                            fontSize = 40.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }

                item {
                    Column1(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(RedForSpider)
                            .clickable {
                            navController.navigate(route = NavRoute.Spiderman.route)
                        },
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(R.drawable.spiderman),
                            contentDescription = "Spider Man",
                            modifier = Modifier
                                .size(370.dp)
                                .padding(5.dp)
                        )

                        Text(
                            text = "Spider Man",
                            fontSize = 40.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }

                item {
                    Column1(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Purple200)
                            .clickable {
                                navController.navigate(route = NavRoute.Thanos.route)
                            },
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(R.drawable.thanos),
                            contentDescription = "Thanos",
                            modifier = Modifier
                                .size(370.dp)
                                .padding(5.dp)
                        )

                        Text(
                            text = "Thanos",
                            fontSize = 40.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }

                item {
                    Column1(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(BlueForThor)
                            .clickable {
                                navController.navigate(route = NavRoute.Thor.route)
                            },
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(R.drawable.thor), contentDescription = "Thor",
                            modifier = Modifier
                                .size(370.dp)
                                .padding(5.dp)
                        )

                        Text(
                            text = "Thor",
                            fontSize = 40.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }

            }


        }
    }
}



//@Composable
//fun HeroList(image : Int, name :String){
//
//    Surface(
//        color = MaterialTheme.colors.primary,
//        modifier = Modifier
//            .padding(horizontal = 4.dp, vertical = 8.dp)
//    ) {
//
//
//    }
//
//}


@OptIn(ExperimentalFoundationApi::class)
@Preview
@Composable
fun PreviewMain() {
    MainScreen(navController = rememberNavController())

}

//@Preview
//@Composable
//fun Carantin() {
//    HeroList(image = R.drawable.cpt, name = "ДЛоа")
//}