package au.edu.unsw.infs3634.basedi.dagger;

import au.edu.unsw.infs3634.basedi.car.Engine;
import au.edu.unsw.infs3634.basedi.car.PetrolEngine;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {
    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
