package com.saifi369.dagger2demoexample.di;

import com.saifi369.dagger2demoexample.CrankShaft;
import com.saifi369.dagger2demoexample.Engine;
import com.saifi369.dagger2demoexample.Piston;
import com.saifi369.dagger2demoexample.SparkPlug;

public class DIEngineFactory {

    public static Engine getEngine() {
        return new Engine(getSparkPlug(), getCrankShaft(), getPiston());
    }

    private static CrankShaft getCrankShaft() {
        return new CrankShaft();
    }

    private static Piston getPiston() {
        return new Piston();
    }

    private static SparkPlug getSparkPlug() {
        return new SparkPlug();
    }

}
