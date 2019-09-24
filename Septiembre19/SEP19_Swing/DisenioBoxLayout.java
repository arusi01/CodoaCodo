package SEP19_Swing;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class DisenioBoxLayout {

    // organiza los componentes en forma vertical u horizontal
    // el constructor de borderlayout utiliza un constructor utiliza un 
    // parametro axis (eje) que debe utilizarse para indicar la direccion
    // que se alinean los componentes. X_AXIS: los coponentes se organizan
    // horizontalmente de izq a derecha Y_AXIS: los coponentes se organizan
    // verticalmente de arriba a abajo LINE_AXIS: los coponentes se organizan
    // en la misma direccion que las palabras de la misma direccion PAGE_AXIS:
    // los coponentes se organizan en la misma direccion que los componentes
    //de la misma direccion PAGE_AXIS:
    
    private JFrame ventana;
    private JButton b1, b2, b3, b4, b5;

    public DisenioBoxLayout() {
        ventana = new JFrame("BoxLayout");
        b1 = new JButton("Boton 1");
        b2 = new JButton("Boton 2");
        b3 = new JButton("Boton 3");
        b4 = new JButton("Boton 4");
        b5 = new JButton("Boton 5");
    }
    
    public void marco() {
        ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.X_AXIS));
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
        DisenioBoxLayout db = new DisenioBoxLayout();
        db.marco();
    }
    
}
