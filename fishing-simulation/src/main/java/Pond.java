import java.util.HashSet;
import java.util.Iterator;

public class Pond{
    private HashSet<NonPredator> nonSet;
    int[][] tab = new int[5][13];

    public Pond(int amount) {
        this.nonSet = new HashSet<>(amount);
    }

    public void populate(int amount, int rows, int columns){
        for(int i = 0; nonSet.size() < amount; i++){
            NonPredator hold = new NonPredator(i, rows, columns);
            if(tab[hold.position_Y][hold.position_X]!=0){
                continue;
            }
            tab[hold.position_Y][hold.position_X]++;
            nonSet.add(hold);
        }

    }

    public void print(){
        System.out.println("There are " + nonSet.size() + " fish in the pond.");
        Iterator i = nonSet.iterator();

        for(int j = 0; j<5;j++){
            for(int k = 0; k<13; k++){
                System.out.print(tab[j][k]);
            }
            System.out.printf("\n");
        }
    }

}
