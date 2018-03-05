package MainPackage;


import java.awt.*;  
import javax.swing.*;  
  
public class Speelveld{  
JFrame f;  
Speelveld(){  
    f=new JFrame();
    f.setSize(300, 400);
    f.setVisible(true);
    f.repaint();
    Canvas C1 = new Canvas();
    C1.setSize(50, 50);
    C1.setBackground(Color.BLACK);
    f.add(C1);
    Canvas C2 = new Canvas();
    C2.setLocation(50, 50);
    C2.setBackground(Color.blue);
    f.add(C2);

    f.setLayout(new GridLayout(3,3));  
    //setting grid layout of 3 rows and 3 columns  
  
    f.setSize(300,300);  
    f.setVisible(true);  
}  
public static void main(String[] args) {  
    new Speelveld();  
}
}  
