package au.edu.unsw.infs3634.basedi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

import au.edu.unsw.infs3634.basedi.car.Car;
import au.edu.unsw.infs3634.basedi.dagger.CarComponent;
import au.edu.unsw.infs3634.basedi.dagger.DaggerCarComponent;


public class MainActivity extends AppCompatActivity {
    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.builder()
                        .horsePower(150)
                        .engineCapacity(1400)
//                        .dieselEngineModule(new DieselEngineModule(100))
//                        .wheelsModule(new WheelsModule())
                        .build();

        component.inject(this);

        car.drive();
    }
}