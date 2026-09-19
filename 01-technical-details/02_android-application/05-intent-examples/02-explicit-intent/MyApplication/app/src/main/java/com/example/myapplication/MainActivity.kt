package com.example.myapplication

import android.os.Bundle
import android.content.Intent
import android.content.ComponentName
import android.net.Uri
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme




class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    Column {
                        Greeting(
                            name = "Android",
                            modifier = Modifier.padding(innerPadding)
                        )

                        Button(
                            onClick = {

                                val intent = Intent(Intent.ACTION_VIEW )
                                intent.data = Uri.parse("https://www.google.com")
                                intent.setPackage("org.mozilla.firefox")

//                                val firefoxPackageName = "org.mozilla.firefox"
//                                val firefoxClassName = "org.mozilla.gecko.BrowserApp"
//                                intent.component = ComponentName(firefoxPackageName, firefoxClassName)


                                startActivity(intent)
                            }
                        ) {
                            Text("Click Me!")
                        }

                    }

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}