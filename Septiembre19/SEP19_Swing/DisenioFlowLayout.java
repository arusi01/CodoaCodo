package SEP19_Swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import static java.awt.FlowLayout.LEFT;
import javax.swing.JButton;
import javax.swing.JFrame;

public class DisenioFlowLayout {

    // coloca los componentes en una fila en su forma predeterminada
    // los componente de izq a derecha LEFT_TO_RIGTH
    // acomoda por defecto de arriba hacia abajo
    // esta orientacion se puede modificar con la propiedad Component_Orientation
    
    private JFrame ventana;
    private JButton b1, b2, b3, b4, b5;

    public DisenioFlowLayout() {
        ventana = new JFrame("FlowLayout");
        b1 = new JButton("Boton 1");
        b2 = new JButton("Boton 2");
        b3 = new JButton("Boton 3");
        b4 = new JButton("Boton 4");
        b5 = new JButton("Boton 5");
    }
    
        public void marco() {
//        ventana.setLayout(new FlowLayout());
        ventana.setLayout(new FlowLayout(LEFT,10,30));
        ventana.add(b1);
        ventana.add(b2);
        ventana.add(b3);
        ventana.add(b4);
        ventana.add(b5);
        ventana.setSize(500, 200);
        
        ventana.setVisible(true);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        DisenioFlowLayout df = new DisenioFlowLayout();
        df.marco();
    }
    
}
