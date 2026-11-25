package com.shiladitya16.fileexplorer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.shiladitya16.fileexplorer.ui.theme.FileExplorerTheme
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.shiladitya16.fileexplorer.ui.explorer.ExplorerScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            FileExplorerTheme {
//                    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                        Greeting(
//                            name = "Shilu",
//                            modifier = Modifier.padding(innerPadding)
//                        )
//                    }
                ExplorerScreen()
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
    FileExplorerTheme {
        Greeting("Shilu")
    }
}