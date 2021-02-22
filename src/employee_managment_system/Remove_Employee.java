package employee_managment_system;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Remove_Employee implements ActionListener {

    JFrame f;
    JTextField t;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8;
    JButton b, b1, b2, b3;

    Remove_Employee() {
        f = new JFrame("Remove Employee");
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //empty label to store all other labels
        l5 = new JLabel();
        l5.setBounds(0, 0, 500, 500);
        l5.setLayout(null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("employee_managment_system//icons/remove.jpg"));
        l5.setIcon(img);
        f.add(l5);

        //employee id label
        l1 = new JLabel("Employee Id");
        l1.setBounds(50, 50, 250, 30);
        l1.setForeground(Color.white);
        Font f2 = new Font("serif", Font.BOLD, 25);
        l1.setFont(f2);
        l5.add(l1);

        t = new JTextField();
        t.setBounds(250, 50, 150, 30);
        l5.add(t);

        //search button
        b = new JButton("Search");
        b.setBounds(200, 100, 100, 30);
        b.addActionListener(this);
        l5.add(b);
        //back button
        b3 = new JButton("back");
        b3.setBounds(360, 100, 100, 30);
        b3.addActionListener(this);
        l5.add(b3);

        //Initially these labels will be invisible..after search these fields will be visible
        //name field show after search
        l2 = new JLabel("Name:");
        l2.setBounds(50, 150, 250, 30);
        l2.setForeground(Color.white);
        Font f3 = new Font("serif", Font.BOLD, 20);
        l2.setFont(f3);
        l5.add(l2);

        // database name data show
        l6 = new JLabel();
        l6.setBounds(200, 150, 350, 30);
        l6.setForeground(Color.white);
        Font F6 = new Font("serif", Font.BOLD, 20);
        l6.setFont(F6);
        l5.add(l6);

        //mobile field show
        l3 = new JLabel("Mobile No:");
        l3.setBounds(50, 200, 250, 30);
        l3.setForeground(Color.white);
        Font f4 = new Font("serif", Font.BOLD, 20);
        l3.setFont(f4);
        l5.add(l3);

        //db rsult show of mobile no.
        l7 = new JLabel();
        l7.setBounds(200, 200, 350, 30);
        l7.setForeground(Color.white);
        Font F7 = new Font("serif", Font.BOLD, 20);
        l7.setFont(F7);
        l5.add(l7);

        // email show
        l4 = new JLabel("Email Id:");
        l4.setBounds(50, 250, 250, 30);
        l4.setForeground(Color.white);
        Font F5 = new Font("serif", Font.BOLD, 20);
        l4.setFont(F5);
        l5.add(l4);

        //db email data show
        l8 = new JLabel();
        l8.setBounds(200, 250, 350, 30);
        l8.setForeground(Color.white);
        Font f8 = new Font("serif", Font.BOLD, 20);
        l8.setFont(f8);
        l5.add(l8);

        //remove button to remove employee data
        b1 = new JButton("Remove");
        b1.setBounds(120, 300, 100, 30);
        b1.addActionListener(this);
        l5.add(b1);

        //cancwel button to close this operation
        b2 = new JButton("Cancel");
        b2.setBounds(300, 300, 100, 30);
        b2.addActionListener(this);
        l5.add(b2);

        //making all after search fields initially invisible
        l2.setVisible(false);
        l3.setVisible(false);
        l4.setVisible(false);
        b1.setVisible(false);
        b2.setVisible(false);

        //seaating frame 
        f.setSize(500, 500);
        f.setLocation(500, 250);
        f.setVisible(true);

    } // constructor ends here

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if (ae.getSource() == b) { //if search button pressed

            try {
                Conn c = new Conn(); //making db connection
                String q = "select name,phone,email from employee where employee_id='"+t.getText()+"'";
                ResultSet rs = c.s.executeQuery(q);

                int i = 0;

                if (rs.next()) { // if result found
                    String name = rs.getString("name");
                    String phone = rs.getString("phone");
                    String email = rs.getString("email");

                    l2.setVisible(true);
                    l3.setVisible(true);
                    l4.setVisible(true);
                    b1.setVisible(true);
                    b2.setVisible(true);
                    i = 1;

                    l6.setText(name);
                    l7.setText(phone);
                    l8.setText(email);

                }

                if (i == 0) { //if result not found
                    JOptionPane.showMessageDialog(null, "Id not found");

                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (ae.getSource() == b1) {

            try {
                Conn cn = new Conn();
                String qr = "delete from employee where employee_id='"+t.getText()+"'";
                cn.s.executeUpdate(qr); //executeupdate statement for delete and update
                JOptionPane.showMessageDialog(null, "Employee Data Deleted Successfully");
                l2.setVisible(false);
                l3.setVisible(false);
                l4.setVisible(false);
                l6.setVisible(false);
                l7.setVisible(false);
                l8.setVisible(false);
                b1.setVisible(false);
                b2.setVisible(false);

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Exception occured while deleting data");
            }
        }
        if (ae.getSource() == b2) {
                 f.setVisible(false);
                 new Details();
        }
        if (ae.getSource() == b3) {
            f.setVisible(false);
            new Details();
        }

    }
}
