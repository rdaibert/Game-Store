package pt.iade.ei.gamestore.model

import java.io.Serializable

data class Item(
    val id: Int,
    val name: String,
    val price: Double,
    val imageRes: Int,
    val description: String,
    val longDescription: String,
) : Serializable