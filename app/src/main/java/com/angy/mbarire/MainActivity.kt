package com.angy.mbarire

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.angy.mbarire.ui.theme.MbarireTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting()

        }
    }
}


@Preview(showBackground = true)
@Composable
fun Greeting() {


  Column(
      modifier = Modifier
          .background(Color.Gray)
          .fillMaxWidth()
          .fillMaxHeight(),

      horizontalAlignment = Alignment.CenterHorizontally,
//      verticalArrangement = Arrangement.Center



  ) {
      Row {
          Text(text = "Home")
          
          Spacer(modifier = Modifier.width(10.dp))
              
          
          Text(text = "About")

          Spacer(modifier = Modifier.width(10.dp))
          
          Text(text = "Settings")
          
          
          
      }

      Spacer(modifier = Modifier.height(60.dp))
   Text( "First android app", fontSize = 34.sp)

   Text( "worddssssss", fontFamily = FontFamily.Serif)

   Text( "First android sentence",
       modifier = Modifier
           .background(Color.Cyan)

       )

   Text("Second android sentence")

      val about = LocalContext.current
   Button(onClick = {
       about.startActivity(Intent(about, AboutActivity::class.java))
   }) {
       Text(text = "About")
   }
      val image = LocalContext.current
      Button(onClick = {
          image.startActivity(Intent(image, ImageActivity::class.java))
      }) {
          Text(text = "Image")
      }

      val input = LocalContext.current
      Button(onClick = {
          input.startActivity(Intent(input, InputActivity::class.java))
      }) {
          Text(text = "Input")
      }

      val assignment = LocalContext.current
      Button(onClick = {
          assignment.startActivity(Intent(input, AssignmentActivity::class.java))
      }) {
          Text(text = "assignment")
      }

      val web = LocalContext.current
      Button(onClick = {
          web.startActivity(Intent(input, WebActivity::class.java))
      }) {
          Text(text = "web")
      }


  }
    
    
}



