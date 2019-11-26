package com.saifi369.dagger2demoexample.di;

import com.saifi369.dagger2demoexample.Car;

public class DICarFactory {

    public static Car getCar() {
        return new Car(DIEngineFactory.getEngine(), DIWheelsFactory.getWheels());
    }

}
