import java.util.Scanner;


public class EC extends Off {

	
	@Override
	void time() {
		System.out.println("exam time 2 O' clock");
		
	}

	@Override
	void det() {
		String n,u;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		n=sc.next();
		System.out.println("enter U.no");
		u=sc.next();
		if((n.equals("jij"))&&(u.equals("123")))
		System.out.println("welcome");	
		
	}
	
	
}
