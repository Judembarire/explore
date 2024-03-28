package com.angy.mbarire

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.angy.mbarire.ui.theme.MbarireTheme

class ImageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting2()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Greeting2() {
    Column(

        modifier = Modifier
            .background(Color.Gray)
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(3.dp)

    ) {

Image(
    painter = painterResource(id = R.drawable.firefox) ,
    contentDescription = "",

    modifier = Modifier
        .size(300.dp),

//**** change color of image
//    colorFilter = ColorFilter.tint(Color.Blue)


    )


        val homesc = LocalContext.current
        Button(onClick = {
            homesc.startActivity(Intent(homesc, MainActivity::class.java))

        }) {
            Text(text = "Home")
        }
    }
}

