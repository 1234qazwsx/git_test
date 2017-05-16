import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;


public class Calculator_1 extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Calculator_1()
	{
		Container c = getContentPane();				

		c.setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(4,4));
		
		for(int i = 9; i >= 0; i--)
		{
			p1.add(new JButton(" "+ i + " "));
		}
		
		p1.add(new JButton(" + "));
		p1.add(new JButton(" - "));
		p1.add(new JButton(" * "));
		p1.add(new JButton("CLR"));
		p1.add(new JButton(" = "));
		p1.add(new JButton(" / "));
		
		JPanel p2 = new JPanel(new BorderLayout());
		p2.add(new JTextField("       "), BorderLayout.NORTH);
		p2.add(p1, BorderLayout.CENTER);
		
	}
	
	public static void main(String[] args) 
	{
		
		Calculator_1 cal = new Calculator_1();
		cal.setTitle("Calculater_061");
		cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cal.setSize(400, 250);
		cal.setVisible(true);
	}
}
