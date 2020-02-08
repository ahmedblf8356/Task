package com.example.task;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import com.example.task.Data.Items;
import com.example.task.Data.QuestionResponse;
import com.example.task.adapter.QuestionAdapter;
import com.example.task.api.MyApi;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private List<Items>questions;
    private RecyclerView rvQuestion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvQuestion = findViewById(R.id.rvQuestion);
        getQuestions(this);
    }

    private void getQuestions(final Context context){
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.stackexchange.com/2.2/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        MyApi api = retrofit.create(MyApi.class);
        Call<QuestionResponse>questionResponse = api.getQuestion();
        questionResponse.enqueue(new Callback<QuestionResponse>() {
            @Override
            public void onResponse(Call<QuestionResponse> call, Response<QuestionResponse> response) {
                if (response.body()!=null){
                    questions=response.body().getItems();
                    setRvQuestionAdapter(context,questions);
                }
            }

            @Override
            public void onFailure(Call<QuestionResponse> call, Throwable t) {
                Toast.makeText(context, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setRvQuestionAdapter(Context context, List<Items> questions) {
        QuestionAdapter mAdapter = new QuestionAdapter(context, questions);
        rvQuestion.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false));
        rvQuestion.setAdapter(mAdapter);
    }
}
