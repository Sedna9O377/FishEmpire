import javax.swing.*;

public class Simulation {
    public static void main(String[] args){

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(true);
        window.setTitle("The Fish Empire");

        MapPanel map = new MapPanel();
        window.add(map);


        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}