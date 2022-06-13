package au.edu.unsw.infs3634.basedi.car;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = "Car";

    private int horsePower;
    @Inject
    public DieselEngine(int horsePower) {
        this.horsePower = horsePower;
    }
    @Override
    public void start() {
        Log.d(TAG, "Diesel Engine started: Horsepower: " + horsePower);
    }
}
