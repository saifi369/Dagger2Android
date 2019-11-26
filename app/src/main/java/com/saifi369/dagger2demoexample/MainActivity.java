package com.saifi369.dagger2demoexample;

import android.os.Bundle;

import com.saifi369.dagger2demoexample.di.DICarFactory;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Car hondaCar = DICarFactory.getCar();

        hondaCar.drive();

    }
}
