package structure;

import description.AnimalAction;

public class Squad{
        public int coordinate_X;
        public int coordinates_Y;


    public Squad(int xCoordinates, int yCoordinates) {
        this.coordinate_X = xCoordinates;
        this.coordinates_Y = yCoordinates;
    }

    public int getCoordinate_X() {
        return coordinate_X;
    }

    public void setCoordinate_X(int coordinate_X) {
        this.coordinate_X = coordinate_X;
    }

    public int getCoordinates_Y() {
        return coordinates_Y;
    }

    public void setCoordinates_Y(int coordinates_Y) {
        this.coordinates_Y = coordinates_Y;
    }

    AnimalAction animalAction;


}
