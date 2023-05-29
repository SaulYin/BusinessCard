package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, title: String, location: String, github: String, email: String,
             modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxHeight(), verticalArrangement = Arrangement.SpaceAround) {
        Column(modifier = modifier
            .fillMaxWidth()
            .padding(top = 80.dp),
               horizontalAlignment = Alignment.CenterHorizontally) {
            // Icon
            Icon(imageVector = Icons.Rounded.AccountCircle,
                 contentDescription = "Person Icon",
                 modifier = Modifier
                     .height(80.dp)
                     .width(80.dp))
            // Name
            Text(
                text = name,
                fontSize = 60.sp,
            )

            // Title
            Text(
                text = title,
                fontSize = 25.sp,
            )
        }

        Column(modifier = Modifier.fillMaxWidth()) {
            Row(modifier = modifier.padding(start = 100.dp)){
                Icon(imageVector = Icons.Rounded.LocationOn, contentDescription = "Phone Icon")
                Text(text = location, modifier = modifier.padding(start = 50.dp))
            }
            Row(modifier = modifier.padding(start = 100.dp)) {
                Icon(imageVector = Icons.Rounded.Home, contentDescription = "Home Icon")
                Text(text = github, modifier = modifier.padding(start = 50.dp))
            }

            Row(modifier = modifier.padding(start = 100.dp)) {
                Icon(imageVector = Icons.Rounded.Email, contentDescription = "Email Icon")
                Text(text = email, modifier = modifier.padding(start = 50.dp))
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        Greeting("Saul Yin", "SDE", "Boston, MA",
                "https://github.com/SaulYin", "sihaoyin97@gmail.com")
    }
}