package gaur.himanshu.mvvmarchitecture

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import gaur.himanshu.mvvmarchitecture.ui.theme.MVVMArchitectureTheme
import gaur.himanshu.mvvmarchitecture.view.MainScreen
import gaur.himanshu.mvvmarchitecture.view_model.ServerViewModel

class MainActivity : ComponentActivity() {

    private val viewMOdel: ServerViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MVVMArchitectureTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Surface(modifier = Modifier.padding(innerPadding)) {
                        MainScreen(serverViewModel = viewMOdel)
                    }
                }
            }
        }
    }
}


