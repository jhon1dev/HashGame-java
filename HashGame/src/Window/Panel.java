package Window;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Panel extends JPanel{
	
	public Panel() {
		this.setBorder(BorderFactory.createMatteBorder(2,3,2,3,Color.WHITE));
		this.setBackground(Color.ORANGE);
	}

}
