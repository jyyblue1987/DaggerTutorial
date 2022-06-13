package au.edu.unsw.infs3634.basedi.dagger;

import javax.inject.Named;

import au.edu.unsw.infs3634.basedi.car.Car;
import au.edu.unsw.infs3634.basedi.MainActivity;
import au.edu.unsw.infs3634.basedi.car.PetrolEngine;
import dagger.BindsInstance;
import dagger.Component;

@Component (modules =  {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        CarComponent build();
    }
}
