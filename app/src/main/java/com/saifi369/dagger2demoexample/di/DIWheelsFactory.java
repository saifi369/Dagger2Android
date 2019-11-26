package com.saifi369.dagger2demoexample.di;

import com.saifi369.dagger2demoexample.Frame;
import com.saifi369.dagger2demoexample.Rubber;
import com.saifi369.dagger2demoexample.Wheels;

public class DIWheelsFactory {

    public static Wheels getWheels() {
        return new Wheels(getFrame(), getRubber());
    }

    private static Rubber getRubber() {
        return new Rubber();
    }

    private static Frame getFrame() {
        return new Frame();
    }

}
