package Lambda_Expression;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class My_Window {

    public static void main(String[] args) {

        JFrame f = new JFrame("My Window");
        f.setSize(400, 400);
        f.setVisible(true);
        f.setLayout(null);

        JButton b = new JButton("Click");
        b.setBounds(150, 300, 70, 30);
        f.add(b);

// Anonymous Class Implementation

        /*
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked");
                JOptionPane.showMessageDialog(null,"Button Clicked");
            }
        });
        */

    // Lambda Expression Implementation

        b.addActionListener((ActionEvent e) -> {
            System.out.println("Button Clicked");
            JOptionPane.showMessageDialog(null,"Button Clicked");
        });
    }
}
