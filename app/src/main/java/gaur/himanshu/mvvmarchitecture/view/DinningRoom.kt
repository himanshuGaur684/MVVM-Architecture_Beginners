package gaur.himanshu.mvvmarchitecture.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import gaur.himanshu.mvvmarchitecture.view_model.ServerViewModel

@Composable
fun MainScreen(serverViewModel: ServerViewModel) {
    val tray by serverViewModel.tray.collectAsState()

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column {
            Text(text = tray)

            Button(onClick = { serverViewModel.prepareFood() }) {
                Text(text = "prepare food")
            }
        }
    }

}