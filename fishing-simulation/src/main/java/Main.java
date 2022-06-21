import javax.swing.*;

public class Main {

    public static void main(String[] args){

        int columns = input("Liczba kolumn (do 100)",100);
        int rows = input("Liczba wierszy (do 60)", 60);
        String message = "Poczatkowa liczba ryb (do " + columns*rows + ")";
        int fish_amount = input(message,columns*rows);
        int predator_percentage = input("Procent ryb drapieznych",100);

        Pond pond = new Pond(rows, columns);   //stworzenie planszy z rybami
        Simulation sim = new Simulation(pond, fish_amount, predator_percentage);

        sim.main();

        Window mainWindow = new Window(sim, pond.tab);

    }
    public static int input(String message, int upper_bound){
        JFrame f = new JFrame();
        int input;
        String string;
        do {
            do {
                string = JOptionPane.showInputDialog(f, message);
                if (string == null)
                    System.exit(0);
            }while(string.equals(""));
            input = Integer.parseInt(string);
        }while(!(input<upper_bound));
        return input;
    }
}
