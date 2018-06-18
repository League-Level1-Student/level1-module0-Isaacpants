/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BodyPartQuiz {

	// 0. You can use the celebrity photos we have placed in the default java package,  
	// or if you prefer, get celebrity photos from the Internet, place them in the default
	// package, and change the names below.
	
	String fi = "src/arnold.jpeg";
	String si = "src/leonardo.jpeg";
	String ti = "src/morgan.jpeg";
	String foi = "src/jack.jpeg";
	
	JFrame jf = new JFrame();
	JPanel jp = new JPanel();


	private void startQuiz() {

		// 1. Make an int variable to hold the score.
int score = 0;
		// 2. Set the size of the window in the initializeGui() method below
jf.setSize(500, 500);
		for (int i = 0; i < 4; i++) {
			
			// 4. Ask the user who this person is and store their answer
			String g = JOptionPane.showInputDialog("who is this?");
			
			// 5. Check their answer. If they guessed correctly:
			// -- Tell them they are right and increase the score by 1
if(g.equals("arnold")&&i==0) {
	score++;
	JOptionPane.showMessageDialog(null, score);
}else if(g.equals("leonardo")&&i==1) {
	score++;
	JOptionPane.showMessageDialog(null, score);
	JOptionPane.showMessageDialog(null, score);
}else if(g.equals("morgan")&&i==2) {
	score++;
	JOptionPane.showMessageDialog(null, score);
	JOptionPane.showMessageDialog(null, score);
}else if(g.equals("jack")&&i==3) {
	score++;
	JOptionPane.showMessageDialog(null, score);
}
			// 6. Otherwise:
			// -- Tell them they are wrong and who the person is

			// 7. Use the showNextImage() method below to get the next image
			showNextImage();
		    // 8. Show them their current score
			
			// 9. .... repeat for all your images.....


		}

	}

	public void showNextImage() {
		jp.removeAll();
		jp.add(getNextImage());		
		jf.setVisible(true);
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.add(jp);
		
		// 3. Change the size of the window so that you can only see part of the image.		
		jf.setSize(500,500);
		
		showNextImage();
		
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel label = new JLabel(icon);
		return label;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(fi);
		imageList.add(imageLabel);
		imageLabel = loadImage(si);
		imageList.add(imageLabel);
		imageLabel = loadImage(ti);
		imageList.add(imageLabel);
		imageLabel = loadImage(foi);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		System.exit(0);
		return new JLabel();
	}
}
