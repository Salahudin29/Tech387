package com.example.admin.exercisesapp2kuciradio.data.source;

import com.example.admin.exercisesapp2kuciradio.data.Workout;

import java.util.ArrayList;
import java.util.List;

public class WorkoutRepository {

    private static WorkoutRepository sInstance = null;

    public WorkoutRepository() {

    }

    public static WorkoutRepository getInstance() {
        if (sInstance == null) {
            sInstance = new WorkoutRepository();
        }
        return sInstance;
    }

    public void getWorkout(getCallback callback) {
        List<Workout> workouts = new ArrayList<>();
        List<String> tags = new ArrayList<>();
        tags.add("tag1");
        tags.add("tag2");
        workouts.add(new Workout(tags, "Home Legs", "No equipment required", "20 min"));
        workouts.add(new Workout(tags, "tag1", "klinac", "5 min"));
        workouts.add(new Workout(tags, "Home2 Legs", "No equipment required", "30 min"));
        workouts.add(new Workout(tags, "Home3 ", "mobitel", "10 min"));
        workouts.add(new Workout(tags, "Home4 Legs", "solja", "20 min"));
        workouts.add(new Workout(tags, "Home5 ", "No equipment required", "40 min"));

        callback.onSuccess(workouts);


    }

    public interface getCallback {
        void onSuccess(List workouts);

        void onError();
    }
}
