package au.edu.unsw.infs3634.basedi.dagger;

import au.edu.unsw.infs3634.basedi.car.DieselEngine;
import au.edu.unsw.infs3634.basedi.car.Engine;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int provideHorsePower() {
        return horsePower;
    }

    @Provides
    Engine provideEngine(DieselEngine engine) {
        return engine;
    }
}
