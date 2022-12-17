package unit;

import description.PlantAction;
import structure.IslandMap;

import java.util.concurrent.locks.ReentrantLock;

public class Plant implements PlantAction, Runnable {

    public int coordinate_X;
    public int coordinate_Y;
    volatile int countPlantOfSquad =200;

    private ReentrantLock countLook;


    public Plant(Integer coordinateX,Integer coordinateY) {
        this.coordinate_X = coordinateX;
        this.coordinate_Y = coordinateY;
    }

    public int getCountPlantOfSquad() {
        return countPlantOfSquad;
    }

    public void setCountPlantOfSquad(int countPlantOfSquad) {
        this.countPlantOfSquad = countPlantOfSquad;
    }

    @Override
    public void reproduction(Integer countPlus) {
        countPlantOfSquad += 80;
        if(countPlantOfSquad>200){
            countPlantOfSquad = 200;
        }
    }

    @Override
    public void beEaten(Integer countMinus) {

    }


    @Override
    public void run() {
        void reproductionInIslandMap(IslandMap )
    }
}
