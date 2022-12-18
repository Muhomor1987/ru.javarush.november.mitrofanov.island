package structure;

import unit.Bear;
import unit.Horse;
import unit.Plant;
import unit.Wolf;

import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicInteger;

public   class KindsAnimal {



//Integer MIN_WEIGHT,
//                             Integer SPEED,Integer SATURATION,Integer MAX_OF_ANIMALS_ON_SQUAD
/*    public void createAnimal(Class clazz,Integer weight,Integer SPEED,Integer SATURATION,Integer MAX_OF_ANIMALS_ON_SQUAD){
        KindsAnimal kindsAnimal = new KindsAnimal();
        if (clazz==wolfClass){
            Fox wolf = new Fox(200);
        }


    }*/



        AtomicInteger counterFoxForName = new AtomicInteger(0);


    static public Class wolfClass = Wolf.class;
    private Class horseClass = Horse.class;
    public Class bearClass = Bear.class;
    //.....
    private Class PlantClass = Plant.class;


    public KindsAnimal() {
    }
}
