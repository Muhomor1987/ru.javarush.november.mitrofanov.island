package structure;

import unit.Animal;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class IslandMap extends Thread{

    private final String name;
    public final int width;
    public final int height;

    public final Squad [][] listSquad;

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public static LinkedBlockingQueue<Animal> animalsQueueByCreatorAnimal= new LinkedBlockingQueue<>();
    //Проверки на null добавить

    public IslandMap(int height, int width) {
        name = "Island " + width + "x" + height;
        this.width = width;
        this.height = height;
        listSquad = new Squad[height][width];
    }
/*
        AtomicInteger iA = new AtomicInteger(0);
        AtomicInteger jA = new AtomicInteger(0);
    @Override
    public void run() {
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                listSquad[i][j] = new Squad(i,j);
                System.out.println(Thread.currentThread().getName() + " Squad "+ i+"x"+j+" created");
            }}
*/

    }