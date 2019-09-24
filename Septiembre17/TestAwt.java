package SEP17_AWT;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestAwt extends WindowAdapter{

    private Frame marco;

    public TestAwt() {
        marco = new Frame("Hola Java AWT");
    }
    
    public void marco() {
        marco.setSize(300, 300);
        marco.setBackground(Color.blue);
        marco.setVisible(true);
        marco.addWindowListener(this);
    }
    
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        TestAwt a = new TestAwt();
        a.marco();
    }
    
}
