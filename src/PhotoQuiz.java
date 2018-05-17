/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will make sure the program exits when you
																	// close the window

		// 1. find an image on the internet, and put its URL in a String variable (from
		// your browser, right click on the image, and select “Copy Image Address”)
		String im = "http://images.wisegeek.com/duckling-in-water.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component c;
		// 3. use the "createImage()" method below to initialize your Component
		c = createImage(im);
		// 4. add the image to the quiz window
		quizWindow.add(c);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String q = JOptionPane.showInputDialog("what is the volume of the water");
		// 7. print "CORRECT" if the user gave the right answer
		if (q.equals("q")) {

			JOptionPane.showMessageDialog(null, "yes");
		} else {

			JOptionPane.showMessageDialog(null, "NOPE");

		}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of
		// this until step 12)
		quizWindow.remove(c);
		// 10. find another image and create it (might take more than one line of code)
		String ima = "https://i.imgur.com/qRWH5.jpg";

		Component co;

		co = createImage(ima);

		quizWindow.add(co);

		quizWindow.pack();

		// 12. pack the quiz window

		// 13. ask another question
		String a = JOptionPane.showInputDialog("How old is the duck");
		// 14+ check answer, say if correct or incorrect, etc.
		if (a.equals("a")) {

			JOptionPane.showMessageDialog(null, "correct");

		} else {

			JOptionPane.showMessageDialog(null, "FALSE          -Dwight Schrute");

		}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
