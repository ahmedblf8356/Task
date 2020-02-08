package com.example.task.api;

import com.example.task.Data.QuestionResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyApi {

    @GET("questions?pagesize=50&order=desc&sort=activity&site=stackoverflow&filter=!2u1axMea_85vkOfHdHBl3GEfxAEJSjqzNT_J)_01b5")
    Call<QuestionResponse>getQuestion();
}
