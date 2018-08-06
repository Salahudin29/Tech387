package com.example.admin.exercisesapp2kuciradio.data;

import java.util.List;

public class Workout {

    private List<String> mTags;
    private String mImeWorkout;
    private String mDesWorkout;
    private String mDuration;

    /**
     * konstruktor od cega ce se sastajati workout u repository-u
     * @param tags
     * @param imeWorkout
     * @param desWorkout
     * @param duration
     */
    public Workout(List<String> tags, String imeWorkout, String desWorkout, String duration) {
        mTags = tags;
        mImeWorkout = imeWorkout;
        mDesWorkout = desWorkout;
        mDuration = duration;
    }

    public List<String> getTags() {
        return mTags;
    }

    public void setTags(List<String> tags) {
        mTags = tags;
    }

    public String getImeWorkout() {
        return mImeWorkout;
    }

    public void setImeWorkout(String imeWorkout) {
        mImeWorkout = imeWorkout;
    }

    public String getDesWorkout() {
        return mDesWorkout;
    }

    public void setDesWorkout(String desWorkout) {
        mDesWorkout = desWorkout;
    }

    public String getDuration() {
        return mDuration;
    }

    public void setDuration(String duration) {
        mDuration = duration;
    }
}
