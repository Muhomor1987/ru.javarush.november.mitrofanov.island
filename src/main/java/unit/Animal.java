package unit;

import structure.IslandMap;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Animal {
    public Animal(int WEIGHT, int SPEED, int SATURATION,
                  int MAX_OF_ANIMALS_ON_SQUAD, IslandMap islandMap) {
        this.name=this.getClass().getName()+this.counterForName.getAndDecrement();
        this.WEIGHT = WEIGHT;
        this.SPEED = SPEED;
        this.SATURATION = SATURATION;
        this.MAX_OF_ANIMALS_ON_SQUAD = MAX_OF_ANIMALS_ON_SQUAD;
        this.islandMap= islandMap;

    }

    private String name;
    private int WEIGHT;
    private int SPEED;
    private int SATURATION;
    private int MAX_OF_ANIMALS_ON_SQUAD;

    private Map<Animal, Integer> MAP_OF_FOOD;

    public int coordinate_X;
    public int coordinate_Y;

    private IslandMap islandMap;




    public AtomicInteger counterForName = new AtomicInteger(0);

/*    public void createAnimal(String names,Integer weight, Integer SPEED,
                             Integer SATURATION, Integer MAX_OF_ANIMALS_ON_SQUAD){

    }*/


}
