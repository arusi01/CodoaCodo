package SEP24_TestBoton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ButtonHandler implements ActionListener {

    public ButtonHandler() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Boton1":
            System.out.println("Se ha presionado el boton1");
            JOptionPane.showMessageDialog(null, "Se ha presionado el boton1", "Mensaje", 1);
            break;
            case "Boton2":
            System.out.println("Se ha presionado el boton2");
            JOptionPane.showMessageDialog(null, "Se ha presionado el boton2", "Mensaje", 1);
            break;
            case "Boton3":
            System.out.println("Se ha presionado el boton3");
            JOptionPane.showMessageDialog(null, "Se ha presionado el boton3", "Mensaje", 1);
            break;
        }
    }
}
