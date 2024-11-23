package university.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    About() {
        setSize(1000, 700);
        setLocation(250, 50);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 100, 300, 200);
        add(image);
        
        JLabel heading = new JLabel("University Management System");
        heading.setBounds(150, 5, 800, 130);
        heading.setFont(new Font("Tahoma", Font.BOLD, 45));
        add(heading);
        
        JLabel name = new JLabel(" Java project for 3rd Semester ");
        name.setBounds(240, 310, 800, 40);
        name.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(name);
        
        JLabel BY1 = new JLabel("By : ANKIT SRIVASTAVA   --- 220714100012" );
        BY1.setBounds(70, 370, 550, 40);
        BY1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(BY1);
        
        JLabel BY2 = new JLabel("      CHIKUL SAMATARAY  --- 220714100039" );
        BY2.setBounds(70, 390, 550, 40);
        BY2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(BY2);
        
        JLabel BY3 = new JLabel("      JOYJEET JENA           --- 220714100038" );
        BY3.setBounds(70, 410, 550, 40);
        BY3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(BY3);
        
        JLabel BY4 = new JLabel("      SNEHASHREE DASH   --- 220714100029" );
        BY4.setBounds(70, 430, 550, 40);
        BY4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(BY4);
        
        JLabel contact = new JLabel("Guided by: Prof. Saroj Kumar Sahoo");
        contact.setBounds(70, 500, 550, 40);
        contact.setFont(new Font("Tahoma", Font.PLAIN, 28));
        add(contact);
        
        setLayout(null);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new About();
    }
}