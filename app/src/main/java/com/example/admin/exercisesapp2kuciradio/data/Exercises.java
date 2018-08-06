package com.example.admin.exercisesapp2kuciradio.data;

public class Exercises {

    private int mSlikaExercises;
    private String mImeExercises;
    private String mDesExercises;

    /**
     * konstruktor od cega ce se sastajati exercise u repository-u
     * @param slikaExercises
     * @param imeExercises
     * @param desExercises
     */
    public Exercises(int slikaExercises, String imeExercises, String desExercises) {
        mSlikaExercises = slikaExercises;
        mImeExercises = imeExercises;
        mDesExercises = desExercises;
    }

    public int getSlikaExercises() {
        return mSlikaExercises;
    }

    public void setSlikaExercises(int slikaExercises) {
        mSlikaExercises = slikaExercises;
    }

    public String getImeExercises() {
        return mImeExercises;
    }

    public void setImeExercises(String imeExercises) {
        mImeExercises = imeExercises;
    }

    public String getDesExercises() {
        return mDesExercises;
    }

    public void setDesExercises(String desExercises) {
        mDesExercises = desExercises;
    }
}
