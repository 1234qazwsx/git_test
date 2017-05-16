public class Leaf 
{
	int i = 0;
	Leaf conm () {
		i ++;
		return this;
	}


	void print(){
		System.out.println( "I =" + i);

	}

	public static void main(String[] args) 
	{
		Leaf le = new Leaf();
		le.conm().conm().conm().print();
		//System.out.println("Hello World!");
	}
}
