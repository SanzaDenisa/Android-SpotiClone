package com.example.spotimusic.models

import java.net.URL

data class CategoryModel(
    val name: String,
    val coverUrl: String,
    var songs: List<String>
){


    constructor() : this("", "", listOf())
}
