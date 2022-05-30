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



}


