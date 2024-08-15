package com.example.myapplication

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.myapplication.ui.theme.AnaRenk
import com.example.myapplication.ui.theme.YaziRenk1

@Composable
fun Chip(icerik:String){
    Button(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(containerColor = AnaRenk, contentColor = YaziRenk1)
    ) {
        Text(text = icerik)

    }
}