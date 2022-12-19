package service;

import structure.IslandMap;
import unit.Wolf;

public  class CreatorAnimal extends Thread {

    public CreatorAnimal(IslandMap islandMap){

    }


/*    Способ как передать в нить параметр (Замыкание)
        public Integer create(Integer i,Integer j){
        int sum =
                i+j;
        return sum;
        CreatorAnimal creatorAnimal = new CreatorAnimal();
         new Thread(()->creatorAnimal.create(5,2));

    }*/


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
    }
/*
    public static class CreatorFox extends Thread{
        @Override
        public void run() {
            new Wolf(50,3,8,30);
        }
    }
*/

}
