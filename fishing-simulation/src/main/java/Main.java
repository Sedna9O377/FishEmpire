public class Main {

    public static void main(String[] args){
        int fish_amount = 100;
        int rows = 30;
        int columns = 30;

        Pond pond = new Pond(fish_amount, rows, columns);
        Simulation sim = new Simulation(pond, fish_amount);

        sim.main();

        Window mainWindow = new Window(sim, pond.tab);

    }

}
