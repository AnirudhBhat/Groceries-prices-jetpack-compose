package com.abhat.jetpackcomposeplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.foundation.Box
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope.gravity
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.foundation.lazy.LazyColumnForIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import androidx.ui.tooling.preview.PreviewParameter
import kotlinx.coroutines.ExperimentalCoroutinesApi
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment

class MainActivity : AppCompatActivity() {

    private val groceryViewModel by lazy {
        GroceryViewModel()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            groceryList(groceryViewModel = groceryViewModel)
        }
    }


    @Preview
    @Composable
    fun groceryListPreview() {
        val priceList = listOf<Int>(50, 100, 42)
        LazyColumnForIndexed(items = listOf("Carrot", "Banana", "Onion")) { index, item ->
            Column {
                Text(text = item, modifier = Modifier.padding(8.dp))
                Text(text = priceList[index].toString(), modifier = Modifier.padding(start = 8.dp))
            }
        }
    }


    @ExperimentalCoroutinesApi
    @Composable
    fun groceryList(groceryViewModel: GroceryViewModel) {
        val groceryList: List<Grocery>? by groceryViewModel.groceryState().observeAsState()
        groceryViewModel.fetchGroceryPrices()
        LazyColumnFor(items = groceryList ?: listOf(), modifier = Modifier.padding(16.dp)) { item ->
            Card(
                shape = RoundedCornerShape(8.dp),
                backgroundColor = MaterialTheme.colors.surface,
                modifier = Modifier.fillParentMaxWidth().then(Modifier.padding(bottom = 24.dp))
            ) {
                Box(
                    padding = 16.dp,
                    modifier = Modifier.height(200.dp),
                    gravity = Alignment.Center
                ) {
                    Text(
                        text = item.name,
                        style = MaterialTheme.typography.h6
                    )

                    Text(
                        text = item.price,
                        style = MaterialTheme.typography.h4
                    )
                }
            }
        }
    }

}
