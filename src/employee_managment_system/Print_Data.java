package employee_managment_system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class Print_Data implements ActionListener{

    JFrame f;
    JLabel i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27;
    JButton back;
    ImageIcon icon;
    String name, fathers_name, age, date_of_birth, address, phone, email, education, job_position, national_id, employee_id, salary;

    Print_Data(String i) {

        try {

            Conn c = new Conn();
            String q = "select * from employee where employee_id='"+i+"'";
            ResultSet rs = c.s.executeQuery(q);

            while (rs.next()) {
                
                // getting employee data from database
                name =rs.getString("name"); //getstring method used to get data from db and the parameter is the database column name
                fathers_name=rs.getString("fathers_name");
                age =rs.getString("age");
                date_of_birth=rs.getString("date_of_birth");
                address =rs.getString("address");
                phone=rs.getString("phone");
                email =rs.getString("email");
                education=rs.getString("education");
                job_position =rs.getString("job_position");
                national_id=rs.getString("national_id");
                employee_id =rs.getString("employee_id");
                salary=rs.getString("salary");
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
        f= new JFrame("Print Data");
        f.setVisible(true);
        f.setSize(600,750);
        f.setLocation(450, 0);
        f.getContentPane().setBackground(new Color(50,100,100));
        f.setLayout(null);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        i26=new JLabel();
        i26.setBounds(0,0,600,750);
        i26.setLayout(null);
//        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("employee_managment_system/icons/print.jpg"));
//        i26.setIcon(img);
        
        i25 = new JLabel("Employee Details");
        i25.setBounds(200,0,250,30);
        f.add(i25);
        i25.setFont(new Font("serif",Font.BOLD,25));
        i25.setForeground(Color.white);
        i26.add(i25);
        f.add(i26);
        
        //employee id field
        i1 = new JLabel("Employee ID:");
        i1.setBounds(20,50,120,30);
        i1.setFont(new Font("serif",Font.BOLD,20));
        i1.setForeground(Color.white);
        i26.add(i1);

        i13 = new JLabel(employee_id);
        i13.setBounds(200,50,200,30);
        i13.setFont(new Font("serif",Font.BOLD,20));
        i13.setForeground(Color.white);
        i26.add(i13);
        
        //employee name field
        i2 = new JLabel("Employee Name:");
        i2.setBounds(20,100,150,30);
        i2.setFont(new Font("serif",Font.BOLD,20));
        i2.setForeground(Color.white);
        i26.add(i2);

        i14 = new JLabel(name);
        i14.setBounds(200,100,300,30);
        i14.setFont(new Font("serif",Font.BOLD,20));
        i14.setForeground(Color.white);
        i26.add(i14);
        
        //employee father's name field
        i3 = new JLabel("Father's Name:");
        i3.setBounds(20,150,150,30);
        i3.setFont(new Font("serif",Font.BOLD,20));
        i3.setForeground(Color.white);
        i26.add(i3);

        i15 = new JLabel(fathers_name);
        i15.setBounds(200,150,300,30);
        i15.setFont(new Font("serif",Font.BOLD,20));
        i15.setForeground(Color.white);
        i26.add(i15);
        
         //employee Address field
        i4 = new JLabel("Address:");
        i4.setBounds(20,200,150,30);
        i4.setFont(new Font("serif",Font.BOLD,20));
        i4.setForeground(Color.white);
        i26.add(i4);

        i16 = new JLabel(address);
        i16.setBounds(200,200,400,30);
        i16.setFont(new Font("serif",Font.BOLD,20));
        i16.setForeground(Color.white);
        i26.add(i16);
        
          //employee mobile no field
        i5 = new JLabel("Mobile No:");
        i5.setBounds(20,250,150,30);
        i5.setFont(new Font("serif",Font.BOLD,20));
        i5.setForeground(Color.white);
        i26.add(i5);

        i17 = new JLabel(phone);
        i17.setBounds(200,250,300,30);
        i17.setFont(new Font("serif",Font.BOLD,20));
        i17.setForeground(Color.white);
        i26.add(i17);
        
          //employee  email field
        i6 = new JLabel("Email ID:");
        i6.setBounds(20,300,150,30);
        i6.setFont(new Font("serif",Font.BOLD,20));
        i6.setForeground(Color.white);
        i26.add(i6);

        i18 = new JLabel(email);
        i18.setBounds(200,300,300,30);
        i18.setFont(new Font("serif",Font.BOLD,20));
        i18.setForeground(Color.white);
        i26.add(i18);
        
          //employee  Date of birth field
        i7 = new JLabel("Date Of Birth:");
        i7.setBounds(20,350,250,30);
        i7.setFont(new Font("serif",Font.BOLD,20));
        i7.setForeground(Color.white);
        i26.add(i7);

        i19 = new JLabel(date_of_birth);
        i19.setBounds(200,350,200,30);
        i19.setFont(new Font("serif",Font.BOLD,20));
        i19.setForeground(Color.white);
        i26.add(i19);
        
         //employee  education field
        i8 = new JLabel("Education:");
        i8.setBounds(20,400,150,30);
        i8.setFont(new Font("serif",Font.BOLD,20));
        i8.setForeground(Color.white);
        i26.add(i8);

        i20 = new JLabel(education);
        i20.setBounds(200,400,300,30);
        i20.setFont(new Font("serif",Font.BOLD,20));
        i20.setForeground(Color.white);
        i26.add(i20);
        
        //employee  age field
        i9 = new JLabel("Age:");
        i9.setBounds(20,450,150,30);
        i9.setFont(new Font("serif",Font.BOLD,20));
        i9.setForeground(Color.white);
        i26.add(i9);

        i21 = new JLabel(age);
        i21.setBounds(200,450,300,30);
        i21.setFont(new Font("serif",Font.BOLD,20));
        i21.setForeground(Color.white);
        i26.add(i21);
        
         //employee  National ID field
        i10 = new JLabel("National ID:");
        i10.setBounds(20,500,150,30);
        i10.setFont(new Font("serif",Font.BOLD,20));
        i10.setForeground(Color.white);
        i26.add(i10);

        i22 = new JLabel(national_id);
        i22.setBounds(200,500,300,30);
        i22.setFont(new Font("serif",Font.BOLD,20));
        i22.setForeground(Color.white);
        i26.add(i22);
        
         //employee  Job position field
        i11 = new JLabel("Designation:");
        i11.setBounds(20,550,150,30);
        i11.setFont(new Font("serif",Font.BOLD,20));
        i11.setForeground(Color.white);
        i26.add(i11);

        i23 = new JLabel(job_position);
        i23.setBounds(200,550,300,30);
        i23.setFont(new Font("serif",Font.BOLD,20));
        i23.setForeground(Color.white);
        i26.add(i23);
        
         //employee  salary field
        i12 = new JLabel("Salary:");
        i12.setBounds(20,600,150,30);
        i12.setFont(new Font("serif",Font.BOLD,20));
        i12.setForeground(Color.white);
        i26.add(i12);

        i24 = new JLabel(salary);
        i24.setBounds(200,600,300,30);
        i24.setFont(new Font("serif",Font.BOLD,20));
        i24.setForeground(Color.white);
        i26.add(i24);
        
        back= new JButton("Back");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setVisible(true);
        back.setBounds(250,650,100,30);
        back.addActionListener(this);
        i26.add(back);
        

    } //constructor ends here
    
    @Override
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==back){
            f.setVisible(false);
            new View_Employee(true);
        
        }
    
    }

}
