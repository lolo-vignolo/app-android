package com.example.descuentosapp.components

import android.provider.CalendarContract.Colors
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun SpaceH (size: Dp = 5.dp) {
    Spacer(modifier = Modifier.height(size))
}

@Composable
fun SpaceW (size: Dp = 5.dp) {
    Spacer(modifier = Modifier.width(size))
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTextField(
    label: String,
    value: String,
    onValueChange: (String) -> Unit
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(label) },
        keyboardOptions = KeyboardOptions( keyboardType = KeyboardType.Number),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 5.dp)
    )
}

@Composable
fun MainButton(
    text: String,
    onClick: () -> Unit,
    color: Color = MaterialTheme.colorScheme.primary
) {
    OutlinedButton(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 5.dp),
        colors = ButtonDefaults.outlinedButtonColors(
            contentColor = color,
            containerColor = Color.Transparent,
        )
    ) {
        Text(text=text)
    }
}


@Composable
fun Alert ( Title: String,
            message: String,
            confirmText: String,
            onConfirmClick : () -> Unit,
            onDimissClick : () -> Unit
            ){
    
    AlertDialog(onDismissRequest = onDimissClick ,
        title = { Text(Title) },
        text = { Text(message) },
        confirmButton = {
            OutlinedButton(onClick = onConfirmClick) {
                Text(confirmText)
            }
        }
    )
}