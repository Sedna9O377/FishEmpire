

public class Simulation{
    int columns;
    int rows;
    int predator_percentage;
    int fish_amount;

    public static void main(String[] args){

        Simulation sim = new Simulation();

        Pond pond = new Pond(sim.fish_amount, sim.rows, sim.columns);

        pond.populate(sim.fish_amount, sim.rows, sim.columns, sim.predator_percentage);
        pond.print(sim.rows, sim.columns);


    }

    public Simulation() {  //w przyszłości będzie tu input użytkownika
        //System.out.println("Podaj wysokość i szerokość planszy.");
        //Scanner in = new Scanner(System.in);

        this.rows = 10;//in.nextInt();
        this.columns = 30;//in.nextInt();
        this.fish_amount = 320;
        this.predator_percentage = 50;
    }

}