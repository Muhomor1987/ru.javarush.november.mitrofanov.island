package service;

import structure.IslandMap;
import structure.Squad;
import structure.KindsAnimal;

import java.util.Random;
import java.util.concurrent.*;


public class CreateIsland {


    public CreateIsland() {
    }

    public IslandMap createIsland() {
        Random random = new Random();
        IslandMap islandMap = new IslandMap(ThreadLocalRandom.current().nextInt(0, 200),
                ThreadLocalRandom.current().nextInt(0, 200));
        System.out.println("Island size " + islandMap.getHeight() + "x" + islandMap.getWidth() + " has been created");
        return islandMap;
    }

    public void createSquad(IslandMap islandMap)  {
        for (int i = 0; i < islandMap.getHeight(); i++) {
            for (int j = 0; j < islandMap.getWidth(); j++) {
                islandMap.listSquad[i][j] = new Squad(i,j);
                System.out.println(Thread.currentThread().getName() + " Squad "+ i+"x"+j+" created");
            }
        }
    }

    public void createAnimals (IslandMap islandMap, KindsAnimal kindsAnimal){
        //заполняет переменные общего числа животных каждого вида на карте

        Class totalClassAnimal = kindsAnimal.getClass();
        //Class<?> arrayTotalClass = totalClassAnimal.getField();

        //Засовывам в цикл обработки значаений static у класса
        //Сюда же можно сунуть заполнение статик файнал переменных класса. из файла!
        //можно этот метод и остальные в этом классе сделать статическими

        int variableOfTotalNumberOfCells = islandMap.getHeight()*islandMap.getWidth();
        //Переменная общего числа клеток

        //далее высчитываем максимальное число животных данного вида и записываем
        //в атомарную переменную класса животных

        //цикл пробега по классам






    }



}





    //пробуем через екзекутор
/*    public synchronized void createSquad(IslandMap islandMap) {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        executor.execute(islandMap);
        */
        //оставлю этот код для написания дальнеших веток
/*        Thread thread0 = new Thread(islandMap);
        Thread thread1 = new Thread(islandMap);
        Thread thread2 = new Thread(islandMap);
        thread0.start();
        thread1.start();
        thread2.start();*/





