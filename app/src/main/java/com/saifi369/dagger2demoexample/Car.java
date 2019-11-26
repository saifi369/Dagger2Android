package com.saifi369.dagger2demoexample;

import android.util.Log;

import static com.saifi369.dagger2demoexample.Constants.TAG;

public class Car {

    public Engine mEngine;
    private Wheels mWheels;

    public Car(Engine engine, Wheels wheels) {
        this.mEngine = engine;
        this.mWheels = wheels;
    }

    public void drive(){

        mEngine.start();
        mWheels.inflate();

        Log.d(TAG, "drive: Vhroooooooom: Car is driving");
    }

}
