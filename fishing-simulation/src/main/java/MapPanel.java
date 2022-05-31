import javax.swing.*;
import java.awt.*;
import java.awt.color.*;

public class MapPanel extends JPanel {
    final int tileSize = 16;
    final int maxScreenCol = 30;
    final int maxScreenRow = 20;
    final int screenWidth = maxScreenCol * tileSize;
    final int screenHeight = maxScreenRow * tileSize;
    int [][] Pond;

    public MapPanel(){
        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.LIGHT_GRAY);
        Pond = new int[maxScreenCol][maxScreenRow];

        //this.setDoubleBuffered(true);     don't know what does that actually do
    }

        /*
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(true);
        window.setTitle("The Fish Empire");

        MapPanel map = new MapPanel();
        window.add(map);

        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);
        */

}


