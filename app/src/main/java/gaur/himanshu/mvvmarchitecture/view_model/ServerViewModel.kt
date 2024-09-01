package gaur.himanshu.mvvmarchitecture.view_model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import gaur.himanshu.mvvmarchitecture.model.KitchenRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class ServerViewModel : ViewModel() {

    private val repo = KitchenRepository()

    val tray = MutableStateFlow<String>("")

    fun prepareFood() = viewModelScope.launch {
        val food = repo.prepareFood()
        tray.update { food }
    }

}