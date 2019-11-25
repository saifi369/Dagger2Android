package com.saifi369.dagger2demoexample;

import android.util.Log;

import static com.saifi369.dagger2demoexample.Constants.TAG;

public class Wheels {

    private Frame mFrame;
    private Rubber mRubberType;

    public Wheels() {

        mFrame=new Frame();
        mRubberType=new Rubber();

    }

    public void inflate() {
        Log.d(TAG, "inflate: Wheels inflated");
    }
}
