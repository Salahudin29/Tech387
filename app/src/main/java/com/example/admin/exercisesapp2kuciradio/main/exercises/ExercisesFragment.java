package com.example.admin.exercisesapp2kuciradio.main.exercises;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.admin.exercisesapp2kuciradio.MainExercisesListener;
import com.example.admin.exercisesapp2kuciradio.R;
import com.example.admin.exercisesapp2kuciradio.data.source.ExercisesRepository;

import java.util.List;

public class ExercisesFragment extends Fragment implements MainExercisesListener {

    private RecyclerView mRecyclerView;
    private ExercisesAdapter mAdapter;

    public static ExercisesFragment newInstance() {
        return new ExercisesFragment();
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

        mAdapter = new ExercisesAdapter(getContext(), this);
        mRecyclerView = view.findViewById(R.id.lista);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
//todo objasniti
        ExercisesRepository exercisesRepository = new ExercisesRepository();
        exercisesRepository.getExercises(new ExercisesRepository.getCallback() {
            @Override
            public void onSuccess(List list) {
                mAdapter.setItems(list);
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
