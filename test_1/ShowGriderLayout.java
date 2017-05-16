package test_1;

import java.awt.GridLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JButton;

public class ShowGriderLayout extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ShowGriderLayout(){
		Container con = getContentPane()  ;
		con.setLayout(new GridLayout(4,3,10,10));
		
		for (int i = 1;i <= 10; i++){
			con.add(new JButton ("Component"+ i));	
		}	
	}

	public static void main(String args []){
		ShowGriderLayout myfram = new ShowGriderLayout();
		myfram.setTitle("ShowLayout 061");
		myfram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myfram.setSize(500, 200);
		myfram.setVisible(true);	
	}
}
