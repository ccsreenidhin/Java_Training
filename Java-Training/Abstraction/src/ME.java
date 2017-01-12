import java.util.Scanner;


public class ME extends Off{
	
	
	

	@Override
	void det() {
		String n,u;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		n=sc.next();		
		System.out.println("enter U.no");
		u=sc.next();
		if((n.equals("jip"))&&(u.equals(125)))
			System.out.println("welcome");	
		
	}

	@Override
	void time() {
		System.out.println("1 O'clock");
		
	}

	
}
