package com.ejercicio.stunningapp.ui.sections

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ejercicio.stunningapp.R
import com.ejercicio.stunningapp.ui.components.TrendItem
import com.ejercicio.stunningapp.ui.model.Trend
import com.ejercicio.stunningapp.ui.theme.DarkBlue

@Composable
fun TrendSection(){
    val trends = listOf(
        Trend("Futuro de la IA", "¿Un problema?", R.drawable.trends),
        Trend("Tecnología", "crecimiento exponencial", R.drawable.trends2),
        Trend("Inteligencia Artificial", "Presente o Futuro", R.drawable.trends)
    )
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
                .padding(top = 32.dp, bottom = 12.dp)
        ) {
            Text(
                text = "Tendencias",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = DarkBlue,
                modifier = Modifier.weight(1f)
            )

            Text(
                text = "Ver todo",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = DarkBlue,
                modifier = Modifier.clickable{}
            )
        }
        LazyRow(
            contentPadding = PaddingValues(horizontal = 24.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(trends){
                    item ->
                TrendItem(trend = item)
            }
        }
    }
}