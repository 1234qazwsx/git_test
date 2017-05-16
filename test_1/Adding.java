import javax.swing.*;
class Adding 
{
	public static void main(String[] args) 
		{
		JOptionPane.showMessageDialog(null," You will enter a adding test !" );
		int i;
		for(i=0 ; i != 1 && i != 2 ; )
			{
				int num1 = (int) System.currentTimeMillis() % 10 ;  
				int num2 = (int) System.currentTimeMillis() * 7 % 10 ;// use GET millis get random number
				String ques = JOptionPane.showInputDialog(" What is the result of \n" +
					num1 + " + " + num2 );
				int answer = Integer.parseInt (ques);
				JOptionPane.showMessageDialog(null,num1 + "+" + num2 + " =  " + answer + 
					"  is  " + (num1 + num2 == answer)) ;
				i = JOptionPane.showConfirmDialog(null ," Continue ");  // confirm ,ok -0 ,no -1, cancel -2
		}
	}
}
