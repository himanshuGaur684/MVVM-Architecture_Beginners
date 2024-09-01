package gaur.himanshu.mvvmarchitecture.model

import kotlinx.coroutines.delay

class KitchenRepository {

    suspend fun prepareFood() : String{
        delay(3000)
        return "food is prepared"
    }

}