package com.example.composeone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.example.composeone.ui.ComposeOneTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsStory()
        }
    }

    @Composable
    fun NewsStory(){
        Column(
                modifier = Modifier.padding(15.dp) ){
            Text("A day in Shark Fin Cove")
            Text("Raipur, Chhattisgarh")
            Text("August 2020")
        }

    }

    @Preview
    @Composable
    fun DefaultPreview() {
        NewsStory()
    }
}


