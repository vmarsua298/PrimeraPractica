package com.example.primerapractica

import android.content.res.Configuration
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.Wallpapers
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.primerapractica.ui.theme.PrimeraPracticaTheme

class AdminDeTareas : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrimeraPracticaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(text1 = getString(R.string.admintareas1), text2 = getString(R.string.admintareas2))
                }
            }
        }
    }
}

@Composable
fun Greeting(text1: String, text2: String, modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.ic_task_completed)
    Column (verticalArrangement = Arrangement.Center, modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally){
        Image(
            painter = image,
            contentDescription = "Img. completado",
            contentScale = ContentScale.Fit,
        )
        Text(
            text = text1,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = text2,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify
            )
    }
}
