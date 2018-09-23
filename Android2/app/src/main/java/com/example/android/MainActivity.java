package com.example.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import com.example.android.ApiService;
import com.example.android.Model.Child;
import com.example.android.Model.Parent;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * Create Retrofit Builder
         */
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://reqres.in")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        /**
         * Link the builder and interface
         */
        ApiService messagesApi = retrofit.create(ApiService.class);
        /**
         * Type of response
         */
        Call<Parent> call =  messagesApi.getMyJSON();
        /**
         * Response
         */
        call.enqueue(new Callback<Parent>() {
            @Override
            public void onResponse(Call<Parent> call, Response<Parent> response) {
                /**
                 * Просмотр ответа в Debug
                 */
                Parent body = response.body();
                List<Child> chil = body.getData();
            }

            @Override
            public void onFailure(Call<Parent> call, Throwable t) {

            }
        });
    }
    
}
