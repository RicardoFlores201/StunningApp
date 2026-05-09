package com.ejercicio.stunningapp.ui.sections

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ejercicio.stunningapp.R
import com.ejercicio.stunningapp.ui.components.BottomNavigationBar
import com.ejercicio.stunningapp.ui.theme.DarkBlue


@Composable
fun MainAppContainer(){
    var selectedTab by remember { mutableStateOf("Inicio") }

    Scaffold(
        contentWindowInsets = WindowInsets.navigationBars,
        bottomBar = {
            BottomNavigationBar(
                selectedTab = selectedTab,
                onTabSelected = { newTab -> selectedTab = newTab }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                modifier = Modifier
                    .offset(y=50.dp).size(60.dp),
                onClick = {},
                containerColor = DarkBlue,
                contentColor = Color.White,
                shape = CircleShape
            ) {
                Icon(
                    painter = painterResource(id=R.drawable.float_icon),
                    contentDescription = null,
                    modifier = Modifier.size(30.dp)
                )
            }
        },
        floatingActionButtonPosition = FabPosition.Center,
        containerColor = Color.White
    ) {
            paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)){
            when (selectedTab){
                "Inicio" -> {}
                "Cartera" -> {}
                "Perfil" -> {}
                "Ajustes" -> {}
            }
        }

    }
}