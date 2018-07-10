import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


import javax.swing.JFrame;
import javax.swing.JPanel;

public class SensitiveKeyboard implements KeyListener {
	JFrame jf = new JFrame();
	JPanel jp = new JPanel();

	public static void main(String[] args) {

		new SensitiveKeyboard().makeGui();

	}

	void makeGui() {
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);

		jf.addKeyListener(this);

	}

	static void speak(String words) {

		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
speak("ouch");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
