package employee_managment_system;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
//import java.io.*;
import javax.swing.*;

public class Add_Employee implements ActionListener {

    JFrame f;
    JLabel id1, id2, id3, id4, id5, id6, id7, id8, id9, id10, id11, id12, id14, id15, id16, id17;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12;
    JButton b, b1, b2, b3;
    int i; //determining method
    String name, fathers_name, age, date_of_birth, address, phone, email, education, job_position, national_id, employee_id, salary;
    
    //Add employee
    Add_Employee() {

        i = 1; // determining add employee method    
        f = new JFrame("Add Employee");
        f.setLayout(null);

        //empty label to store all label
        id15 = new JLabel();
        id15.setBounds(0, 0, 900, 700);
        id15.setLayout(null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("employee_managment_system/icons/add_employee.jpg"));
        id15.setIcon(img);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //string label
        id14 = new JLabel("New Employee Details");
        id14.setBounds(320, 30, 500, 50);
        id14.setFont(new Font("serif", Font.BOLD, 25));
        id14.setForeground(Color.black);
        id15.add(id14);
        f.add(id15);

        //name
        id1 = new JLabel("Name");
        id1.setBounds(50, 150, 100, 30);
        id1.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(id1);

        //name textField
        t1 = new JTextField();
        t1.setBounds(200, 150, 150, 30);
        id15.add(t1);

        //fathers Name
        id2 = new JLabel("Father's Name");
        id2.setBounds(400, 150, 200, 30);
        id2.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(id2);

        //fathers name textField
        t2 = new JTextField();
        t2.setBounds(600, 150, 150, 30);
        id15.add(t2);

        //Age
        id3 = new JLabel("Age");
        id3.setBounds(50, 200, 100, 30);
        id3.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(id3);

        //Age textField
        t3 = new JTextField();
        t3.setBounds(200, 200, 150, 30);
        id15.add(t3);

        //date of birth
        id4 = new JLabel("Date of Birth");
        id4.setBounds(400, 200, 200, 30);
        id4.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(id4);

        //date of birth textField
        t4 = new JTextField();
        t4.setBounds(600, 200, 150, 30);
        t4.setText("y-m-d");
        id15.add(t4);

        //Address
        id5 = new JLabel("Address");
        id5.setBounds(50, 250, 100, 30);
        id5.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(id5);

        //address textField
        t5 = new JTextField();
        t5.setBounds(200, 250, 150, 30);
        id15.add(t5);

        //phone
        id6 = new JLabel("Phone No");
        id6.setBounds(400, 250, 100, 30);
        id6.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(id6);

        //phone textField
        t6 = new JTextField();
        t6.setBounds(600, 250, 150, 30);
        id15.add(t6);

        //email
        id7 = new JLabel("Email Id");
        id7.setBounds(50, 300, 100, 30);
        id7.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(id7);

        //email textfield
        t7 = new JTextField();
        t7.setBounds(200, 300, 150, 30);
        id15.add(t7);

        //education
        id8 = new JLabel("Education");
        id8.setBounds(400, 300, 100, 30);
        id8.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(id8);

        //education textfiled
        t8 = new JTextField();
        t8.setBounds(600, 300, 150, 30);
        id15.add(t8);

        //job position
        id9 = new JLabel("Job Position");
        id9.setBounds(50, 350, 150, 30);
        id9.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(id9);

        //job position textfield
        t9 = new JTextField();
        t9.setBounds(200, 350, 150, 30);
        id15.add(t9);

        //National id
        id10 = new JLabel("National ID");
        id10.setBounds(400, 350, 100, 30);
        id10.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(id10);

        //national id textfield
        t10 = new JTextField();
        t10.setBounds(600, 350, 150, 30);
        id15.add(t10);

        //employee id
        id11 = new JLabel("Employee Id");
        id11.setBounds(50, 400, 150, 30);
        id11.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(id11);

        //employee id textfield
        t11 = new JTextField();
        t11.setBounds(200, 400, 150, 30);
        id15.add(t11);

        //salary
        id12 = new JLabel("Salary");
        id12.setBounds(400, 400, 100, 30);
        id12.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(id12);

        //salary textfield
        t12 = new JTextField();
        t12.setBounds(600, 400, 150, 30);
        id15.add(t12);

        b = new JButton("Submit");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.white);
        b.setBounds(250, 550, 150, 40);

        id15.add(b);

        b1 = new JButton("Cancel");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.white);
        b1.setBounds(450, 550, 150, 40);

        id15.add(b1);

        b.addActionListener(this); //adding actionlistener into submit button
        b1.addActionListener(this);//adding actionlistener into cancel button

        f.setVisible(true);
        f.setSize(900, 700);
        f.setLocation(300, 50);

    }//constructor ends here

    //constructor overloading Update_employee
    Add_Employee(String s) {
        i = 2; //determining Update_Employee method

        try {

            Conn c = new Conn();
            String q = "select * from employee where employee_id='" + s + "'";
            ResultSet rs = c.s.executeQuery(q);

            while (rs.next()) {

                // getting employee data from database
                 name = rs.getString("name"); //getstring method used to get data from db and the parameter is the database column name
                 fathers_name = rs.getString("fathers_name");
                 age = rs.getString("age");
                 date_of_birth = rs.getString("date_of_birth");
                 address = rs.getString("address");
                 phone = rs.getString("phone");
                 email = rs.getString("email");
                 education = rs.getString("education");
                 job_position = rs.getString("job_position");
                 national_id = rs.getString("national_id");
                 employee_id = rs.getString("employee_id");
                 salary = rs.getString("salary");
            }

        } catch (Exception e) {
            e.printStackTrace();

        }

        //frame design
        f = new JFrame("Update Employee");
        f.setLayout(null);

        //empty label to store all label
        id15 = new JLabel();
        id15.setBounds(0, 0, 900, 700);
        id15.setLayout(null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("employee_managment_system/icons/add_employee.jpg"));
        id15.setIcon(img);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //string label
        id14 = new JLabel("Update Employee Details");
        id14.setBounds(320, 30, 500, 50);
        id14.setFont(new Font("serif", Font.BOLD, 25));
        id14.setForeground(Color.black);
        id15.add(id14);
        f.add(id15);

        //name
        id1 = new JLabel("Name");
        id1.setBounds(50, 150, 100, 30);
        id1.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(id1);

        //name textField
        t1 = new JTextField();
        t1.setBounds(200, 150, 150, 30);
        t1.setText(name);
        id15.add(t1);

        //fathers Name
        id2 = new JLabel("Father's Name");
        id2.setBounds(400, 150, 200, 30);
        id2.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(id2);

        //fathers name textField
        t2 = new JTextField();
        t2.setBounds(600, 150, 150, 30);
        t2.setText(fathers_name);
        id15.add(t2);

        //Age
        id3 = new JLabel("Age");
        id3.setBounds(50, 200, 100, 30);
        id3.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(id3);

        //Age textField
        t3 = new JTextField();
        t3.setBounds(200, 200, 150, 30);
        t3.setText(age);
        id15.add(t3);

        //date of birth
        id4 = new JLabel("Date of Birth");
        id4.setBounds(400, 200, 200, 30);
        id4.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(id4);

        //date of birth textField
        t4 = new JTextField();
        t4.setBounds(600, 200, 150, 30);
        t4.setText(date_of_birth);
        id15.add(t4);

        //Address
        id5 = new JLabel("Address");
        id5.setBounds(50, 250, 100, 30);
        id5.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(id5);

        //address textField
        t5 = new JTextField();
        t5.setBounds(200, 250, 150, 30);
        t5.setText(address);
        id15.add(t5);

        //phone
        id6 = new JLabel("Phone No");
        id6.setBounds(400, 250, 100, 30);
        id6.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(id6);

        //phone textField
        t6 = new JTextField();
        t6.setBounds(600, 250, 150, 30);
        t6.setText(phone);
        id15.add(t6);

        //email
        id7 = new JLabel("Email Id");
        id7.setBounds(50, 300, 100, 30);
        id7.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(id7);

        //email textfield
        t7 = new JTextField();
        t7.setBounds(200, 300, 150, 30);
        t7.setText(email);
        id15.add(t7);

        //education
        id8 = new JLabel("Education");
        id8.setBounds(400, 300, 100, 30);
        id8.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(id8);

        //education textfiled
        t8 = new JTextField();
        t8.setBounds(600, 300, 150, 30);
        t8.setText(education);
        id15.add(t8);

        //job position
        id9 = new JLabel("Job Position");
        id9.setBounds(50, 350, 150, 30);
        id9.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(id9);

        //job position textfield
        t9 = new JTextField();
        t9.setBounds(200, 350, 150, 30);
        t9.setText(job_position);
        id15.add(t9);

        //National id
        id10 = new JLabel("National ID");
        id10.setBounds(400, 350, 100, 30);
        id10.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(id10);

        //national id textfield
        t10 = new JTextField();
        t10.setBounds(600, 350, 150, 30);
        t10.setText(national_id);
        id15.add(t10);

        //employee id
        id11 = new JLabel("Employee Id");
        id11.setBounds(50, 400, 150, 30);
        id11.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(id11);

        //employee id textfield
        t11 = new JTextField();
        t11.setBounds(200, 400, 150, 30);
        t11.setText(employee_id);
        id15.add(t11);

        //salary
        id12 = new JLabel("Salary");
        id12.setBounds(400, 400, 100, 30);
        id12.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(id12);

        //salary textfield
        t12 = new JTextField();
        t12.setBounds(600, 400, 150, 30);
        t12.setText(salary);
        id15.add(t12);

        b2 = new JButton("Submit");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.white);
        b2.setBounds(250, 550, 150, 40);

        id15.add(b2);

        b3 = new JButton("Cancel");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.white);
        b3.setBounds(450, 550, 150, 40);

        id15.add(b3);

        b2.addActionListener(this); //adding actionlistener into submit button
        b3.addActionListener(this);//adding actionlistener into cancel button

        f.setVisible(true);
        f.setSize(900, 700);
        f.setLocation(300, 50);

    }//constructor ends here

    @Override
    public void actionPerformed(ActionEvent ae) {

        String name = t1.getText();
        String fathers_name = t2.getText();
        String age = t3.getText();
        String date_of_birth = t4.getText();
        String address = t5.getText();
        String phone = t6.getText();
        String email = t7.getText();
        String education = t8.getText();
        String job_position = t9.getText();
        String national_id = t10.getText();
        String employee_id = t11.getText();
        String salary = t12.getText();

        if (ae.getSource() == b && i == 1) {

            try {
                Conn cc = new Conn();
                String q = "insert into employee values('"+name+"','" + fathers_name + "','" + age + "','" + date_of_birth + "','" + address + "','" + phone + "','" + email + "','" + education + "','" + job_position + "','" + national_id + "','" + employee_id + "','" + salary + "')";
                cc.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "details Successfully Inserted");
                f.setVisible(false);
                new Details();

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == b1 && i == 1) {

            f.setVisible(false);
            new Details();
        } else if (ae.getSource() == b2 && i == 2) {

            try {
                Conn c = new Conn();
                String q = "update employee set name='"+name+"',fathers_name='"+fathers_name+"',age='"+age+"',date_of_birth='"+date_of_birth+"',address='"+address+"',phone='"+phone+"',email='"+email+"',education='"+education+"',job_position='"+job_position+"',national_id='"+national_id+"',employee_id='"+employee_id+"',salary='"+salary+"'";
                c.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"successfully updated");
                f.setVisible(false);
                new View_Employee();
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == b3 && i == 2){
            f.setVisible(false);
           new Details();
        }

    }
}
