package com.example.admin.exercisesapp2kuciradio.data.source;

import com.example.admin.exercisesapp2kuciradio.R;
import com.example.admin.exercisesapp2kuciradio.data.Exercises;

import java.util.ArrayList;
import java.util.List;

public class ExercisesRepository {
//todo nisam bas najbolje skontao
    private static ExercisesRepository sInstance = null;

    public ExercisesRepository() {

    }

    public static ExercisesRepository getInstance() {
        if (sInstance == null) {
            sInstance = new ExercisesRepository();
        }
        return sInstance;
    }

    public void getExercises(getCallback callback) {
        List<Exercises> exercises = new ArrayList<>();
        exercises.add(new Exercises(R.drawable.dive_bombers, "Dive bombers", "Chest, Shoulders,Triceps"));
        exercises.add(new Exercises(R.drawable.high_knees, "High knees", "Cardio,Quads,Glutes"));
        exercises.add(new Exercises(R.drawable.jumping_lunges, "Jumping lunges", "Quads,Hamstrings,Glutes"));
        exercises.add(new Exercises(R.drawable.knee_push_ups, "Knee push ups", "Chest, Shoulders,Triceps"));
        exercises.add(new Exercises(R.drawable.farmer_squat, "Farmer squat", "Chest, Shoulders,Triceps"));
        exercises.add(new Exercises(R.drawable.knee_kicks, "Knee kicks", "Cardio,Quads,Glutes"));
        exercises.add(new Exercises(R.drawable.double_dumbbell, "Double dumbell", "Quads,Hamstrings,Glutes"));
        exercises.add(new Exercises(R.drawable.shadow_boxing, "Shadow boxing", "Chest, Shoulders,Triceps"));

        callback.onSuccess(exercises);

    }

    public interface getCallback {
        void onSuccess(List list);

        void onError();
    }
}
