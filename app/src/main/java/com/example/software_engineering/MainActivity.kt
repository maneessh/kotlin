package com.example.software_engineering

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.software_engineering.ui.theme.SoftwareEngineeringTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainHeading()

        }
    }
}

@Composable
fun MainBody(){

}

@Composable
fun MainHeading() {

    Scaffold { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding)
        ){
            Text(text = "Hello")
            Text(text = "World")
        }
        Row(
            modifier = Modifier.padding(innerPadding)
        ){
            Text(text = "Bye")
            Text(text = "man")
        }
    }
}

@Composable
fun MainFooter(){

}