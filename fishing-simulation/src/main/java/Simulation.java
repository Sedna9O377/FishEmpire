import javax.swing.*;
import java.util.*;

public class Simulation{
    int columns;
    int rows;

    public static void main(String[] args){

        Simulation sim = new Simulation();

        Random rand = new Random();
        int fishAmount = rand.nextInt(sim.columns * sim.rows);

        Pond pond = new Pond(fishAmount);

        pond.populate(fishAmount, sim.rows, sim.columns);
        pond.print();


    }

    public Simulation() {
        //System.out.println("Podaj wysokość i szerokość planszy.");

        //Scanner in = new Scanner(System.in);

        this.rows = 5;//in.nextInt();
        this.columns = 13;//in.nextInt();
    }

}