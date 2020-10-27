package assignment_4_brasenham;

import javax.swing.SwingUtilities;

public class MyClass {

	public static void main(String args[]){
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Gui gui = new Gui();
			}
		});
	}
}
