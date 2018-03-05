package MainPackage;
import java.awt.*;
import javax.swing.*;

public class Tegel extends JPanel{
	private int squareX = 50;
	private int squareY = 50;
	private int squareW = 20;
	private int squareH = 20;
	Coordinaat coor = new Coordinaat();
	public void Teken(short rij, short column)
	{
		coor.setColumn(column);
		coor.setRij(rij);
		
	}
    protected void Teken(Graphics g) {
        super.paintComponent(g); // do your superclass's painting routine first, and then paint on top of it.
        g.setColor(Color.RED);
        g.fillRect(squareX,squareY,squareW,squareH);
    }
}
