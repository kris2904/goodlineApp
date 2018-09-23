package com.example.android;

import com.example.android.Model.Parent;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
//Создание пользовательского retrofit интерфейса
public interface ApiService {
    @GET("/api/users?page=1")
        //Указываем, какой тип данных мы ожидаем от GET
    Call<Parent> getMyJSON();
}