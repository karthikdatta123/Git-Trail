package com.example.kotlinmvvm.data.vo


import com.google.gson.annotations.SerializedName

data class MovieDetail(
    val id: Int,
    @SerializedName("imdb_id")
    val imdbId: String,
    @SerializedName("original_language")
    val originalLanguage: String,
    @SerializedName("original_title")
    val originalTitle: String,
    val overview: String,
    val popularity: Double,
    @SerializedName("poster_path")
    val posterPath: String,
    val status: String,
    val tagline: String,
    val title: String,
    val video: Boolean,
    @SerializedName("vote_average")
    val rating: Double,
    @SerializedName("vote_count")
    val voteCount: Int
)