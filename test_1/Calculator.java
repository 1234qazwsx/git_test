import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;


public class Calculator extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Calculator()
	{
		Container c = getContentPane();				

		c.setLayout(new BorderLayout());
		
		//JPanel p1 = new JPanel();
		//c.setLayout(new GridLayout(4,4));
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(4,4));
		
		
		
		for(int i = 9; i > 0; i--)
		{
			p1.add(new JButton("  "+ i + "  "));
		}
		
		

		p1.add(new JButton("  /  "));
		p1.add(new JButton("  0  "));
		p1.add(new JButton("CLR"));
		p1.add(new JButton("  +  "));
		p1.add(new JButton("  -  "));
		p1.add(new JButton("  *  "));
		p1.add(new JButton("  =  "));
		
		
		
		//JPanel p2 = new JPanel(new BorderLayout());
		c.add(new JTextField(""), BorderLayout.NORTH);
		c.add(p1, BorderLayout.SOUTH);
		
	}
	
	public static void main(String[] args) 
	{
		
		Calculator cal = new Calculator();
		cal.setTitle("Calculater061");
		cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cal.setSize(400,400);
		cal.setVisible(true);
	}
}
