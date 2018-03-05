package MainPackage;

import java.awt.*;
import javax.swing.*;

public class Tegel{
	public Color kleurtje;
	public void Teken(JFrame f)
	{

        JButton Tegel = new JButton();
        Tegel.setBackground(kleurtje);
        
		f.add(Tegel);
		f.repaint();
	}
}
