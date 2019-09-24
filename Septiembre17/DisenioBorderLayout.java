package SEP19_Swing;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class DisenioBorderLayout {

    // BorderLayout FlowLayout BoxLayout CardLayout GridLayout GridBagLayout
    // BorderLayout organiza los coponentes en 5 zonas diferentes
    // Center, North, South, East, West
    // Este administrador de diseño limita a 1 el nro de componentes
    // que puede agregar a cada zona 
    
    private JFrame ventana;
    private JButton bn, bs, bw, be, bc;

    public DisenioBorderLayout() {
        ventana = new JFrame("BorderLayout");
        bn = new JButton("Boton Norte");
        bs = new JButton("Boton Sur");
        be = new JButton("Boton Este");
        bw = new JButton("Boton Oeste");
        bc = new JButton("Boton Centro");
        
    }
    
    public void marco() {
        ventana.add(bn, BorderLayout.NORTH);
        ventana.add(bs, BorderLayout.SOUTH);
        ventana.add(be, BorderLayout.EAST);
        ventana.add(bw, BorderLayout.WEST);
        ventana.add(bc, BorderLayout.CENTER);

        ventana.setSize(400, 200);
       
        ventana.setVisible(true);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        DisenioBorderLayout bl = new DisenioBorderLayout();
        bl.marco();
    }
    
}
