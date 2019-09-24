package SEP24_TestBoton;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

// metodos fundamentales:
// 1 setdefaultcloseoperation define el comportamiento de jframe cuando
// se define el cierre
// hay 4: 
// A DO_NOTHING_ON_CLOSE (windowsconstants) no hace nada en el cierre
// estas constantes se definen en windowsconstants
// B HIDE_ON_CLOSE (windowsconstants) llama a cualquier posible objeto 
// windowslistener y oculta el marco
// C DISPOSE_ON_CLOSE (windowsconstants) llama a cualquier posible objeto
// windowslistener y oculta el marco y lo cierra.
// D EXIT_ON_CLOSE
// Metodos listener: 
// addActionListener componentes como botones caja de texto combo box y menu
// de items eventos generados por usuario
// addFocusListener trabaja con todos los componentes swing
// addKeyListener();
// addMouseMotionListener();
// addMouseListener();
// addWindowsListener(); Trabaja con componentes JWindows JFrame
// addTextListener(); Trabaja con componentes JTextfill JTextarea

public class TestBoton {

    private JFrame ventana;
    private JButton boton, boton2, boton3;
    
    public TestBoton() {
        ventana = new JFrame("Test Boton");
        boton = new JButton("Pulsar");
        boton.setActionCommand("Boton1");
        boton2 = new JButton("Mensaje");
        boton2.setActionCommand("Boton2");
        boton3 = new JButton("Suerte");
        boton3.setActionCommand("Boton3");
    }
    
    public void mostrar() {
        boton.addActionListener(new ButtonHandler());  //manejador de eventos
        boton2.addActionListener(new ButtonHandler());  //manejador de eventos
        boton3.addActionListener(new ButtonHandler());  //manejador de eventos
        ventana.add(boton,BorderLayout.CENTER);
        ventana.add(boton2,BorderLayout.EAST);
        ventana.add(boton3,BorderLayout.WEST);
        ventana.pack();
        ventana.setVisible(true);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        TestBoton b = new TestBoton();
        b.mostrar();
    }
    
}
