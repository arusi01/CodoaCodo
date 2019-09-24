package SEP19_Swing;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

// coloca los componentes en filas y columna
// cada componentes ocupa el mismo espacio en el contenedor.
// al crear el diseño de la cuadricula es especifico especificar el 
// el numero de filas y columnas. si no especifica 1 fila y 1 colum
// tambien se puede especificar la distancia horiz y vertical de cada
// componente

public class DisenioGridLayout {

    private JFrame ventana;
    private JButton b1, b2, b3, b4, b5;

    public DisenioGridLayout() {
        ventana = new JFrame("GridLayout");
        b1 = new JButton("Boton 1");
        b2 = new JButton("Boton 2");
        b3 = new JButton("Boton 3");
        b4 = new JButton("Boton 4");
        b5 = new JButton("Boton 5");
    }
        
    public void marco() {
        // primero la fila 3 y segundio la columna 2
        ventana.setLayout(new GridLayout(3,2));
        ventana.add(b1);
        ventana.add(b2);
        ventana.add(b3);
        ventana.add(b4);
        ventana.add(b5);
        
        ventana.pack();
        ventana.setSize(500, 200);
        
        ventana.setVisible(true);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        DisenioGridLayout DG = new DisenioGridLayout();
        DG.marco();
    }
    
}
