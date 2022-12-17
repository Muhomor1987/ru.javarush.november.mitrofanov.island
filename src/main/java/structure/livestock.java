package structure;

import java.util.ArrayList;

public class livestock {
    static public ArrayList classLivesStock = new ArrayList();


    public ArrayList getClassLivesStock() {
        return classLivesStock;
    }

    void add(){
        classLivesStock.add(Object.class);
    }
}
