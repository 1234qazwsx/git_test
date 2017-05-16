
import javax.swing.JOptionPane;

class  LeapYear
{
	public static void main(String[] args) 
	{
		String nowYear = JOptionPane.showInputDialog("Please input a yaer,like 2017 \n");
		int year = Integer.parseInt(nowYear);
		boolean isleapyear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		JOptionPane.showMessageDialog(null, year + " is a leap year ?\n" + isleapyear );
		//System.out.println("Hello World!"); 
	}
}
