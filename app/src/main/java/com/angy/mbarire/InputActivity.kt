package com.angy.mbarire

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.angy.mbarire.ui.theme.MbarireTheme

class InputActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Input()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Input(){
Box(
    modifier = Modifier
        .fillMaxSize()
) {

    Image(
        painter = painterResource(id = R.drawable.firefox) ,
        contentDescription = "",

        modifier = Modifier
            .fillMaxSize(),

        contentScale = ContentScale.Crop


    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp),

        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        var name by remember {
            mutableStateOf(TextFieldValue(""))
        }

        TextField(
            value = name,
            onValueChange = {name = it},
            label = {Text(text = "Enter name")},
            leadingIcon = { Icon(imageVector = Icons.Default.Person , contentDescription = "") },

        )



        Spacer(modifier = Modifier.height(15.dp))


        var email by remember {
            mutableStateOf(TextFieldValue(""))
        }

        TextField(
            value = email,
            onValueChange = {email = it},
            label = {Text(text = "Enter email")},
            leadingIcon = { Icon(imageVector = Icons.Default.Email , contentDescription = "") },
        )


        Spacer(modifier = Modifier.height(10.dp))


        var pin by remember {
            mutableStateOf(TextFieldValue(""))
        }

        OutlinedTextField(

            value = pin,
            onValueChange = {pin = it},
            label = {Text(text = "Enter pin")},
            textStyle = TextStyle(Color.Magenta),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock , contentDescription = "") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                   unfocusedBorderColor = Color.Black,
                   focusedBorderColor = Color.Red,
                   unfocusedLabelColor = Color.Black,
                   focusedLabelColor = Color.Red,
                   cursorColor = Color.Red

            )

        )












        val home = LocalContext.current
        Button(onClick = {
            home.startActivity(Intent(home, MainActivity::class.java))
        }) {
            Text(text = "Home")
        }





    }
}

}