import java.util.Scanner;

public class TestScanner 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("input your name:");
		String name=scanner.next();

		System.out.println("input your age:");
		int age=scanner.nextInt();

		System.out.println("your name is " + name + " , your age is " + age);
	}
}
