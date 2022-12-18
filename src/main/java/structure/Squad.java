package structure;


import java.util.concurrent.LinkedBlockingQueue;

public class Squad extends Thread {
    private final String nameSquad;
    private final int x_coordinate;
    private final int y_coordinate;

    @Override
    public void run() {

    }

    public LinkedBlockingQueue animalsQueueOnSquad;   //задай вопрос, какими еще способомами можно
                                                //обратиться к этой переменной? кроме get & set


    public LinkedBlockingQueue getAnimalsQueueOnSquad() {
        return animalsQueueOnSquad;
    }

    public void setAnimalsQueueOnSquad(LinkedBlockingQueue animalsQueueOnSquad) {
        this.animalsQueueOnSquad = animalsQueueOnSquad;
    }

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

}
