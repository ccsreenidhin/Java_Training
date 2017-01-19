package d2;

import javax.swing.JFrame;

public class Multi{

	public static void main(String[] args) {
		
		Z z=new Z();
	//	z.display();
		Y y=new Y();
	//	y.show();
		y.display();
		D d=new D();
		d.display();
		d.disp();
		
		
	}
	

}
class Z
{
	public void display(){
		System.out.println("Inherited");
		
	}		
}


class Y extends Z
{
	public void show()
	{
		System.out.println("main");
	}
}

class D extends Z
{
	public void disp()
	{
		System.out.println("java");
	}
}
	
