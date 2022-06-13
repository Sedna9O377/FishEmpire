import java.util.HashSet;

public class Pond{
    private HashSet<NonPredator> nonSet;
    private HashSet<Predator> predatorSet;
    int[][] tab;

    public Pond(int amount, int rows, int columns) {
        this.nonSet = new HashSet<>(amount);
        this.predatorSet = new HashSet<>(amount);
         tab = new int[rows][columns];
    }

    public void populate(int amount, int rows, int columns, int percentage){
        int x = Math.round((float) amount * percentage / 100);

        for(int i = 0; nonSet.size()+x < amount; i++){
            NonPredator hold = new NonPredator(i, rows, columns);
            if(tab[hold.position_X][hold.position_Y]!=0){
                continue;
            }
            tab[hold.position_X][hold.position_Y]=2;
            nonSet.add(hold);
        }
        for(int i = 0; predatorSet.size() < x; i++){
            Predator hold = new Predator(i,rows,columns);
            if(tab[hold.position_X][hold.position_Y]!=0){
                continue;
            }
            tab[hold.position_X][hold.position_Y]=1;
            predatorSet.add(hold);
        }
    }

/*
    public void print(int rows, int columns){

        System.out.println("There are " + (nonSet.size()+predatorSet.size()) + " fish in the pond.");
        System.out.println( nonSet.size() + " of therm are non predatory.");
        System.out.println( predatorSet.size() + " are the predators.");
        //Iterator i = nonSet.iterator();

        for(int j = 0; j<rows;j++){
            for(int k = 0; k<columns; k++){
                System.out.print(tab[j][k]);
            }
            System.out.println();
        }
*/

}

