import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuDemo1 {
  public static void main(String[] args) {
    // Create a window for this demo
    JFrame frame = new JFrame("Menu Demo");
    JPanel panel = new JPanel();
    frame.getContentPane().add(panel, "Center");

    // Create an action listener for the menu items we will create
    // The MenuItemActionListener class is defined below
    ActionListener listener = new MenuItemActionListener(panel);

    // Create some menu panes, and fill them with menu items
    // The menuItem() method is important.  It is defined below.
    JMenu file = new JMenu("File");
    file.setMnemonic('F');
    file.add(menuItem("New", listener, "new", 'N', KeyEvent.VK_N));
    file.add(menuItem("Open...", listener, "open", 'O', KeyEvent.VK_O));
    file.add(menuItem("Save", listener, "save", 'S', KeyEvent.VK_S));
    file.add(menuItem("Save As...", listener, "saveas", 'A', KeyEvent.VK_A));

    JMenu edit = new JMenu("Edit");
    edit.setMnemonic('E');
    edit.add(menuItem("Cut", listener, "cut", 0, KeyEvent.VK_X));
    edit.add(menuItem("Copy", listener, "copy", 'C', KeyEvent.VK_C));
    edit.add(menuItem("Paste", listener, "paste", 0, KeyEvent.VK_V));

    // Create a menubar and add these panes to it.
    JMenuBar menubar = new JMenuBar();
    menubar.add(file);
    menubar.add(edit);

    // Add menubar to the main window.  Note special method to add menubars
    frame.setJMenuBar(menubar); 

    // Now create a popup menu and add the some stuff to it
    final JPopupMenu popup = new JPopupMenu();
    popup.add(menuItem("Open...", listener, "open", 0, 0));
    popup.addSeparator();                // Add a separator between items
    JMenu colors = new JMenu("Colors");  // Create a submenu
    popup.add(colors);                   // and add it to the popup menu
    // Now fill the submenu with mutually-exclusive radio buttons
    ButtonGroup colorgroup = new ButtonGroup();
    colors.add(radioItem("Red", listener, "color(red)", colorgroup));
    colors.add(radioItem("Green", listener, "color(green)", colorgroup));
    colors.add(radioItem("Blue", listener, "color(blue)", colorgroup));

    // Arrange to display the popup menu when the user clicks in the window
    panel.addMouseListener(new MouseAdapter() {
      public void mousePressed(MouseEvent e) {
  // Check whether this is the right type of event to pop up a popup
  // menu on this platform.  Usually checks for right button down.
  if (e.isPopupTrigger()) 
    popup.show((Component)e.getSource(), e.getX(), e.getY());
      }
    });

    // Finally, make our main window appear
    frame.setSize(450, 300);
    frame.setVisible(true);
  }

  // A convenience method for creating menu items.
  public static JMenuItem menuItem(String label, 
           ActionListener listener, String command, 
           int mnemonic, int acceleratorKey) {
    JMenuItem item = new JMenuItem(label);
    item.addActionListener(listener);
    item.setActionCommand(command);
    if (mnemonic != 0) item.setMnemonic((char) mnemonic);
    if (acceleratorKey != 0) 
      item.setAccelerator(KeyStroke.getKeyStroke(acceleratorKey, 
             java.awt.Event.CTRL_MASK));
    return item;
  }

  // A convenience method for creating radio button menu items.
  public static JMenuItem radioItem(String label, ActionListener listener, 
            String command, ButtonGroup mutExGroup) {
    JMenuItem item = new JRadioButtonMenuItem(label);
    item.addActionListener(listener);
    item.setActionCommand(command);
    mutExGroup.add(item);
    return item;
  }

  // A event listener class used with the menu items created above.
  // For this demo, it just displays a dialog box when an item is selected.
  public static class MenuItemActionListener implements ActionListener {
    Component parent;
    public MenuItemActionListener(Component parent) { this.parent = parent; }
    public void actionPerformed(ActionEvent e) {
      JMenuItem item = (JMenuItem) e.getSource();
      String cmd = item.getActionCommand();
      JOptionPane.showMessageDialog(parent, cmd + " was selected.");
    }
  }
}


           
         
    
    
  





