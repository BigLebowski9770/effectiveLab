package com.android.marvlabeff

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.lang.reflect.Modifier as Modifier1


@Composable
fun MyRow(ItemId : Int, Title : String){

    Column(modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    , verticalArrangement = Arrangement.Bottom

    ) {

        Image(painter = painterResource(id = ItemId),
            contentDescription = "This is hero",
            modifier = Modifier
                .size(310.dp)
                .padding(5.dp)

        )

        Text(text = Title
        , fontSize = 40.sp
        ,color = Color.White
        , fontWeight = FontWeight.Bold)
    }
}

@Preview
@Composable
fun Carantin(){
    MyRow(ItemId = R.drawable.america, Title = "ДЛоа")
}