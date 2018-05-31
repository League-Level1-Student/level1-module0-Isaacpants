package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public static void main(String[] args) {
		FortuneCookie fc = new FortuneCookie();
		fc.showButton();	
		
	}
	
	public void showButton() {
	     System.out.println("Button clicked");
	     JFrame jf= new JFrame();
	     jf.setVisible(true);
	     JButton jb=new JButton();
	     jf.add(jb);
	     
	     jb.addActionListener(this);
	     jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     jf.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "WOOHOO");
		int r = new Random().nextInt(5);

if(r==0) {
	
	JOptionPane.showMessageDialog(null, "U r going to die");
}if(r==1) {
	JOptionPane.showMessageDialog(null, "u R going to die");
}if(r==2) {
	JOptionPane.showMessageDialog(null, "u r GOING to die");
}if(r==3) {
	JOptionPane.showMessageDialog(null, "u r going TO die");
}if(r==4) {
	JOptionPane.showMessageDialog(null, "u r going to DIE");
}
	}
}
