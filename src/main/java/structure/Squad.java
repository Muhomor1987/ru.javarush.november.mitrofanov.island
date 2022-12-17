package structure;

import description.AnimalAction;

public class Squad extends Thread {
    private final String nameSquad;
    private final int x_coordinate;
    private final int y_coordinate;


    public Squad(int x_coordinates, int y_coordinate) {
        nameSquad = "Squad_"+x_coordinates+"x"+ y_coordinate;
        this.x_coordinate = x_coordinates;
        this.y_coordinate = y_coordinate;
    }

    public int getCoordinate_X() {
        return x_coordinate;
    }

    public void addToIslandMap(IslandMap islandMap){

    }


    public int getY_coordinate() {
        return y_coordinate;
    }


    AnimalAction animalAction;


}
