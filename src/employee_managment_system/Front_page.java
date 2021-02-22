package employee_managment_system;

import java.awt.*;//import awt(Abstract Window Toolkit) package all classes
import javax.swing.*; //import swing package all classes
import java.awt.event.*; // for events handling

class Front_page implements ActionListener {

    JFrame f; // create a reference variable of JFrame class
    JLabel id, l1;// create a reference variable of JLabel class
    JButton b;// create a reference variable of JButton class

    Front_page() { // creating a constructor to create the front page

        f = new JFrame("Employee Managment System");// creating a object of JFrame class
        

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("employee_managment_system/icons/front.jpg")); // creatinga imageicon class where image is being loaded for front page
        Image i2 = i1.getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT); // USING REFERENCE VARIABLE OF IMAGE CLASS, IMAGE OF I1 OBJECT BEING CAPTURED AND SCALLED FOR WINDOW SIZE //Image is awt class object
        ImageIcon i3 = new ImageIcon(i2); // creating anothe object of imageicon class whereb we send the scalled image of i2 object

        l1 = new JLabel(i3); // using JLable class, the image is being set on the frame ,Need JLabel to set something on the frame
        l1.setBounds(0, 100, 800, 300); //setting labeling size and positioning
        f.add(l1); // adding jlabel object int Jframe object

        b = new JButton("Click Here to Continue"); // creatinga button
        b.setBackground(Color.WHITE); // background color of the button
        b.setFont(new Font("serif", Font.PLAIN, 17));
        b.setForeground(Color.BLUE); // text color of the button //Color is awt class object

        b.setBounds(300, 405, 200, 50);
        b.addActionListener(this);

        id = new JLabel();// creatinga a object of JLable class which is initially empty
        id.setBounds(0, 0, 800, 500); // setting positioning and size of the label wher size is same as previous label l1 because we need to put button and other string infront of the image
        id.setLayout(null);

        JLabel lid = new JLabel("Employee Managment System"); // creating another label which consist string Employee Managment System
        lid.setBounds(150, 10, 800, 100); //positioning the label
        lid.setFont(new Font("serif", Font.PLAIN, 40)); // setting the font size,style and type
        lid.setForeground(Color.red); // text color set
        id.add(lid); // adding the label into empty label id so it will be infront of the imageicon

        id.add(b);// adding the button into empty label id so it will be infront of the imageicon
        f.add(id); //adding the id frame into the frame

        f.getContentPane().setBackground(Color.WHITE);// setting the background color of empty spaces in the frame
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true); //making the frame visible
        f.setSize(800, 500); //setting frame size
        f.setLocation(100, 10); //positioning of the frame open

//        while (true) { // making the string on and off continously
//            lid.setVisible(false); //initially string is invinsible
//            try {
//                Thread.sleep(500); // here string will be invisible for half second
//            } catch (Exception e) {
//            }
//            lid.setVisible(true); //making the string visible
//            try {
//                Thread.sleep(500); // here string will be visible for half second
//            } catch (Exception e) {
//            }
//        }

    }

    @Override
    public void actionPerformed(ActionEvent ae) { //makinga abstract class which will override when actionListener occours

        if (ae.getSource() == b) { //here, if the object is button b then execute
            f.setVisible(false); //when action performed current page will be invinsible
            Login l = new Login(); //create object of login class to call login page  
        }
    }

//    public static void main(String[] args){
//    Front_page f= new Front_page();
//    }   
}
