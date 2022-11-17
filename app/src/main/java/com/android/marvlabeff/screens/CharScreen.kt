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
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.compose.rememberAsyncImagePainter
import com.android.marvlabeff.navigation.NavRoute
import com.android.marvlabeff.textHero

@Composable
fun CharacterScreen(navController: NavHostController,) {

    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            Modifier
                .background(Color.DarkGray)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.DarkGray)
                    .padding(6.dp),
                horizontalArrangement = Arrangement.Start
            ) {
                Button(
                    onClick = { navController.navigate(route = NavRoute.Main.route) },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.DarkGray,
                        contentColor = Color.White
                    )
                )
                {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack, contentDescription = null,


                        )


                }
            }

            Spacer(modifier = Modifier.size(10.dp))

            Image(
                painter = rememberAsyncImagePainter(
                    "https://img1.akspic.ru/crops/0/4/5/9/6/169540/169540-mertvyj_bassejn-yad_dedpul-yad-dedpul-eddi_brok-1440x2960.jpg"
                ),
                contentDescription = null,
                modifier =
                Modifier
                    .fillMaxSize(0.8f)
            )

            textHero(replica = "Deadpool")
        }}}