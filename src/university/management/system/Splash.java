package university.management.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable {
    Thread t;
    Splash () {
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.png"));
        Image i2 = i1.getImage().getScaledInstance(1200, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
    
        t= new Thread(this);
        t.start();
        setLocation(250,50);
        setSize(1000,700);
        setVisible(true);    
             
    }
    
    public void run() {
        try {
            Thread.sleep(5000);
            setVisible(false);
            
            // Next Frame
            new Login();
        } catch (Exception e) {
            
        }
    }
    
    public static void main(String[] args) {
        new Splash();
    }
}