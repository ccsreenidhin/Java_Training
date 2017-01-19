package d2;

public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X x= new X();
		x.show();
		x.displa();
		x.display();

	}
}
	
	interface I
	{
		public void displa();	
		public void displa1();
	}

	class O
	{
		public void display(){
			System.out.println("Inherited");
			
		}		
	}
	
	
	
	class X extends O implements I
	{
		public void show()
		{
			System.out.println("hai");
		}

		@Override
		public void displa() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void displa1() {
			// TODO Auto-generated method stub
			
		}
		
		
		
	}


