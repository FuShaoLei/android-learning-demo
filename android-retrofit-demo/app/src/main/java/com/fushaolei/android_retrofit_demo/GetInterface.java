package com.fushaolei.android_retrofit_demo;


import retrofit2.Call;
import retrofit2.http.GET;

public interface GetInterface {

    @GET("ajax.php?a=fy&f=auto&t=auto&w=hello%20world")
    Call<Translation> getCall();
}
