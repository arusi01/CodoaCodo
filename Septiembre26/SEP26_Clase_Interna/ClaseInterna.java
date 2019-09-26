package SEP26_Clase_Interna;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ClaseInterna {

    // Vamos a crear eventos con clases internas
    // El uso de clases internas para manejar eventos permite acceder
    // a los datos privados de la clase externa
    
    // adaptadores de eventos se herredan
    private JFrame ventana;
    private JTextField cajaTexto;

    public ClaseInterna() {
        ventana = new JFrame("Ejemplo de clase interna");
        cajaTexto = new JTextField(30);
    }

    // Clase Interna
    class MyMotionListener extends MouseMotionAdapter {

        public void mouseDragged(MouseEvent e) {
            String s = "Arrastre el raton: X=" + e.getX() + " Y= " + e.getY();
            cajaTexto.setText(s);
        }
    }
    
    class MyMouseClickHandler extends MouseAdapter{

        public void mouseEntered(MouseEvent e) {
            String s = "El raton a entredo";
            cajaTexto.setText(s);
        }

        public void mouseExited(MouseEvent e) {
            String s = "El raton a salido";
            cajaTexto.setText(s);
        }
    }
    
     public void marco() {
        JLabel etiqueta = new JLabel("Hace click y arrastrar el boton");
        ventana.add(etiqueta, BorderLayout.NORTH);
        ventana.add(cajaTexto, BorderLayout.SOUTH);
                                       // objeto anonimo
        ventana.addMouseMotionListener(new MyMotionListener());
        ventana.addMouseListener(new MyMouseClickHandler());
        ventana.setSize(300, 200);
        ventana.setVisible(true);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        ClaseInterna b = new ClaseInterna();
        b.marco();
    }

}
