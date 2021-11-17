package com.example.testingdemo

import android.content.Context

open class ItemRepository(context: Context) {

    private val itemModel: ItemModel = ItemModel(context)

    fun getFavoriteItem() = itemModel.getFavoriteItems()

    fun saveFavoriteItem(favItem: ItemDataClass) = itemModel.saveFavoriteItems(favItem)

    fun removeFavoriteItem() = itemModel.removeFavoriteItems()
}