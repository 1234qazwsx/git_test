package test_1;

	import  java.awt.Color;
	import java.awt.BorderLayout;
	import java.awt.Container;

	import javax.swing.JFrame;
	import javax.swing.JButton;
	
	public class ShowBoderTest extends JFrame {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public ShowBoderTest(){
			Container con = getContentPane()  ;
			con.setLayout(new BorderLayout(5,10));
			
			Color color = new Color(128 , 100, 100);
			//con.add(new JButton ("Component East") , BorderLayout.EAST);
			JButton jb1 = new JButton ("Component East");
			//jb1.setBackground(new Color(100, 100 , 1));
			jb1.setBackground(color);
			con.add(jb1,BorderLayout.EAST);
			
			con.add(new JButton ("Component west") , BorderLayout.WEST);
			con.add(new JButton ("Component center") , BorderLayout.CENTER);
			con.add(new JButton ("Component north") , BorderLayout.NORTH);
			con.add(new JButton ("Component south") , BorderLayout.SOUTH);
			
		}

		public static void main(String args []){
			ShowBoderTest myfram = new ShowBoderTest();
			myfram.setTitle("ShowBorder test 061");
			myfram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			myfram.setSize(500, 300);
			myfram.setVisible(true);	
		}
	}
	
	// setLyout(aNewLayout)
	// validate()   
	// doLayout()   强迫重新摆放