package com.example.kotlinmvvm.data.api

import com.example.kotlinmvvm.data.vo.MovieDetail
import retrofit2.http.GET
import retrofit2.http.Path
import io.reactivex.Single

interface TheMovieDBInterface {
    //https://api.themoviedb.org/3/movie/now_playing?api_key=d7f878bb9451378443935606cd16f3ec
    //https://api.themoviedb.org/3/movie/696374?api_key=d7f878bb9451378443935606cd16f3ec
    //https://api.themoviedb.org/3/

    @GET("movie/{movie_id}")
    fun getMovieDetails(@Path("movie_id") id : Int ): Single<MovieDetail>

}