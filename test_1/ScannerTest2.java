
import java.util.Scanner;
import javax.swing.JOptionPane;

class  ScannerTest2
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		long sid = scanner.nextLong();
		String output  = "Your information is \n" + name + "\n" + sid + "\n";
		JOptionPane.showMessageDialog(null,output);
		//System.out.println("Hello World!");
	}
}
