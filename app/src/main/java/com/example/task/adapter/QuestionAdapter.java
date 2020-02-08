package com.example.task.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.task.Data.Items;
import com.example.task.QuestionDetails;
import com.example.task.R;

import java.util.List;

public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.MyViewHolder> {

    public static Items item;

    private Context mContext;
    private List<Items> questions;

    public QuestionAdapter(Context mContext, List<Items> questions) {
        this.mContext = mContext;
        this.questions = questions;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.item_question, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        item = questions.get(position);
        holder.questionTitle.setText(questions.get(position).getTitle());
        holder.ownerName.setText(questions.get(position).getOwner().getDisplay_name());
        Glide.with(mContext).load(questions.get(position).getOwner().getProfile_image()).into(holder.profileImage);
        holder.cardQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mContext.startActivity(new Intent(mContext, QuestionDetails.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return questions == null ? 0 : questions.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private CardView cardQuestion;
        private TextView ownerName, questionTitle;
        private ImageView profileImage;
        private MyViewHolder(View itemView) {
            super(itemView);
            cardQuestion = itemView.findViewById(R.id.cardQuestion);
            ownerName = itemView.findViewById(R.id.ownerName);
            questionTitle = itemView.findViewById(R.id.questionTitle);
            profileImage = itemView.findViewById(R.id.profileImage);
        }
    }
}
