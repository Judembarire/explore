package com.angy.mbarire

import android.content.ClipData.Item
import android.icu.text.ListFormatter.Width
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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.angy.mbarire.ui.theme.MbarireTheme

class AssignmentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Explore()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Explore() {

  LazyColumn(

      modifier = Modifier
          .fillMaxSize()
          .background(Color.White),

  ) {
     item {
         Row(
             modifier = Modifier
                 .height(100.dp)
                 .fillMaxWidth()

         ) {
             Column(
                 modifier = Modifier
                     .fillMaxHeight()
                     .width(120.dp),
                 horizontalAlignment = Alignment.CenterHorizontally,
                         verticalArrangement = Arrangement.Center

             ) {
Icon(imageVector = Icons.Default.AddCircle , contentDescription = "")
             }
             Column(
                 modifier = Modifier
                     .fillMaxHeight()
                     .width(150.dp),
                 horizontalAlignment = Alignment.CenterHorizontally,
                 verticalArrangement = Arrangement.Center

             ) {
            Text(text = "Current location")
                 Icon(imageVector = Icons.Default.LocationOn , contentDescription = "")
                 Spacer(modifier = Modifier.height(2.dp))
            Text(text = "Denpasar, Bali")
                 
             }
             Column(
                 modifier = Modifier
                     .fillMaxHeight()
                     .width(120.dp),
                 horizontalAlignment = Alignment.CenterHorizontally,
                 verticalArrangement = Arrangement.Center
             ) {
                 Icon(imageVector = Icons.Default.Person , contentDescription = "")
              }




         }
         Spacer(modifier = Modifier.height(30.dp))


       Row(
           modifier = Modifier
               .fillMaxWidth()
               .height(330.dp)
               .padding(11.dp)
       ) {
Column(
    modifier = Modifier
        .fillMaxHeight()
        .width(170.dp)
) {
Button(
    onClick = { /*TODO*/ },
    colors = ButtonDefaults.buttonColors(Color.Gray),
    shape = RoundedCornerShape(10.dp),

    modifier = Modifier
        .width(150.dp)
        .height(50.dp)

    ) {
    Icon(imageVector =Icons.Default.AddCircle  , contentDescription = "")
    Spacer(modifier = Modifier.width(20.dp))
    Text(text = "Hotels")
}

    Spacer(modifier = Modifier.height(30.dp))
    Button(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(Color.Gray),
        shape = RoundedCornerShape(10.dp),

        modifier = Modifier
            .width(150.dp)
            .height(50.dp)

    ) {
        Icon(imageVector =Icons.Default.AddCircle  , contentDescription = "")
        Spacer(modifier = Modifier.width(25.dp))
        Text(text = "Taxi")
    }

    Spacer(modifier = Modifier.height(30.dp))
    Button(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(Color.Gray),
        shape = RoundedCornerShape(10.dp),

        modifier = Modifier
            .width(150.dp)
            .height(50.dp)

    ) {
        Icon(imageVector =Icons.Default.AddCircle  , contentDescription = "")
        Spacer(modifier = Modifier.width(15.dp))
        Text(text = "Airlplanes")
    }



}

Column(
//    modifier = Modifier
//        .width(10.dp)
) {

    Button(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(Color.Gray),
        shape = RoundedCornerShape(10.dp),

        modifier = Modifier
            .width(170.dp)
            .height(50.dp)

    ) {
        Icon(imageVector =Icons.Default.AddCircle  , contentDescription = "")
        Spacer(modifier = Modifier.width(20.dp))
        Text(text = "Holiday")
    }

    Spacer(modifier = Modifier.height(30.dp))
    Button(
        onClick = { },
        colors = ButtonDefaults.buttonColors(Color.Gray),
        shape = RoundedCornerShape(10.dp),

        modifier = Modifier
            .width(170.dp)
            .height(50.dp)

    ) {
        Icon(imageVector =Icons.Default.AddCircle  , contentDescription = "")
        Spacer(modifier = Modifier.width(25.dp))
        Text(text = "Ticket")
    }

    Spacer(modifier = Modifier.height(30.dp))
    Button(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(Color.Gray),
        shape = RoundedCornerShape(10.dp),

        modifier = Modifier
            .width(170.dp)
            .height(50.dp)

    ) {
        Icon(imageVector =Icons.Default.AddCircle  , contentDescription = "")
        Spacer(modifier = Modifier.width(15.dp))
        Text(text = "Harbour")
    }



}



}
         Spacer(modifier = Modifier.height(1.dp))
         Row(
             modifier = Modifier
                 .height(100.dp)
         ) {
Text(text = "Popular in town")
         }
       }



     }

  }





