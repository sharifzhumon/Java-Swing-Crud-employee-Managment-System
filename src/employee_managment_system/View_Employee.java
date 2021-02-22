package employee_managment_system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class View_Employee implements ActionListener{
    
    boolean s;
    JFrame f;
    JTextField t;
    JLabel l1,l2;
    JButton b,b2,b1;
    
    //constructuion for print employee data
    View_Employee(boolean s){
        this.s=s;
        
        
        f=new JFrame("View");
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        //empty label to store all label
        l1=new JLabel();
        l1.setBounds(0,0,500,270);
        l1.setLayout(null);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("employee_managment_system/icons/view.jpg"));
        l1.setIcon(img);

        //string label
        l2=new JLabel("Employee Id");
        l2.setVisible(true);
        l2.setBounds(40,60,250,30);
        l2.setForeground(Color.white);
        Font F1 = new Font("serif",Font.BOLD,30);
        l2.setFont(F1); 
        l1.add(l2);
        f.add(l1);


        t=new JTextField();
        t.setBounds(240,60,220,30);
        l1.add(t);

        b=new JButton("Search");
        b.setBounds(240,150,100,30);
        b.addActionListener(this);
        l1.add(b);

        b2=new JButton("Cancel");
        b2.setBounds(360,150,100,30);
        b2.addActionListener(this);
        l1.add(b2);

        f.setSize(500,270);
        f.setLocation(450,250);
        f.setVisible(true);
    } // constructor ends here
    
    //constructor overloading for updating employee details
    View_Employee(){
        
        
        
        f=new JFrame("Update");
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        //empty label to store all label
        l1=new JLabel();
        l1.setBounds(0,0,500,270);
        l1.setLayout(null);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("employee_managment_system/icons/view.jpg"));
        l1.setIcon(img);

        //string label
        l2=new JLabel("Employee Id");
        l2.setVisible(true);
        l2.setBounds(40,60,250,30);
        l2.setForeground(Color.white);
        Font F1 = new Font("serif",Font.BOLD,30);
        l2.setFont(F1); 
        l1.add(l2);
        f.add(l1);


        t=new JTextField();
        t.setBounds(240,60,220,30);
        l1.add(t);

        b1=new JButton("Search");
        b1.setBounds(240,150,100,30);
        b1.addActionListener(this);
        l1.add(b1);

        b2=new JButton("Cancel");
        b2.setBounds(360,150,100,30);
        b2.addActionListener(this);
        l1.add(b2);

        f.setSize(500,270);
        f.setLocation(450,250);
        f.setVisible(true);
    } // constructor ends here
    
    @Override
        public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b2){
            f.setVisible(false);
            Details d=new Details();
        }
        if((ae.getSource() == b) && (s=true)){
            f.setVisible(false);
            System.out.println("print "+s);
            new Print_Data(t.getText());
        } 
        if(ae.getSource() == b1){
            f.setVisible(false);
            
            new Add_Employee(t.getText());
            
        } 

    }
    
}
