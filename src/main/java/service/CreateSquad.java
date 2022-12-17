package service;

import structure.Squad;

public class CreateSquad extends Thread {
    //работает в одном потоке
    public CreateSquad(int x_coordinate, int y_coordinate) {
        this.x_coordinate = x_coordinate;
        this.y_coordinate = y_coordinate;
    }

    int x_coordinate;
    int y_coordinate;
    @Override
    public void run() {
        new Squad(x_coordinate, y_coordinate);
    }
}
