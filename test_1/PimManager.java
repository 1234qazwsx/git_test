package fifth;

import java.awt.*;
//import java.awt.event.*;

import javax.swing.*;

public class PimManager  extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public PimManager(){
		JFrame cul = new JFrame();
		JPanel year = new JPanel();
		JPanel week = new JPanel();
		JPanel date = new JPanel();
		JTextField display1 = new JTextField();
		cul.setSize(100,500);
		cul.setTitle("PimManager_061");
		cul.setLayout(new BorderLayout());
		cul.add(year,BorderLayout.NORTH);
		cul.add(week,BorderLayout.CENTER);
		cul.add(date,BorderLayout.SOUTH);
		

	}
	
	
	
	public static void main(String args [])
	{
		PimManager pim = new PimManager();		
	}

	
	

}
