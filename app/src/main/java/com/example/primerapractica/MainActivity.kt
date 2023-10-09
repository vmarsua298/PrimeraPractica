package com.example.primerapractica

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.primerapractica.ui.theme.PrimeraPracticaTheme
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrimeraPracticaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    Greeting(text1 = getString(R.string.texto1), text2 = getString(R.string.texto2), text3 = getString(R.string.texto3))
                }
            }
        }
    }
}

@Composable
fun Greeting(text1: String, text2: String, text3: String, modifier: Modifier = Modifier) {
    Column (verticalArrangement = Arrangement.Center, modifier = modifier){
        GreetingImage(name = "primera imagen")
        Text(
            text = text1,
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            text = text2,
            modifier = Modifier.padding(horizontal = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = text3,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}
@Composable
fun GreetingImage(name: String){
    val image = painterResource(R.drawable.bg_compose_background)
    Image(
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.FillWidth,

    )
}