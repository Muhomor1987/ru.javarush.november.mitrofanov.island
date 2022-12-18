package unit;

import structure.KindsAnimal;

import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

public class Bear extends KindsAnimal implements Runnable{
  //  private final String nameBear;
    private int weight = 500;
    private final int MIN_WEIGHT = 200;
    private final int SPEED=2;
    private final int SATURATION=80;
    private final int MAX_OF_ANIMALS_ON_SQUAD = 5;


    private static Map<Animal, Integer> MAP_OF_FOOD;

    public int coordinate_X;
    public int coordinate_Y;

    private static int totalNumberAnimalsOfThisSpeciesOnMap;
    static AtomicInteger counterBearForName = new AtomicInteger(0);
    //Переменная для
/*    public Bear() {
        nameBear = "Bear_" + counterBearForName;
        counterBearForName.getAndDecrement();
    }*/

    LinkedBlockingDeque<Bear> queueByGenerationMap = new LinkedBlockingDeque<>();



    @Override
    public void run() {

        queueByGenerationMap.add(new Bear());
    }
}
