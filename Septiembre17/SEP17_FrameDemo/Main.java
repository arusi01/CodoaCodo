package SEP17_FrameDemo;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        JLabel emptyLabel = new JLabel("Prueba");
        JFrame frame = new JFrame("FrameDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(emptyLabel, BorderLayout.EAST);
        frame.pack();
        frame.setSize(400, 500);
        frame.setVisible(true);
        
    }
    
}
