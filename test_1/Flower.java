public class  Flower
{
	int petalco = 0;
	String s = new String ("null");
	Flower(int petal){
		petalco = petal;
		System.out.println("Constructor w/ int args only ,petalcount= " + petalco);
	}

	Flower(String ss){
		System.out.println("Constructor w/ string args only ,s= " + ss);
		s = ss;
	}

	Flower(String ss , int petal){
		this(petal);
		//! this(s); // Can't call two!

		this.s = s;	
		System.out.println("string and int args " );
	}

	Flower(){
		this("hi",47);
		System.out.println("default constructor (no args)");
	}

	void print() {
		//! this(11); // Not inside non-constructor!

			System.out.println(
			"petalCount = " + petalco +" s = "+ s);
	}

	public static void main(String[] args) {
		Flower x = new Flower();
		x.print();
	}
}
