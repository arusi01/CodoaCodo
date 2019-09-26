package SEP26_Clase_Interna;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ClaseAnonima {

    // Es posible incluir una definicion de clase completa dentro del ambito de una
    // exprecion esta formula permite definir lo que denomina una clase interna
    // anonima y crear la instancia al mismo tiempo.
    // las clases internas se utilizan con frecuencia en el manejo de eventos
    
    private JFrame ventana;
    private JTextField cajaTexto;

    public ClaseAnonima() {
        ventana = new JFrame("Ejemplo de clase anonima");
        cajaTexto = new JTextField(30);
    }
    
    public void marco() {
        JLabel etiqueta = new JLabel("Hace click y arrastrar el boton");
        ventana.add(etiqueta, BorderLayout.NORTH);
        ventana.add(cajaTexto, BorderLayout.SOUTH);
        ventana.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                String s = "Arrastre el raton: X=" + e.getX() + " Y= " + e.getY();
                cajaTexto.setText(s);
            }

//            public void mouseMoved(MouseEvent e) {
//                String s = "Mouse moved " + e.getX() + "," + e.getY();
//                cajaTexto.setText(s);
//            }
        });
        ventana.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                String s = "El raton a entredo";
                cajaTexto.setText(s);
            }

            public void mouseExited(MouseEvent e) {
                String s = "El raton a salido";
                cajaTexto.setText(s);
            }
        });
        ventana.setSize(300, 200);
        ventana.setVisible(true);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        ClaseAnonima b = new ClaseAnonima();
        b.marco();
    }
    
}
