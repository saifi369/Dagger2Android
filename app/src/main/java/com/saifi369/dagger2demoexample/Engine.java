package com.saifi369.dagger2demoexample;

import android.util.Log;

import static com.saifi369.dagger2demoexample.Constants.TAG;

public class Engine {

    private SparkPlug mSparkPlug;
    private CrankShaft mCrankShaft;
    private Piston mPiston;

    public Engine() {

        mCrankShaft=new CrankShaft();
        mPiston=new Piston();
        mSparkPlug=new SparkPlug();

    }

    public void start(){
        Log.d(TAG, "start: Engine started");
    }

    public static void status() {
        Log.d(TAG, "status: Engine is not ready, create engine object");
    }
}
