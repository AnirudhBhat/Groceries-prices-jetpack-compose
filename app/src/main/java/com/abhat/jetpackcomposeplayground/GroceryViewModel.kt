package com.abhat.jetpackcomposeplayground

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.*
import org.jsoup.Jsoup
import java.util.*

class GroceryViewModel: ViewModel() {

    private var groceryLiveData = MutableLiveData<List<Grocery>>(listOf())
    fun groceryState() = groceryLiveData as LiveData<List<Grocery>>

    private val ioScope = CoroutineScope(Dispatchers.IO + SupervisorJob())
    private val mainScope = CoroutineScope(Dispatchers.Main + SupervisorJob())

    fun fetchGroceryPrices() {
        viewModelScope.launch {
            groceryLiveData.value = groceryPrices() ?: listOf()
        }
    }

    private suspend fun groceryPrices(): List<Grocery>? {
        return withContext(ioScope.coroutineContext) {
            val url = "http://hopcoms.karnataka.gov.in/CropRates.aspx"
            val groceryList = ArrayList<Grocery>()
            try {
                val doc = Jsoup.connect(url).get()
                val namesList = doc.select("td.MachineName")
                val regionaleNamesList = doc.select("td.type")
                val pricesList = doc.select("td.status")
                for (i in namesList.indices) {
                    if (pricesList[i].text().isNotEmpty() && pricesList[i].text() != "0.00") {
                        groceryList.add(Grocery(name = namesList[i].text(), price = pricesList[i].text()))
                    }
                }
                groceryList
            } catch (e: Exception) {
                e.printStackTrace();
                null
            }
        }
    }
}