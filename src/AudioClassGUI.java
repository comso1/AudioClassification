import java.awt.Frame;

import javax.swing.JFrame;

public class AudioClassGUI extends JFrame {

	
	public AudioClassGUI() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Icon Demo: Please Select an Image");   
    
    setSize(1200, 800);
    setLocationRelativeTo(null); // this centers the frame on the screen

	}
	
	public static void main(String[] args) {
		
		AudioClassGUI app = new AudioClassGUI();
		app.setVisible(true);
	}
	
}
