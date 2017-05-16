import javax.swing.JOptionPane;

class  Cycl
{
	public static void main(String[] args) 
	{

		final double PI =3.14_15926;
		double r;
		double are;
		String R=JOptionPane.showInputDialog(null,"the cycle's R is \n"
			+"(you can only input intger or double)","The area of cycle",
			JOptionPane.QUESTION_MESSAGE);
		r= Double.parseDouble(R);
		are=r*r*PI;
		JOptionPane.showMessageDialog(null,are,"the cycle's area is",
			JOptionPane.INFORMATION_MESSAGE);
		//System.out.println("the area is " + are);
	}
}
