
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DuelingButtons implements ActionListener {

	public static void main(String[] args) {
		new DuelingButtons().createUI();
	}

	JButton lb = new JButton();
	JButton rb = new JButton();

	Dimension b = new Dimension(400, 400);
	Dimension s = new Dimension(200, 200);

	JFrame jf = new JFrame();
	JPanel jp = new JPanel();

	private void createUI() {
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 1. Add the panel to the frame
		jf.add(jp);
		// 2. Make the frame visible
		jf.setVisible(true);
		// 3. Set the text of the leftButton to "Click me!"
		lb.setText("CLICK ME");
		// 4. Set the text of the rightButton to "Click me!"
		rb.setText("CLICK ME");
		// 5. Add an action listener to the leftButton
		lb.addActionListener(this);
		// 6. Add an action listener to the rightButton
		rb.addActionListener(this);
		// 7. Add the leftButton to the panel
		jp.add(lb);
		// 8. Add the rightButton to the panel
		jp.add(rb);
		// 9. Pack the frame
		jf.pack();
		// 10. Set the title of the frame to "Demanding Buttons"
		jf.setTitle("Demanding Buttons");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();

		/* If the buttonPressed was the leftButton.... */
		
		if (buttonPressed == lb) {
			// Set the text of the rightButton to "No, click Me!"
			rb.setText("NO, CLICK ME");
			// Set the PREFERRED size of the leftButton to SMALL
			lb.setPreferredSize(s);
			// Set the PREFERRED size of the rightButton to BIG
			rb.setPreferredSize(b);
			// Set the text of the leftButton to "Click Me!"
			lb.setText("CLICK ME");
			
		
		
		
		} else {

			lb.setText("NO, CLICK ME");
			rb.setPreferredSize(s);
			lb.setPreferredSize(b);
			rb.setText("CLICK ME");
			
		}
		// Set the text of the rightButton to "No, click Me!"
		// Set the PREFERRED size of the rightButton to BIG
		// Set the text of the leftButton to "Click Me!"
		// Set the PREFERRED size of the leftButton to SMALL

		/* If the buttonPressed was the rightButton, do the opposite. */

		jf.pack();
	}
}
