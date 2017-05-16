package test_1;

import javax.swing.*;

public class MyframWithComponnet {
	public static void main(String args [])
	{
		JFrame myfram = new JFrame("Frame with componnet");
		java.awt.Container container = myfram.getContentPane();
		JButton jbto = new JButton("Ok");
		container.add(jbto);
		
		myfram.setTitle("Lv-061");
		myfram.setSize(400,300);
		myfram.setVisible(true);
		myfram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
