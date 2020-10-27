package assignment_4_brasenham;



import javax.swing.JPanel;

import java.awt.*;
public class Brasenham extends JPanel{
	
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	Brasenham(int x1, int y1, int x2, int y2){
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	public void paint(Graphics g){
		int x,y,k;
		double dx,dy,p;
		
		dx=Math.abs(x2-x1);
		dy=Math.abs(y2-y1);
		x=x1;
		y=y1;
		p=2*dy-dx;
		
		for(k=0;k<dx;k++){
			if(p<0){
				g.fillOval(x++,y,5,5);
				p=p+(2*dy);
			}
			else
			{
				g.fillOval(x++,y++,5,5);
				p=p+(2*(dy-dx));
			}
		}
	}
}