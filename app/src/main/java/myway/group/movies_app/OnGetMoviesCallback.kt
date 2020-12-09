package myway.group.movies_app

import myway.group.movies_app.data.Movie

interface OnGetMoviesCallback {
    fun onSuccess(movies: List<Movie?>?)
    fun onError()
}