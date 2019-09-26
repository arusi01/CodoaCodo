package SEP26_Clase_Interna;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// Clase interna con clase anonima
// En esta seccion se analiza un ejemplo de codigo de java mas complejo
// en el se hace el seguimiento del movimiento del raton cuando se pulsa
// su boton. arrastre del raton.
// Tambien se detecta el movimiento del raton cuando se pulsan
// sus botones. Movimiento de raton.
// los moviminetos provocados por el movimiento del raton con o sin presionar
// el boton.
// pueden ser recogidos por objetos de un clase que implementa la interfaz
// MouseMotionListener
// esta interfaz requiere dos metodos Mouse_ Mouse_Moveit
// aunque que estes interesado en el movimiento de arrastre debes suministrar
// ambos metodos, entonces si bien el cuerpo del metodo no se va a implementar
// se deja vacio.
// para incorporar los otros eventos del raton incluidos la de la pulsacion del 
// boton es preciso implementar la interfaz MouseListener, esta interfaz
// contiene varios eventos incluidos Mouse_Entered , Mouse_Exited , Mouse_Pressed
// Mouse_Released , Mouse_Clicked

public class DosEscuchas implements MouseMotionListener, MouseListener{
    
    private JFrame ventana;
    private JTextField cajaTexto;

    public DosEscuchas() {
        ventana = new JFrame("Ejemplo de dos Receptores");
        cajaTexto = new JTextField(30);
    }
    
    public void marco() {
        JLabel etiqueta = new JLabel("Hace click y arrastrar el boton");
        ventana.add(etiqueta, BorderLayout.NORTH);
        ventana.add(cajaTexto, BorderLayout.SOUTH);
        ventana.addMouseMotionListener(this);
        ventana.addMouseListener(this);
        ventana.setSize(300, 200);
        ventana.setVisible(true);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        DosEscuchas b = new DosEscuchas();
        b.marco();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        String s = "Arrastre el raton: X="+e.getX()+" Y= "+e.getY();
        cajaTexto.setText(s);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        String s = "Boton apretado";
        cajaTexto.setText(s);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        String s = "El raton a entredo";
        cajaTexto.setText(s);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        String s = "El raton a salido";
        cajaTexto.setText(s);
    }
    
}
