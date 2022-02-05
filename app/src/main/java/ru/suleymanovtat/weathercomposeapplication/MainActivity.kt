package ru.suleymanovtat.weathercomposeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.suleymanovtat.weathercomposeapplication.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherComposeApplicationTheme {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            brush = Brush.verticalGradient(
                                colors = listOf(
                                    Purple700,
                                    Teal200
                                )
                            )
                        )
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .verticalScroll(rememberScrollState())
                            .fillMaxWidth()
                    ) {
                        TextCity("Naberezhnye Chelny")
                        TextUpdatedTime("Updated at: 05.02.2022 02.44pm")
                    }
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        TextPrecipitation("Hate")
                        TextTemperature("15°C")
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center
                        ) {
                            TextTemperatureMaxMin("Min Temp 15°C")
                            TextTemperatureMaxMin("Max Temp 18°C")
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun TextCity(text: String) {
    Text(
        text = text, color = White,
        modifier = Modifier.padding(top = 26.dp),
        fontSize = 24.sp,
        fontFamily = FontFamily.Monospace,
        fontWeight = FontWeight.Bold
    )
}

@Composable
fun TextUpdatedTime(text: String) {
    Text(
        text = text,
        modifier = Modifier.padding(top = 14.dp),
        color = White,
        fontFamily = FontFamily.Monospace,
        fontWeight = FontWeight.Normal
    )
}

@Composable
fun TextTemperature(text: String) {
    Text(
        text = text,
        color = White,
        fontSize = 72.sp,
        fontFamily = FontFamily.Serif,
        fontWeight = FontWeight.Normal
    )
}

@Composable
fun TextPrecipitation(text: String) {
    Text(
        text = text,
        color = White,
        fontSize = 16.sp,
        fontFamily = FontFamily.Monospace,
        fontWeight = FontWeight.Medium
    )
}

@Composable
fun TextTemperatureMaxMin(text: String) {
    Text(
        text = text,
        color = White50,
        fontSize = 14.sp,
        fontFamily = FontFamily.Serif,
        fontWeight = FontWeight.Normal,
        modifier = Modifier.padding(16.dp)
    )
}

