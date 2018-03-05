package MainPackage;


import java.util.*;
import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.*;

public class Speelveld {
	List<? extends Tegel> tegelList;
	public void controleerSpeelveld(int playSize)
	{
		try {
			if(playSize >= 12)
			{
				tekenMuur(playSize);
			}else
			{
				throw new Exception("Te klein");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void teken(int playSize)
	{


	}
	public void tekenMuur(int playSize)
	{
		int muurSize = playSize;
		tegelList.add(Muur);
	}
	private void createWalls()
	{
		
	}
}
