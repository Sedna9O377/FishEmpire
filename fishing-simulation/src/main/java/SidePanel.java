import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SidePanel extends JPanel {
    final int width = 250;
    final int height = 200;

    public SidePanel(Simulation sim){
        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(width, height));
        this.setBackground(Color.lightGray);
        this.setDoubleBuffered(true);

        JButton moveButton = new JButton("Step");
        moveButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                sim.performStep();
            }
        });

        //JTextArea text = new JTextArea("No i co",10,1);
        //this.add(text, BorderLayout.SOUTH);
        this.add(moveButton);
    }




}