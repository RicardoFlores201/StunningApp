package com.ejercicio.stunningapp.ui.sections

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ejercicio.stunningapp.R
import com.ejercicio.stunningapp.ui.theme.DarkBlue
import com.ejercicio.stunningapp.ui.theme.SearchBarColor

@Composable
fun HeaderSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(DarkBlue)
            .padding(32.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.user_2),
                contentDescription = null,
                modifier = Modifier.size(50.dp)
            )

            Spacer(modifier = Modifier.width(16.dp))

            Text(
                text = "Hola, Ricardo",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.weight(1f)
            )

            Image(
                painter = painterResource(R.drawable.notification),
                contentDescription = null,
            )
        }
        Spacer(modifier = Modifier.height(23.dp))

        Text(
            text = "Encuentra tus favoritos",
            color = Color.White,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            lineHeight = 35.sp

        )

        Spacer(modifier = Modifier.width(16.dp))

        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .height(55.dp),
            value = "",
            onValueChange = {},
            placeholder = {
                Text(
                    text = "Buscar",
                    color = Color.White.copy(0.7f)
                )
            },
            leadingIcon = {
                Icon(
                    painter = painterResource(R.drawable.search),
                    contentDescription = null,
                    tint = Color.White
                )
            },
            trailingIcon = {
                Icon(
                    painter = painterResource(R.drawable.microphone),
                    contentDescription = null,
                    tint = Color.White
                )
            },
            shape = RoundedCornerShape(50.dp),
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                cursorColor = Color.White,
                focusedContainerColor = SearchBarColor,
                unfocusedContainerColor = SearchBarColor
            ),
            singleLine = true
        )
    }
}