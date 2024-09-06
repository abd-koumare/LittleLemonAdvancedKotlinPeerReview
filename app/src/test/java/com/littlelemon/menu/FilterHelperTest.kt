package com.littlelemon.menu

import org.junit.Assert.assertTrue
import org.junit.Test


class FilterHelperTest {
    private val sampleProductsList = mutableListOf(
        ProductItem(
            title = "Black tea",
            price = 3.00,
            category = "Drinks",
            R.drawable.black_tea
        ),
        ProductItem(
            title = "Croissant",
            price = 7.00,
            category = "Dessert",
            R.drawable.croissant
        ),
        ProductItem(
            title = "Bouillabaisse",
            price = 20.00,
            category = "Food",
            R.drawable.bouillabaisse
        )
    )

    @Test
    fun filterProducts_filterTypeDessert_croissantReturned () {
        val filterHelper = FilterHelper()
        val result = filterHelper.filterProducts(FilterType.Dessert, sampleProductsList)

        assertTrue(result.contains(ProductItem("Croissant", 7.00, "Dessert", R.drawable.croissant)))
    }
}