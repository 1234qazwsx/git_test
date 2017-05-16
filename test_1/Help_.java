class Help_a 
{
	static int boy = 5;
	static int girl = 4;
	static String bears;
	protected static String ma_in() 
	{
		if((boy+girl)>10)
			bears = " Help us ,please бнбн";
		return bears;
	}
}



class	Help_  extends Help_a {
	public static void main (String [] args){
		Help_.boy = 40;
		Help_.girl = 5;
		String  alive = ma_in();
		System.out.println(alive+"\n");
	}

}
