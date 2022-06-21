import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;

public class Window {

    public Window (Simulation sim, int[][] tab){
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //utworzenie pliku przy zamknięciu okna
        window.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent arg0) {
                try {
                    sim.makeFile(); //Call your method
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
                System.exit(0);
            }
        });

        window.setTitle("The Fish Empire");

        MapPanel mapPanel = new MapPanel(tab, sim.columns, sim.rows);
        window.add(mapPanel, BorderLayout.CENTER);
        SidePanel sidePanel = new SidePanel(sim, mapPanel);
        window.add(sidePanel, BorderLayout.WEST);
        window.pack();

        window.setPreferredSize(new Dimension((mapPanel.mapWidth+sidePanel.width),Math.max(mapPanel.mapHeight, sidePanel.height)));

        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setResizable(false);
    }

}
