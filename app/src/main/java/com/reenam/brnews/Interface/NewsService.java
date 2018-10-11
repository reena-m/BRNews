package com.reenam.brnews.Interface;

import com.reenam.brnews.Model.WebSite;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NewsService {
    @GET("v1/sources?language=en")
    Call<WebSite> getSources();
}
