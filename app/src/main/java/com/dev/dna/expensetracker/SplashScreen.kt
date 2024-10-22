package com.dev.dna.expensetracker

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.dev.dna.expensetracker.ui.theme.InterFontFamily
import com.dev.dna.expensetracker.ui.theme.White
import com.dev.dna.expensetracker.ui.theme.Zinc
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navController: NavController
) {
    LaunchedEffect(Unit) {
        delay(3000)
        navController.navigate("/home") {
            popUpTo("/splash") { inclusive = true }
        }
    }

    // SplashScreen UI
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize().background(color = Zinc)
    ) {
        Text(
            text = "mono",
            fontFamily = InterFontFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 50.sp,
            color = White
        )
    }
}