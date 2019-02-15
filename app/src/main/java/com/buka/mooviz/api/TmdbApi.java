package com.buka.mooviz.api;

import  com.buka.mooviz.models.Page;

import retrofit2.Call;
import retrofit2.http.GET;

public interface TmdbApi {

    @GET("https://api.themoviedb.org/3/discover/movie?api_key=4c4eab3f44bda11d55f046d8b2536ad9")
    Call<Page> getPopularMovies();

}
