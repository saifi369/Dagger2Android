package com.saifi369.dagger2demoexample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //this is Constructor Injection
        Engine engine=new Engine();
        Car hondaCar = new Car(engine);

        //this is Field Injection
        hondaCar.mService = new Service();

        //this is Method Injection
        hondaCar.setWheels(new Wheels());

        hondaCar.drive();


    }
}
