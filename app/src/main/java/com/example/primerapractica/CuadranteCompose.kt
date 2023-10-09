package com.example.primerapractica

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.primerapractica.ui.theme.PrimeraPracticaTheme

class CuadranteCompose: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrimeraPracticaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TextComposable(text1 = getString(R.string.composableTexto), text2 = getString(R.string.contenidoComposableTexto))
                }
            }
        }
    }
}
@Composable
fun TextComposable(text1: String, text2: String, modifier: Modifier = Modifier){
    Row (verticalAlignment = Alignment.Top){
        Column (horizontalAlignment = Alignment.Start){
            Text(
                text = text1,
                modifier = Modifier
                    .background(Color(0xFFEADDFF))
                    .padding(16.dp)

            )
        }
    }
}
@Composable
fun ImageComposable(){

}
@Composable
fun RowComposable(){

}

@Composable
fun ColumnComposable(){

}