import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics; 

public class applet extends Applet
{
 public void init()
 {
	setBackground (Color.yellow); 
	setForeground (Color.black); 
 }
	public void paint( Graphics g) 
  {
	g.drawString( " Hello! I am Abbasali Agharia and It's my First Applet Program ", 10, 100);
  }
}
