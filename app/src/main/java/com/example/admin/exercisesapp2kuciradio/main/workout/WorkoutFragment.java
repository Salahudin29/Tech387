package com.example.admin.exercisesapp2kuciradio.main.workout;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.admin.exercisesapp2kuciradio.MainExercisesListener;
import com.example.admin.exercisesapp2kuciradio.R;
import com.example.admin.exercisesapp2kuciradio.data.source.WorkoutRepository;

import java.util.List;

public class WorkoutFragment extends Fragment implements MainExercisesListener {

    private RecyclerView mRecyclerView;
    private WorkoutAdapter mAdapter;

    public static WorkoutFragment newInstance() {
        return new WorkoutFragment();
    }
    /**
     * poziva se za ubacivanje izgleda (layouta) za dati fragment
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_frag, container, false);

        mAdapter = new WorkoutAdapter(getContext(), this);
        mRecyclerView = view.findViewById(R.id.lista);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        WorkoutRepository workoutRepository = new WorkoutRepository();
        workoutRepository.getWorkout(new WorkoutRepository.getCallback() {
            @Override
            public void onSuccess(List workouts) {
                mAdapter.setItems(workouts);
            }

            @Override
            public void onError() {

            }
        });

        return view;
    }

    @Override
    public void onExercisesClick(int position) {

    }
}
