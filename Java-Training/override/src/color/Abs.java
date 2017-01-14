package color;

public abstract class Abs {
	abstract void eat();

}

class testAnnomymousInner{
	public static void main(String args[]){
		Abs s=new Abs(){
			void eat(){System.out.println("nice fruits");}
		};
	}
}
