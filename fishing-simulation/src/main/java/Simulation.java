import javax.swing.*;
import java.awt.*;

public class Simulation{
    int columns;
    int rows;
    int predator_percentage;
    int fish_amount;
    int initial_fish_amount;
    int[][] tab;
    Pond pond;

    public void main(){

    pond.populate(initial_fish_amount, predator_percentage);

    }

    public Simulation(Pond pond, int initial_fish_amount) {  //w przyszłości będzie tu input użytkownika

        this.rows = pond.rows;
        this.columns = pond.columns;
        this.initial_fish_amount = initial_fish_amount;
        this.fish_amount = pond.getAmount();
        this.predator_percentage = 50;
        this.pond = pond;
    }

    public void performStep(){
        System.out.println("Step!");
        pond.step();
    }
}