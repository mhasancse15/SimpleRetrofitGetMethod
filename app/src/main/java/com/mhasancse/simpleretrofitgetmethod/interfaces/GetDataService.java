package com.mhasancse.simpleretrofitgetmethod.interfaces;

import com.mhasancse.simpleretrofitgetmethod.model.RetroPhoto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {
    @GET("/photos")
    Call<List<RetroPhoto>> getAllPhotos();

}
