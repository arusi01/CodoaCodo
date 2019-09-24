
package SEP19_Swing;

import javax.swing.JFrame;
import javax.swing.JLabel;


// organiza los componentes en fila y columnas en forma similar 
// al diseñador de cuadriculas pero para mayor flexivilidad 
// incluye opciones para cambiar el tamanio y la posicion
// de los componentes


public class DisenioGridBagLAyout {

    public static void mostrarGUI() {
    
        JFrame ventana = new JFrame("Hola mundo Swing");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel etiqueta = new JLabel("Hola numdo Swing JLabel");
        ventana.add(etiqueta);
        ventana.setSize(300, 200);
        ventana.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        mostrarGUI();
    }
    
}
