package service;

import structure.IslandMap;
import structure.Squad;

import java.util.concurrent.*;


public class CreateIsland {

    public CreateIsland()  {
    }

    public IslandMap createIsland() {
        IslandMap islandMap = new IslandMap(ThreadLocalRandom.current().nextInt(0, 200),
                ThreadLocalRandom.current().nextInt(0, 20));
        System.out.println("Island size "+islandMap.getHeight()+"x"+islandMap.getWidth()+" has been created");
        return islandMap;
    }




        //Сделать многопоточным
    public void createSquad(IslandMap islandMap) {

        Executor executorCreateSquad = Executors.newWorkStealingPool();
        for (int i = 0; i < islandMap.getHeight(); i++) {
            for (int j = 0; j < islandMap.getWidth(); j++) {
                 new CreateSquad(i,j);

                //

                System.out.println(Thread.currentThread().getName() + " Squad "+ i+"x"+j+" created");
            }
        }
    }


}


