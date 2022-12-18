package description;

import java.util.concurrent.Executor;

public interface AnimalAction  {

       void eat();
       void goToSquare(int x, int y);
       int[][] changeSquare();
       AnimalAction reproduction(AnimalAction animal);
       void starveToDeath ();
       void beEaten();

}
