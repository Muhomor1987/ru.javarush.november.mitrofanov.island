package service;

import structure.IslandMap;
import unit.Wolf;

public class CreatorAnimal extends Thread {





    public static class CreatorWolf extends Thread {
        @Override
        public void run() {
            try {
                IslandMap.animalsQueueByCreatorAnimal.put(new Wolf(50, 3,
                        8, 30));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }    public static class CreatorFox extends Thread{
        @Override
        public void run() {
            new Wolf(50,3,8,30);
        }
    }

}
