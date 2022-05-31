import java.util.HashSet;
import java.util.Random;

public class NonPredator extends Fish{

    public NonPredator(int index, int rows, int columns){
        Random rand = new Random();
        position_X = rand.nextInt(columns);
        position_Y = rand.nextInt(rows);
        this.index = index;
    }

    @Override
    public String toString() {
        return "NonPredatory fish no. " + index + " on position " +
                "X=" + position_X +
                " Y=" + position_Y + " exists!";
    }
}
