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
        this.setBackground(Color.blue);
        this.setDoubleBuffered(true);

        this.tab = tab;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for(int i = 0; i < maxMapRow; i++){
            for(int j = 0; j< maxMapCol; j++) {
                if (tab[i][j] == 1) {
                    g2.setColor(Color.red);
                    g2.fillRect(i*tileSize, j*tileSize, tileSize, tileSize);
                }
                else if (tab[i][j] == 2) {
                    g2.setColor(Color.black);
                    g2.drawRect(i*tileSize, j*tileSize, tileSize, tileSize);
                }
            }
        }
        g2.dispose();
    }

}


