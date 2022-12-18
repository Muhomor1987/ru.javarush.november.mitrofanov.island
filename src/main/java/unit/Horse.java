package unit;

import java.util.concurrent.atomic.AtomicInteger;

public class Horse extends Animal {

    public Horse(int WEIGHT, int SPEED, int SATURATION, int MAX_OF_ANIMALS_ON_SQUAD, int coordinate_X, int coordinate_Y, String name, AtomicInteger counterFoxForName) {
        super(WEIGHT, SPEED, SATURATION, MAX_OF_ANIMALS_ON_SQUAD, coordinate_X, coordinate_Y, name, counterFoxForName);
    }
}
