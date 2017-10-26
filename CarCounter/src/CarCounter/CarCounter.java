/**
 * Created by sell4_8aha on 9/12/2017.
 */

package CarCounter;

//imports

import java.awt.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;


//main class
public class CarCounter extends JFrame implements ActionListener {
    private int carCount;

    //creates frames
    JFrame f;
    JTextField t;

    //creates buttons
    private JButton button1;
    private JButton button2;


    //creates GUI
    CarCounter() {
        f = new JFrame("Counter");
        t = new JTextField();
        button1 = new JButton("Car Entering");
        button2 = new JButton("Car Exiting");

        t.setBounds(30, 40, 280, 30);
        button1.setBounds(50, 240, 240, 40);
        button2.setBounds(50, 340, 240, 40);

        f.add(t);
        f.add(button1);
        f.add(button2);

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(350, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(true);

        button1.addActionListener(this);
        button2.addActionListener(this);
    }

    //adds button actions
    public void actionPerformed(ActionEvent e) {

        //default starting display
        if (e.getSource() == button1) {
            carCount++;
            t.setText("");
        }
        //car entering button
        if (e.getSource() == button1) {

            t.setText(t.getText().concat("" + carCount));
        }
        //car exiting button
        if (e.getSource() == button2) {
                carCount--;
                t.setText("");
            }

        if (e.getSource() == button2) {

                t.setText(t.getText().concat("" + carCount));

            }




    }


    //main method
    public static void main(String[] args) {
        new CarCounter();


            //calls GUI
            JPanel gui1 = new JPanel(new BorderLayout(3, 3));

        gui1.setBorder(new EmptyBorder(30, 40, 280, 400));
        JOptionPane.showMessageDialog(null, gui1);


    }

}






