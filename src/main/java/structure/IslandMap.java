package structure;

import java.util.ArrayList;

public class IslandMap {

    private final String name;
    public final int width;
    public final int height;

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }


    public IslandMap(int height, int width) {
        name = "Island " + width + "x" + height;
        this.width = width;
        this.height = height;
    }


    public ArrayList squads = new ArrayList<Squad>();

}