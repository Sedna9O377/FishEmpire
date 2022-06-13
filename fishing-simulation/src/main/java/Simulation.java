import javax.swing.*;
import java.awt.*;

public class Simulation{
    int columns;
    int rows;
    int predator_percentage;
    int fish_amount;
    int[][] tab;

    public static void main(String[] args){

        Simulation sim = new Simulation();

        Pond pond = new Pond(sim.fish_amount, sim.rows, sim.columns);

        pond.populate(sim.fish_amount, sim.rows, sim.columns, sim.predator_percentage);
        //pond.print(sim.rows, sim.columns);

        Window mainWindow = new Window(sim, pond.tab);

    }

    public Simulation() {  //w przyszłości będzie tu input użytkownika

        this.rows = 30;
        this.columns = 30;
        this.fish_amount = 100;
        this.predator_percentage = 50;
    }

    public void performStep(){
        //tu wywołać metodę stepu

    }


}