package com.optic.moveon.presentation.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun DefaultButton(
    text: String,
    onClick: () -> Unit,
    color: androidx.compose.ui.graphics.Color = MaterialTheme.colorScheme.primary,
    icon: ImageVector = Icons.Default.ArrowForward
)
{
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp),
        onClick = { onClick() },
        colors = ButtonDefaults.buttonColors(color)
    ) {
        Text(text = text)
        Icon(
            imageVector = icon,
            contentDescription = "")
    }
    Spacer(modifier = Modifier.height(20.dp))

}