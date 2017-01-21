import java.util.Scanner;


public class Std {

	public static void main(String[] args) {
		
		String name,ph,rol,r;
		Scanner sc=new Scanner(System.in);
		Store so=new Store();
		System.out.println("enter student name");
		name=sc.next();
		so.setnm(name);
		System.out.println("enter studebnt ph");
		ph=sc.next();
		so.setph(ph);
		System.out.println("enter studebnt roll");
		rol=sc.next();
		so.setrol(rol);
		
		System.out.println("press D to display");
		r=sc.next();
		if(r.equals("D"))
		{
			Display dis=new Display();
			dis.show(so);
		}
		
	}

}
