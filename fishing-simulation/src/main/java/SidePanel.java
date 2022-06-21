import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SidePanel extends JPanel {
    final int width = 200;
    final int height = 50;
    MapPanel mapPanel;

    public SidePanel(Simulation sim, MapPanel mapPanel){
        this.setLayout(new GridLayout(10,1));
        this.setPreferredSize(new Dimension(width, height));
        this.setBackground(Color.lightGray);
        this.setDoubleBuffered(true);
        this.mapPanel = mapPanel;

        JButton moveButton = new JButton("Step");
        moveButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                sim.performStep();
                mapPanel.repaint();
            }
        });

        JButton move10Button = new JButton("10 Steps forward");
        move10Button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i=0; i<10; i++)
                    sim.performStep();
                mapPanel.repaint();
            }
        });

        this.add(moveButton);
        this.add(move10Button);
    }




}
