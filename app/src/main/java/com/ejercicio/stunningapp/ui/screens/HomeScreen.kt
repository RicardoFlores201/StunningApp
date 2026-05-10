package com.ejercicio.stunningapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.ejercicio.stunningapp.ui.sections.BodySection
import com.ejercicio.stunningapp.ui.sections.HeaderSection
import com.ejercicio.stunningapp.ui.sections.TrendSection

@Composable
fun HomeScreen(){
    Column(
        modifier = Modifier.fillMaxSize().background(Color.White).verticalScroll(rememberScrollState())
    ) {
        HeaderSection()
        BodySection()
        TrendSection()
        Spacer(modifier = Modifier.height(80.dp))
    }
}