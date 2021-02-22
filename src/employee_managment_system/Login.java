package employee_managment_system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class Login implements ActionListener {

    JFrame f;
    JLabel l1, l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1, b2;

    Login() {

        f = new JFrame("Login"); ///creatinga new login frame

        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close application when frame closed 

        l1 = new JLabel("Username"); //username label
        l1.setBounds(40, 20, 100, 30);
        f.add(l1);

        l2 = new JLabel("Password"); //password label
        l2.setBounds(40, 70, 100, 30);
        f.add(l2);

        t1 = new JTextField(); //username textfield
        t1.setBounds(150, 20, 150, 30);
        f.add(t1);

        t2 = new JPasswordField(); //password field
        t2.setBounds(150, 70, 150, 30);
        f.add(t2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("employee_managment_system/icons/login.jpg"));
        Image i2 = i1.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(350, 20, 150, 150);
        f.add(l3);

        b1 = new JButton("Login"); //login button
        b1.setBounds(40, 140, 120, 30);
        b1.setFont(new Font("serif", Font.BOLD, 15));
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.white);
        f.add(b1);

        b2 = new JButton("Cancel"); //cancel button
        b2.setBounds(180, 140, 120, 30);
        b2.setFont(new Font("serif", Font.BOLD, 15));
        b2.addActionListener(this);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        f.add(b2);

        f.getContentPane().setBackground(Color.white); //seeting frame background color

        f.setSize(600, 300);
        f.setVisible(true);
        f.setLocation(400, 300);

    } // constructor ends here

    @Override
    public void actionPerformed(ActionEvent ae) { //action perform method which will override
        if (ae.getSource() == b1) { //here, if the object is button b1 then execute 

            try {
                Conn c1 = new Conn(); // creatinga object of connection class
                String u = t1.getText(); // getting data of username field
                String p = t2.getText(); // getting data of password field

                String q = "select * from login where username='" + u + "' and password='" + p + "' ";  //storing the login query

                ResultSet rs = c1.s.executeQuery(q); // storing the query result through default ResultSet class via rs ref variable and c1 is connection class object ref, s is the connection class statement which helps to execute the query and using default executeQuery() method by passing the query q itself

                if (rs.next()) { //result set cannot match everything at once, so using next () method it will matching data 1 by 1
                new Details().f.setVisible(true); // if query matches then creating dDetails class and making it visible
                    System.out.println("Success");
                    f.setVisible(false); //making the current frame invisible

                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Login, Please try again");
                    t1.setText("");
                    t2.setText("");
//                    f.setVisible(false);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == b2) {
            f.setVisible(false);
            new Front_page();

        }

    }

//     public static void main(String[] args){
//    Login l= new Login();
//    }
}
