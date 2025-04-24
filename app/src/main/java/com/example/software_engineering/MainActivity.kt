package com.example.software_engineering

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.software_engineering.ui.theme.SoftwareEngineeringTheme
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold { innerPadding ->
                ProfileBody(innerPadding)
                PreviewProfile()


            }

        }
    }


@Composable
fun  ProfileBody(innerPadding : PaddingValues) {
    Column(
        modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize()
            .background(color = Color.White)

    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween

        ){
            //method 1
            Icon(imageVector = Icons.Default.KeyboardArrowLeft,
                tint = Color.Red,
                contentDescription = null, modifier = Modifier
                    .height(28.dp)
                    .width(22.dp).clickable {  }
            )

            Text(text = "Andrew", style = TextStyle(
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold

            ))
            //Method 2
            Icon(
                painter = painterResource(R.drawable.baseline_more_horiz_24),
                tint = Color.Red,
                contentDescription = null, modifier = Modifier
                    .height(50.dp)
                    .width(30.dp)
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround

        ){
            Image(
                painter = painterResource(R.drawable.photo),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp)
                    .clip(shape = RoundedCornerShape(100.dp))
            )
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "174")
                Text(text = "Posts")
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(text = "772K")
                Text(text = "Followers")
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "0")
                Text(text = "Following")
            }
        }
        Column (
            modifier = Modifier.padding(horizontal = 15.dp , vertical = 15.dp)
        ){
            Text(text = "Andrew Queo",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                ))
            Text(text = "Artist",
                modifier = Modifier.alpha(alpha = 0.5f))
            Text(text = "DESIGNER")
            Text(text = "isabella@art.design")
            Text(text = "Followed by jenna and anna")
        }
        Row (
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween

        ){
            Button(onClick = {
                //TODO when button clicked
            },
                shape = RoundedCornerShape(10.dp),

                ) {
                Text("Follow")
            }
            OutlinedButton(
                onClick = {

                }
            ) {
                Text("Message")
            }
            OutlinedButton(
                onClick = {

                }
            ) {
                Text("Email")
            }
            OutlinedButton(
                onClick = {

                }
            ) {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowDown,
                    contentDescription = null,
                    modifier = Modifier
                        .height(20.dp)
                        .width(20.dp)
                )
            }
        }
        //
        Row{
            Card(modifier = Modifier.height(200.dp).weight(1f)) { }
        }
        Spacer(modifier = Modifier.width(20.dp))
        Card(modifier = Modifier.height(200.dp).weight(3f)) {

        }
    }


}

@Preview(showBackground = true)
@Composable
fun PreviewProfile(){
    ProfileBody(innerPadding = PaddingValues(0.dp))
}
}

