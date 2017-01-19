package d2;

import javax.swing.JFrame;

public class Rhino {

	public static void main(String[] args) {
		
	//	JFrame f=new JFrame();
	//	f.setVisible(true);
		
		// TODO Auto-generated method stub
	//	Y a=new Y();
	//	a.display();
	//	a.show();
		Z z=new Z();
		z.display();
		Y y=new Y();
		y.show();
		y.display();
		
		
	}
	

}
class K
{
	public void display(){
		System.out.println("Inherited");
		
		
}
}

class J extends K
{
	public void show()
	{
		System.out.println("main");
	}
}

	
