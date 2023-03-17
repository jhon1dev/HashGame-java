package app;

import java.awt.Color;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;



public class Frame extends JFrame {

	private static final long serialVersionUID = 1L;

	
	public Frame() {
		setUndecorated(true);
		add(new Panel());
		this.setTitle("HashGame");	
		this.setSize(500, 200);
		getContentPane().setBackground(Color.green);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		try {
			URL imgUrl = new URL("https://cdn-icons-png.flaticon.com/512/3443/3443191.png");
			this.setIconImage(new ImageIcon(imgUrl).getImage());
		}catch(MalformedURLException e){
			e.printStackTrace();
		}
	}
	
	
}
