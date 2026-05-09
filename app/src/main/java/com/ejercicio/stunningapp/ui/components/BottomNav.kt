package com.ejercicio.stunningapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.wear.compose.material3.Text
import com.ejercicio.stunningapp.R
import com.ejercicio.stunningapp.ui.theme.DarkBlue

@Composable
fun BottomNavItem(
    iconRes: Int,
    title: String,
    isSelected: Boolean,
    onClick: () -> Unit
){
    val interactionSource = remember { MutableInteractionSource()}
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding(vertical = 4.dp)
            .clickable(interactionSource=interactionSource, indication = null){
                onClick()
            }
    ) {
        Image(
            painter = painterResource(id = iconRes),
            contentDescription = null,
            modifier = Modifier.size(if (isSelected)26.dp else 24.dp),
            alpha = if (isSelected) 1f else 0.5f
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = title,
            fontSize = 11.sp,
            color = if (isSelected) DarkBlue else Color.Gray,
            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium
        )
    }
}

@Composable
fun BottomNavigationBar(
    selectedTab: String,
    onTabSelected: (String) -> Unit
){
    BottomAppBar(
        containerColor = Color.White,
        modifier = Modifier
            .height(80.dp)
            .shadow(
                elevation = 10.dp,
                shape = RoundedCornerShape(
                    topStart = 20.dp,
                    topEnd = 20.dp,
                ),
                spotColor = Color.Black
            )
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            BottomNavItem(
                iconRes = R.drawable.bottom_btn1,
                title = "Inicio",
                isSelected = selectedTab=="Inicio",
                onClick = {onTabSelected("Inicio")}
            )

            BottomNavItem(
                iconRes = R.drawable.bottom_btn2,
                title = "Cartera",
                isSelected = selectedTab=="Cartera",
                onClick = {onTabSelected("Cartera")}
            )

            Spacer(modifier = Modifier.width(40.dp))

            BottomNavItem(
                iconRes = R.drawable.bottom_btn3,
                title = "Perfil",
                isSelected = selectedTab=="Perfil",
                onClick = {onTabSelected("Perfil")}
            )

            BottomNavItem(
                iconRes = R.drawable.bottom_btn4,
                title = "Ajustes",
                isSelected = selectedTab=="Ajustes",
                onClick = {onTabSelected("Ajustes")}
            )
        }
    }
}