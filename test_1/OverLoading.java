class  Tree
{
	int height;
	Tree(){
			System.out.println("Planting a seedling...\n");
			height = 0;
	}

	Tree (int i){
			System.out.println("I will plant a " + i +" feets tall a tree...");
			height = i;
	}

	void info(){
			System.out.println("the tree is " + height +" feets tall ...");
	}


	void info(String s){
			System.out.println(s + ": the tree is " + height +" feets tall ...");
	}
}



public class OverLoading  
{
	public static void main(String[] args) 
	{
		new Tree();
		for(int i = 0;i < 5; i ++){
			Tree t = new Tree(i);
			t.info();
			t.info("Overloading mothed ");
			System.out.println("\n");
		}
			
	}
}
