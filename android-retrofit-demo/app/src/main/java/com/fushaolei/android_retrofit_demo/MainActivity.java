package com.fushaolei.android_retrofit_demo;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.tv_text).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getRequest();
            }
        });
    }

    public void getRequest() {
        Retrofit retrofit = new Retrofit.Builder()
                                .baseUrl("http://fy.iciba.com")
                                .addConverterFactory(GsonConverterFactory.create())
                                .build();

        GetInterface request = retrofit.create(GetInterface.class);

        Call<Translation> call = request.getCall();

        call.enqueue(new Callback<Translation>() {
            @Override
            public void onResponse(Call<Translation> call, Response<Translation> response) {
                response.body().show();
            }

            @Override
            public void onFailure(Call<Translation> call, Throwable t) {
                System.out.println("链接失败");
            }
        });
    }
}