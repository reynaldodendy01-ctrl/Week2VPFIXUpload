package com.example.week2vpfix

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.example.week2vpfix.soal2.soal2View // Import fungsi dari file soal2.kt
import com.example.week2vpfix.ui.theme.Week2VPFIXTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Week2VPFIXTheme {
                // Panggil tampilan soal2View di sini
                soal2View()
            }
        }
    }
}