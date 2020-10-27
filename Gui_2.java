package assignment_4_brasenham;

import javax.swing.JFrame;

import assignment_3_dda.Dda;

public class Gui_2 {
	
	Brasenham b;
	JFrame jfrm;
	

	Gui_2(int x1,int y1,int x2,int y2){
		
		
		jfrm = new JFrame();
		jfrm.setSize(800,800);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b = new Brasenham(x1, y1, x2, y2);
		jfrm.add(b);
		
		jfrm.setVisible(true);
		
	}

}
