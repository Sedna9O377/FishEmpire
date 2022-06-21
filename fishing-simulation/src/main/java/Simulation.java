import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Simulation{
    int columns;
    int rows;
    int predator_percentage;
    int fish_amount;
    int initial_fish_amount;
    Pond pond;
    int stepcounter;

    public void main(){

    pond.populate(initial_fish_amount, predator_percentage);    // zapełnia staw odpowiednią liczbą ryb drapieżnych i niedrapieżnych

    }

    public Simulation(Pond pond, int initial_fish_amount, int predator_percentage) {  //w przyszłości będzie tu input użytkownika

        this.rows = pond.rows;
        this.columns = pond.columns;
        this.initial_fish_amount = initial_fish_amount;
        this.fish_amount = pond.getAmount();
        this.predator_percentage = predator_percentage;
        this.pond = pond;
    }

    public void performStep(){
        pond.step();
        stepcounter++;
    }
    public void makeFile () throws FileNotFoundException {
        File file = new File("plik.txt");
        PrintWriter writer = new PrintWriter(file);
        writer.println("Wymiary " + columns + " x " + rows);
        writer.println("Liczba ryb: " + initial_fish_amount);
        writer.println("Początkowa liczba ryb drapieżnych: " + Math.round((float)predator_percentage*initial_fish_amount/100));
        writer.println("Początkowa liczba ryb niedrapieżnych: " + Math.round(initial_fish_amount-(float)predator_percentage*initial_fish_amount/100));
        writer.println("Liczba wykonanych kroków przed zamknięciem symulacji: " + stepcounter);
        writer.println("Końcowa liczba ryb: " + pond.getAmount());
        writer.println("Liczba ryb drapieżnych: " + pond.getPredator());
        writer.println("Liczba ryb niedrapieżnych: " + pond.getNonPredator());
        writer.close();
    }
}