package Application;

import service.CreateIsland;
import structure.IslandMap;

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
        createIsland.createSquad(islandMap);   //работает в одном потоке


    }
}
