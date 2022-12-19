package Application;

import service.CreateIsland;
import service.CreatorAnimal;
import service.CreatorSquad;
import structure.IslandMap;
import structure.KindsAnimal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Hello world!
 *
 */
public class Start
{
    public static void main( String[] args )
    {
        System.out.println("Game beginning...");
        CreateIsland createIsland = new CreateIsland();
        IslandMap islandMap = new CreateIsland().createIsland();
        //проверка на ноль

        //!!createIsland.createSquad(islandMap);  //Создаем Карту острова и наполняем её локациями(квадратами)


        //Многопоточно это не работает, сама джава лепит в один поток.
        //либо как то можно разбить задачу на чётные не четные i (но это на подумать)
        // работает в одном потоке сделать многопоточным

        //создаём очереди у квадратов(локаций)
        CreatorSquad creatorSquad = new CreatorSquad();
        KindsAnimal kindsAnimal = new KindsAnimal();

        System.out.println(kindsAnimal);
        CreatorAnimal creatorAnimal = new CreatorAnimal(islandMap);


        List<Thread> threadList = new ArrayList<>();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(
                new Thread(CreatorAnimal.CreatorWolf::new));

    }
}
