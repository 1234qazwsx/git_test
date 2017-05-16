import javax.swing.JOptionPane;

class PersonInfor 
{
	public static void main(String[] args) 
	{
		JOptionPane.showMessageDialog(null,"Welcome to XIDIAN University *_* .....",
			"Persen Information",JOptionPane.INFORMATION_MESSAGE);
		String name=JOptionPane.showInputDialog("Input your name :");
		String sid=JOptionPane.showInputDialog("Input your student id :");
		//String sex=JOptionPane.showInputDialog("Input your sex :");
		String birthday=JOptionPane.showInputDialog("Input your birthday :");
		String perin= " name : " + name + "\n student id: " + sid + "\n birthday£º" + birthday +"\n......";
		JOptionPane.showMessageDialog(null,name +"Í¬Ñ§£¬Welcome to XIDIAN *_* .....\n"
			+ "your basic information is: \n\n"+ perin ,"Welcome ",JOptionPane.INFORMATION_MESSAGE);
		//System.out.println("Hello World!");
	}
}
