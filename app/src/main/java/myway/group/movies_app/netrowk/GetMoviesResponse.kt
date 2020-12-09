package myway.group.movies_app.netrowk

import com.google.gson.annotations.SerializedName
import myway.group.movies_app.data.Movie

data class GetMoviesResponse(
    @SerializedName("page") val page: Int,
    @SerializedName("results") val movies: List<Movie>,
    @SerializedName("total_pages") val pages: Int
)