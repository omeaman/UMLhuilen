package MainPackage;


import java.awt.*;  
import javax.swing.*;  
  
public class Speelveld{  
static JFrame f;  
Speelveld(){  
    f=new JFrame();
    f.setSize(300, 400);
    f.setVisible(true);
    f.repaint();
    

}
public static void main(String[] args) {  
    new Speelveld();
    Muur muurtje = new Muur();
    muurtje.Teken(f);
}
}  
