package description;

import java.util.concurrent.Executor;

public interface AnimalAction extends Executor {
       void eat();
       void goToSquare(int x, int y);
       int[][] changeSquare();
       AnimalAction reproduction(AnimalAction animal);
       void starveToDeath ();
       void beEaten();
}
