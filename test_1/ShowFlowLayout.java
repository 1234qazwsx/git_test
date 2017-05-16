package test_1;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ShowFlowLayout extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ShowFlowLayout(){
		Container con = getContentPane() ;
		con.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
		
		for (int i = 1;i <= 10; i++){
			con.add(new JButton ("Component"+ i));	
		}	
	}

	public static void main(String args []){
		ShowFlowLayout myfram = new ShowFlowLayout();
		myfram.setTitle("ShowLayout 061");
		myfram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myfram.setSize(500, 200);
		myfram.setVisible(true);	
	}
}
