import java.util.HashSet;
import java.util.Iterator;

public class Pond{
    private HashSet<NonPredator> nonSet;
    private HashSet<Predator> predatorSet;
    int rows;
    int columns;
    int step_counter;
    int[][] tab;    //przechowuje informacje o tym, gdzie są ryby i spławiki

    public Pond(int rows, int columns) {
        nonSet = new HashSet<>();
        predatorSet = new HashSet<>();
        this.rows = rows;
        this.columns = columns;
        tab = new int[rows][columns];
    }

    public void populate(int amount, int percentage){
        int predatorAmount = Math.round((float) amount * percentage / 100);  //oblicza liczbę ryb drapieżnych

        for(int i = 0; nonSet.size()+ predatorAmount < amount; i++){
            NonPredator hold = new NonPredator(i, rows, columns);   //tworzy obiekt z przypisanym losowym położeniem
            if(tab[hold.position_X][hold.position_Y]!=0){   //powtarza czynność, jeśli położenie jest już zajęte
                continue;
            }
            tab[hold.position_X][hold.position_Y]=2;    //"zajmuje" pozycję w tablicy
            nonSet.add(hold);
        }

        /* powyższe czynności są powtórzone dla ryb drapieżnych */
        for(int i = 0; predatorSet.size() < predatorAmount; i++){
            Predator hold = new Predator(i,rows,columns);
            if(tab[hold.position_X][hold.position_Y]!=0){
                continue;
            }
            tab[hold.position_X][hold.position_Y]=1;
            predatorSet.add(hold);
        }
    }


    public void step(){
        step_counter++;

        if(step_counter%10 == 0){
            //zmiana miejsca łowienia przez rybaków
        }

        Iterator<NonPredator> It1 = nonSet.iterator();
        while(It1.hasNext()) {
            NonPredator fish = It1.next();

            int[] coords = fish.ChooseDirection();          //wylosowanie proponowanego przemieszczenia
            if(coords[0] >= 0 && coords[1] >= 0 && coords[0] < rows && coords[1] < columns ){         //przemieszczenie na to pole tylko jeśli propozycja mieści się w obszarze tablicy i pole jest wolne
                if (tab[coords[0]][coords[1]] == 0) {
                    tab[fish.position_X][fish.position_Y] = 0;
                    fish.position_X = coords[0];
                    fish.position_Y = coords[1];
                    tab[coords[0]][coords[1]] = 2;
                }
                else if (tab[coords[0]][coords[1]] == 9){
                    //ryba zostaje złowiona
                }

            }
        }

        Iterator<Predator> It2 = predatorSet.iterator();
        while(It2.hasNext()){
            Predator fish = It2.next();

            int[] coords = fish.ChooseDirection();          //wylosowanie proponowanego przemieszczenia
            if(coords[0] >= 0 && coords[1] >= 0 && coords[0] < rows && coords[1] < columns ){         //przemieszczenie na to pole tylko jeśli propozycja mieści się w obszarze tablicy i pole jest wolne
                if (tab[coords[0]][coords[1]] == 0) {
                    tab[fish.position_X][fish.position_Y] = 0;
                    fish.position_X = coords[0];
                    fish.position_Y = coords[1];
                    tab[coords[0]][coords[1]] = 1;
                }
                else if(tab[coords[0]][coords[1]] == 2) {
                    Iterator<NonPredator> It3 = nonSet.iterator();
                    while(It3.hasNext()) {
                        NonPredator fish3 = It3.next();
                        if(fish3.position_X == coords[0] && fish3.position_Y == coords[1]){
                            It3.remove();
                            tab[coords[0]][coords[1]] = 0;
                        }
                    }
                }
            }
        }
    }



    public int getAmount() {
        return nonSet.size()+predatorSet.size();
    }

}

