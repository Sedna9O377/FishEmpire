import javax.swing.*;
import java.awt.*;

public class Window {

    public Window (Simulation sim, int[][] tab){
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setTitle("The Fish Empire");

        MapPanel mapPanel = new MapPanel(tab, sim.columns, sim.rows);
        window.add(mapPanel, BorderLayout.CENTER);
        SidePanel sidePanel = new SidePanel(sim, mapPanel);
        window.add(sidePanel, BorderLayout.WEST);
        window.pack();

        window.setPreferredSize(new Dimension((mapPanel.mapWidth+sidePanel.width),mapPanel.mapHeight));

        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setResizable(false);
    }

}
