package com.example.admin.exercisesapp2kuciradio.main.workout;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.admin.exercisesapp2kuciradio.MainExercisesListener;
import com.example.admin.exercisesapp2kuciradio.R;
import com.example.admin.exercisesapp2kuciradio.data.Workout;

public class WorkoutViewHolder extends RecyclerView.ViewHolder {

    private TextView mTags;
    private TextView mImeWorkout;
    private TextView mDesWorkout;
    private TextView mDuration;

    public WorkoutViewHolder(@NonNull View itemView, final MainExercisesListener listener) {
        super(itemView);

        mTags = itemView.findViewById(R.id.tagovi);
        mImeWorkout = itemView.findViewById(R.id.imeWorkout);
        mDesWorkout = itemView.findViewById(R.id.deskripcijaWorkout);
        mDuration = itemView.findViewById(R.id.trajanje);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onExercisesClick(getAdapterPosition());
            }
        });
    }

    public void setupWorkout(Workout workout) {
        mImeWorkout.setText(workout.getImeWorkout());
        mDesWorkout.setText(workout.getDesWorkout());
        mDuration.setText(workout.getDuration());

    }
}
