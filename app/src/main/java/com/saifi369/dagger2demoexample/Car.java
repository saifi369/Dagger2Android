package com.saifi369.dagger2demoexample;

import android.util.Log;

import static com.saifi369.dagger2demoexample.Constants.TAG;

public class Car {

    public Engine mEngine;
    public Service mService;
    private Wheels mWheels;

    public Car(Engine engine) {
        this.mEngine = engine;
    }

//    public void setEngine(Engine mEngine) {
//        this.mEngine = mEngine;
//    }

    public void setWheels(Wheels wheels) {
        this.mWheels = wheels;
    }

    public void drive(){

        mEngine.start();
        mWheels.inflate();

        Log.d(TAG, "drive: Vhroooooooom: Car is driving");
    }

}
