package com.saifi369.dagger2demoexample;

import android.util.Log;

import static com.saifi369.dagger2demoexample.Constants.TAG;

public class Car {

    private Engine mEngine;
    public Wheels mWheels;
    private final Service mService;

    public Car(Service service) {
        mService=service;
    }

    public void drive(){

        mEngine.start();
        mWheels.inflate();

        Log.d(TAG, "drive: Vhroooooooom: Car is driving");
    }

    public void setEngine(Engine mEngine) {
        this.mEngine = mEngine;
    }
}
