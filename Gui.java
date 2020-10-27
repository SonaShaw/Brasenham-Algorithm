package assignment_4_brasenham;





import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Gui {
	

	JFrame jfrm;
	private int x1;
	private int y1;
	private int x2;
	private int y2;

	Gui(){
		
		jfrm = new JFrame();
		jfrm.setSize(800,800);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.getContentPane().setBackground(Color.LIGHT_GRAY);
		
		
		JTextField ix1 = new JTextField("");
		JTextField iy1 = new JTextField("");
		JTextField ix2 = new JTextField("");
		JTextField iy2 = new JTextField("");
		
		final JButton jbtn = new JButton("click");
		
		JLabel jx1 = new JLabel("enter x1");
		JLabel jy1 = new JLabel("enter y1");
		JLabel jx2 = new JLabel("enter x2");
		JLabel jy2 = new JLabel("enter y2");
		
		//jx1.setBackground(Color.WHITE);
		
		ix1.setBounds(200, 200, 100, 50);
		jx1.setBounds(200,250,100,20);
		iy1.setBounds(500, 200, 100, 50);
		jy1.setBounds(500,250,100,20);
		ix2.setBounds(200, 300, 100, 50);
		jx2.setBounds(200, 350, 100, 20);
		iy2.setBounds(500, 300, 100, 50);
		jy2.setBounds(500, 350, 100, 20);
		jbtn.setBounds(350, 400, 100, 50);
		
		
		
		jfrm.add(jbtn);
		jfrm.add(ix1);
		jfrm.add(jx1);
		jfrm.add(iy1);
		jfrm.add(jy1);
		jfrm.add(ix2);
		jfrm.add(jx2);
		jfrm.add(jy2);
		jfrm.add(iy2);
		
		
		
		
		jbtn.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  x1 = Integer.parseInt(ix1.getText());
			  y1 = Integer.parseInt(iy1.getText());
			  x2 = Integer.parseInt(ix2.getText());
			  y2 = Integer.parseInt(iy2.getText());
			  Gui_2 gui_2 = new Gui_2(x1, y1, x2, y2);
			  
		  }
		});
		
		jfrm.setLayout(null);
		jfrm.setVisible(true);
		
	}
}
