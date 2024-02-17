package com.example.holamundo.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Call
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.holamundo.R

@Preview(showBackground = true)
@Composable
fun TheImage(){
    Column(){
        Image(painter = painterResource(id = R.drawable.inspo_de_arte),
            contentDescription = "Imagen de prueba",
        modifier = Modifier
            .size(280.dp),
            contentScale = ContentScale.FillBounds,
            alpha = 0.7f
        )
        Text(text = "Pintura Loka")

    }

}


@Preview(showBackground = true)
@Composable
fun TheIcon(){
    Column(modifier = Modifier.fillMaxSize()) {
        Icon(painter = painterResource(id = R.drawable.baseline_cookie_24),
            contentDescription = "icono",
            tint = Color(0xFFCECF83)
        )

        Icon(imageVector = Icons.Filled.Call,
        contentDescription ="icon2",
            tint = Color(0xFF7FB481)
        )
    }
}