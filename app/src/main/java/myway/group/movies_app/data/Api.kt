package myway.group.movies_app.data

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "431e4f758b75e6ebf23faba42991220d",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/top_rated")
    fun getTopRatedMovies(
        @Query("api_key") apiKey: String = "431e4f758b75e6ebf23faba42991220d",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/upcoming")
    fun getUpcomingMovies(
        @Query("api_key") apiKey: String = "431e4f758b75e6ebf23faba42991220d",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

}