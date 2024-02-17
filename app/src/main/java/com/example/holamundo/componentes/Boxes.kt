package com.example.holamundo.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//@Preview(showBackground = true)
@Composable
fun TheBox(){
    Box(modifier = Modifier
        .height(80.dp)
        .width(125.dp)
        .verticalScroll(rememberScrollState())
        .background(Color(0xFF7DA8C0))
    ){
    //Aqui el contenido
        Text(text = "Caja 1",
        modifier = Modifier.align(Alignment.TopStart))

        Text(text = "Caja 2",
            modifier = Modifier.align(Alignment.TopCenter))

        Text(text = "Caja 3",
            modifier = Modifier.align(Alignment.TopEnd))

        Text(text = "Caja 4",
            modifier = Modifier.align(Alignment.CenterStart))

        Text(text = "Caja 5",
            modifier = Modifier.align(Alignment.Center))

        Text(text = "Caja 6",
            modifier = Modifier.align(Alignment.CenterEnd))

        Text(text = "Caja 7",
            modifier = Modifier.align(Alignment.BottomStart))

        Text(text = "Caja 8",
            modifier = Modifier.align(Alignment.BottomCenter))

        Text(text = "Caja 9",
            modifier = Modifier.align(Alignment.BottomEnd))

    }
}

@Composable
fun MyNumberBox(numero:Int,
                modificador:Modifier,
                color: Color = Color.Blue)
{
    Text(text = "Caja $numero",
        modifier = modificador,
        color = color
    )
}



@Preview(showBackground = true)
@Composable
fun TheBox2(){
    Box(
        modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFA4D3CE))
    )        {
        MyNumberBox(1,
            Modifier.align((Alignment.TopEnd)))

        MyNumberBox(2,
            Modifier.align((Alignment.TopCenter)),
        Color.Magenta)

        MyNumberBox(3,
            Modifier.align((Alignment.TopStart)),
            Color.Black)

        MyNumberBox(4,
            Modifier.align((Alignment.CenterStart)),
            Color.Gray)

        MyNumberBox(5,
            Modifier.align((Alignment.Center)),
            Color.Red)

        MyNumberBox(6,
            Modifier.align((Alignment.CenterEnd)),
            Color.Green)

        MyNumberBox(7,
            Modifier.align((Alignment.BottomEnd)),
            Color.DarkGray)

        MyNumberBox(8,
            Modifier.align((Alignment.BottomCenter)),
            Color.Yellow)

        MyNumberBox(9,
            Modifier.align((Alignment.BottomStart)),
            Color.White)
        }


}