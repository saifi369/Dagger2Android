package com.saifi369.dagger2demoexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Engine engine=new Engine();
        Wheels wheels=new Wheels();

        Service service=new Service();

        Car honda=new Car(service);

        honda.mWheels=wheels;
        honda.setEngine(engine);

        honda.drive();

    }
}
