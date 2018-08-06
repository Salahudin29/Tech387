package com.example.admin.exercisesapp2kuciradio.main.exercises;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.admin.exercisesapp2kuciradio.MainExercisesListener;
import com.example.admin.exercisesapp2kuciradio.R;
import com.example.admin.exercisesapp2kuciradio.data.Exercises;

import java.util.ArrayList;
import java.util.List;

public class ExercisesAdapter extends RecyclerView.Adapter {

    private Context mContext;
    private ArrayList<Exercises> mList = new ArrayList<>();
    private MainExercisesListener mListener;

    public ExercisesAdapter(Context context, MainExercisesListener listener) {
        mContext = context;
        mListener = listener;
    }

    /**
     * pravi novi viewholder ako ga nema, ubacivanje zeljenog layouta
     * @param parent
     * @param viewType
     * @return
     */
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ExercisesViewHolder(
                LayoutInflater.from(mContext).inflate(R.layout.main_row_exercises, parent, false),
                mListener
        );
    }

    /**
     * uzima potrebne podatke viewholdera i ubacuje ih u taj viewholder
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ExercisesViewHolder) holder).setupExercises(mList.get(position));

    }

    /**
     * vraca ukupan broj podaataka iz liste
     * @return
     */
    @Override
    public int getItemCount() {
        return mList.size();
    }

    /**
     * iz liste Exercises pravi novu listu exercises koju cijelu brise a potom u nju upisuje nove podatke
     * @param exercises
     */
    public void setItems(List<Exercises> exercises) {
        mList.clear();
        mList.addAll(exercises);
        notifyDataSetChanged();
    }
}
