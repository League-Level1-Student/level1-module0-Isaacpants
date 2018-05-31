package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Cookie implements ActionListener{
	public static void main(String[] args) {

		

		Cookie c = new Cookie();

		c.createGui();

	}
	
	public void createGui() {
		
		JFrame jf = new JFrame();
		JButton jb = new JButton();
	jf.add(jb);
	jb.setText("CLICKE ME!!!!!!!!");
		jf.pack();
		jf.setVisible(true);
		jb.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("EAT ME!!!!!!");	
		
	}
}
