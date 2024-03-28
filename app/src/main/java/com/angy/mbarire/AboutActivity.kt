package com.angy.mbarire

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.angy.mbarire.ui.theme.MbarireTheme

class AboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Task()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Task() {
    Column(
         modifier = Modifier
             .background(Color.Gray)
             .fillMaxWidth()
             .fillMaxHeight()
             .padding(3.dp)

    ) {

        Text(text = "About screen")
        Spacer(modifier = Modifier.height(2.dp))

//***  Buttons
        val home = LocalContext.current
        Button(onClick = {
            home.startActivity(Intent(home, MainActivity::class.java))

        },
            colors = ButtonDefaults.buttonColors(Color.Transparent),
//            shape = RectangleShape
//            shape = RoundedCornerShape(5.dp)
            shape = CutCornerShape(10),
            border = BorderStroke(1.dp, Color.Green)

            ) {

            Text(text = "Home screen")
        }

        Spacer(modifier = Modifier.height(10.dp))
//        ***clickable text

//       val kk = LocalContext.current
//       val ii = AnnotatedString("click to go home")

//        ClickableText(text = ii, onClick =  {
//            kk.startActivity(Intent(kk, MainActivity::class.java))
//
//        })

//        *** Normal text become clickable
        val kk = LocalContext.current
        Text(text = "home", modifier = Modifier.clickable {

            kk.startActivity(Intent(kk, MainActivity::class.java))

        })








    }






}


