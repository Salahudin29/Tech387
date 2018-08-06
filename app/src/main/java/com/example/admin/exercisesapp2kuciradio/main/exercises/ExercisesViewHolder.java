package com.example.admin.exercisesapp2kuciradio.main.exercises;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.exercisesapp2kuciradio.MainExercisesListener;
import com.example.admin.exercisesapp2kuciradio.R;
import com.example.admin.exercisesapp2kuciradio.data.Exercises;

public class ExercisesViewHolder extends RecyclerView.ViewHolder implements MainExercisesListener {

    private ImageView mSlikaExercises;
    private TextView mImeExercises;
    private TextView mDesExercises;


    public ExercisesViewHolder(@NonNull View itemView, final MainExercisesListener listener) {
        super(itemView);

        mSlikaExercises = itemView.findViewById(R.id.slikaExercises);
        mImeExercises = itemView.findViewById(R.id.imeExercises);
        mDesExercises = itemView.findViewById(R.id.desExercises);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onExercisesClick(getAdapterPosition());
            }
        });
    }

    public void setupExercises(Exercises exercises) {
        mSlikaExercises.setImageResource(exercises.getSlikaExercises());
        mImeExercises.setText(exercises.getImeExercises());
        mDesExercises.setText(exercises.getDesExercises());
    }

    @Override
    public void onExercisesClick(int position) {

    }
}
