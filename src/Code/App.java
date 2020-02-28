package Code;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App {
    private JPanel PanelMain;
    private JLabel lbl;
    /*
    * this program said hello world in as gui form
    */

//display Hello world in a GIU form
    public App() {
        //this is telling the lable to say hello and add world
        lbl.setText("Hello + World");
    }
//this creates the frame and makes it visable
    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().PanelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
