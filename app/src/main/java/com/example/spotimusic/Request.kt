package com.example.spotimusic

data class Request(
    val albums: List<Album>
)

data class Album(
    val id: String,
    val name: String,
    val artists: List<Artist>,

)

data class Artist(
    val id: String,
    val name: String
)