package unit;

import description.AnimalAction;

import java.util.Map;

public abstract class Animal implements AnimalAction {

    private int WEIGHT;
    private int SPEED;
    private int SATURATION;
    private int MAX_OF_ANIMALS_ON_SQUAD;

    private static Map<Animal, Integer> MAP_OF_FOOD;

    public int coordinate_X;
    public int coordinate_Y;

    String name;





}
