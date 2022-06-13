package au.edu.unsw.infs3634.basedi.dagger;

import au.edu.unsw.infs3634.basedi.car.Rims;
import au.edu.unsw.infs3634.basedi.car.Tires;
import au.edu.unsw.infs3634.basedi.car.Wheels;
import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {
    @Provides
    Rims provideRims() {
        return new Rims();
    }

    @Provides
    Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }
}
