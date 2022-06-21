import javax.swing.*;
import java.awt.*;

public class MapPanel extends JPanel {
    final int tileSize = 16;
    int maxMapCol;
    int maxMapRow;
    int mapWidth;
    int mapHeight;
    int[][] tab;

    public MapPanel(int[][] tab, int columns, int rows){
        this.setLayout(new BorderLayout());

        maxMapCol = columns;
        maxMapRow = rows;
        mapWidth = maxMapCol * tileSize;
        mapHeight = maxMapRow * tileSize;

        this.setPreferredSize(new Dimension(mapWidth, mapHeight));
        this.setBackground(new Color(200, 240, 255));
        this.setDoubleBuffered(true);

        this.tab = tab;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.lightGray);
        g2.fillRect(0,mapHeight,mapWidth,200);
        for(int i = 0; i < maxMapRow; i++){
            for(int j = 0; j< maxMapCol; j++) {
                if (tab[i][j] == 1) {
                    g2.setColor(new Color(205,60,50));
                    g2.fillRect(j*tileSize, i*tileSize, tileSize, tileSize);
                }
                else if (tab[i][j] == 2) {
                    g2.setColor(Color.black);
                    g2.fillRect(j*tileSize, i*tileSize, tileSize, tileSize);
                }
            }
        }

        g2.dispose();
    }

}


