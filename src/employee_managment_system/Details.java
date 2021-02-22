package employee_managment_system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Details implements ActionListener {

    JFrame f;
    JLabel l1, l2;
    JButton b1, b2, b3, b4;

    Details() {

        f = new JFrame("Details");
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close application when frame closed 

        l1 = new JLabel();
        l1.setBounds(0, 0, 700, 500);
        l1.setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("employee_managment_system/icons/details.jpg"));
        l1.setIcon(i1); //setting icon on the whole frame
        f.add(l1);

        l2 = new JLabel("Employee Details");
        l2.setBounds(430, 20, 200, 40);
        l2.setFont(new Font("serif", Font.BOLD, 25)); // Font is awt class object
        l2.setForeground(Color.black);
        l1.add(l2);

        //Add button b1
        b1 = new JButton("Add");
        b1.setBounds(420, 80, 100, 40);
        b1.setFont(new Font("serif", Font.BOLD, 15));
        b1.addActionListener(this);
        l1.add(b1);

        //view buuton b2
        b2 = new JButton("View");
        b2.setBounds(530, 80, 100, 40);
        b2.setFont(new Font("serif", Font.BOLD, 15));
        b2.addActionListener(this);
        l1.add(b2);

        //remove buuton b3
        b3 = new JButton("Delete");
        b3.setBounds(420, 140, 100, 40);
        b3.setFont(new Font("serif", Font.BOLD, 15));
        b3.addActionListener(this);
        l1.add(b3);

        //Update button b4
        b4 = new JButton("Update");
        b4.setBounds(530, 140, 100, 40);
        b4.setFont(new Font("serif", Font.BOLD, 15));
        b4.addActionListener(this);
        l1.add(b4);

        f.setVisible(true);
        f.setSize(700, 500);
        f.setLocation(450, 200);

    } //constructor ends here

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {
            f.setVisible(false);
            new Add_Employee();
        }

        if (ae.getSource() == b2) {
            f.setVisible(false);
            boolean b=true;
            new View_Employee(b);
            System.out.println(b);
        }

        if (ae.getSource() == b3) {
            f.setVisible(false);
            new Remove_Employee();
        }

        if (ae.getSource() == b4) {
            f.setVisible(false);
           
          new View_Employee();
            
        }

    }

}
