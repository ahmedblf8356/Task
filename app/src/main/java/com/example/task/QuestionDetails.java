package com.example.task;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.task.Data.Answers;
import com.example.task.Data.Comments;
import com.example.task.adapter.AnswerAdapter;
import com.example.task.adapter.CommentAdapter;
import com.example.task.adapter.QuestionAdapter;

import java.text.MessageFormat;

public class QuestionDetails extends AppCompatActivity {

    private TextView qId,qTitle,qDetails,qCreationDate,qViewCount,emptyAnswer,emptyComment;
    private RecyclerView rvComment,rvAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_details);
        qId = findViewById(R.id.qId);
        qTitle = findViewById(R.id.qTitle);
        qDetails = findViewById(R.id.qDetailes);
        qCreationDate = findViewById(R.id.qCreationDate);
        emptyAnswer = findViewById(R.id.emptyAnswer);
        emptyComment = findViewById(R.id.emptyComment);
        qViewCount = findViewById(R.id.qViewCount);
        rvComment = findViewById(R.id.rvComments);
        rvAnswer = findViewById(R.id.rvAnswers);
        setData(this);
    }

    @SuppressLint("SetTextI18n")
    private void setData(Context context){
        if(QuestionAdapter.item!=null){
            qId.setText(QuestionAdapter.item.getQuestion_id());
            qTitle.setText(QuestionAdapter.item.getTitle());
            qDetails.setText(QuestionAdapter.item.getBody());
            qCreationDate.setText(QuestionAdapter.item.getCreation_date());
            qViewCount.setText(QuestionAdapter.item.getView_count());
            if(QuestionAdapter.item.getAnswers()!=null){
                AnswerAdapter answerAdapter =new AnswerAdapter(context,QuestionAdapter.item.getAnswers());
                rvAnswer.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false));
                rvAnswer.setAdapter(answerAdapter);
            }else {
                emptyAnswer.setVisibility(View.VISIBLE);
                emptyAnswer.setText("their is no answers yet ");
            }
            if(QuestionAdapter.item.getComments()!=null){
                CommentAdapter commentAdapter =new CommentAdapter(context,QuestionAdapter.item.getComments());
                rvComment.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false));
                rvComment.setAdapter(commentAdapter);
            }else {
                emptyComment.setVisibility(View.VISIBLE);
                emptyComment.setText("their is no answers yet ");
            }
        }
    }
}
