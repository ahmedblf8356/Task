package com.example.task.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.task.Data.Answers;
import com.example.task.Data.Comments;
import com.example.task.R;

import java.util.List;

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.MyViewHolder> {

    private Context mContext;
    private List<Comments> answers;

    public CommentAdapter(Context mContext, List<Comments> answers) {
        this.mContext = mContext;
        this.answers = answers;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.item_answer, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.value.setText(answers.get(position).getBody());
    }

    @Override
    public int getItemCount() {
        return answers == null ? 0 : answers.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView value ;
        private MyViewHolder(View itemView) {
            super(itemView);
            value = itemView.findViewById(R.id.answer_value);
        }
    }
}
