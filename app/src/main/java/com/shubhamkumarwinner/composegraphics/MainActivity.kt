package com.shubhamkumarwinner.composegraphics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.withTransform
import androidx.compose.ui.tooling.preview.Preview
import com.shubhamkumarwinner.composegraphics.ui.theme.ComposeGraphicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeGraphicsTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    DrawRectangle()
                }
            }
        }
    }
}

@Composable
fun DrawLine() {
    Canvas(modifier = Modifier.fillMaxSize()) {
        val canvasWidth = size.width
        val canvasHeight = size.height

        drawLine(
            start = Offset(x = canvasWidth, y = 0f),
            end = Offset(x = 0f, y = canvasHeight),
            color = Color.Blue,
            strokeWidth = 10f
        )
    }
}


@Composable
fun DrawRectangle() {
    Canvas(modifier = Modifier.fillMaxSize()) {
        val canvasQuadrantSize = size / 2F
//        inset(50F, 30F) {
//            drawRect(
//                color = Color.Blue,
////                topLeft = Offset(x = 100f, y = 200f),
////            size = Size(width = 800f, height = 600f)
//                size = canvasQuadrantSize
//            )
//        }


//        rotate(degrees = 45F) {
//            drawRect(
//                color = Color.Blue,
////                topLeft = Offset(x = 100f, y = 200f),
////            size = Size(width = 800f, height = 600f)
//                size = canvasQuadrantSize
//            )
//        }


//        drawRect(
//            color = Color.Blue,
//            topLeft = Offset(x = 100f, y = 200f),
////            size = Size(width = 800f, height = 600f)
//            size = canvasQuadrantSize
//        )

        withTransform({
            translate(left = size.width / 5F)
            rotate(degrees = 45F)
        }) {
            drawRect(
                color = Color.Gray,
                topLeft = Offset(x = size.width / 3F, y = size.height / 3F),
                size = Size(width = size.width, height = size.height) / 3F
            )
        }
    }
}

@Composable
fun DrawLinedRectangle() {
    Canvas(modifier = Modifier.fillMaxSize()) {

        drawLine(
            start = Offset(x = 100f, y = 200f),
            end = Offset(x = 700f, y = 200f),
            color = Color.Blue,
            strokeWidth = 10f
        )
        drawLine(
            start = Offset(x = 100f, y = 200f),
            end = Offset(x = 100f, y = 800f),
            color = Color.Blue,
            strokeWidth = 10f
        )
        drawLine(
            start = Offset(x = 100f, y = 800f),
            end = Offset(x = 700f, y = 800f),
            color = Color.Blue,
            strokeWidth = 10f
        )
        drawLine(
            start = Offset(x = 700f, y = 200f),
            end = Offset(x = 700f, y = 800f),
            color = Color.Blue,
            strokeWidth = 10f
        )
        drawLine(
            start = Offset(x = 100f, y = 200f),
            end = Offset(x = 700f, y = 800f),
            color = Color.Blue,
            strokeWidth = 10f
        )
        drawLine(
            start = Offset(x = 100f, y = 800f),
            end = Offset(x = 700f, y = 200f),
            color = Color.Blue,
            strokeWidth = 10f
        )
    }
}

@Composable
fun DrawCircle() {
    Canvas(modifier = Modifier.fillMaxSize()) {
        val canvasWidth = size.width
        val canvasHeight = size.height
        drawCircle(
            color = Color.Blue,
            center = Offset(x = canvasWidth / 2, y = canvasHeight / 2),
            radius = size.minDimension / 4
        )
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeGraphicsTheme {
        DrawRectangle()
    }
}