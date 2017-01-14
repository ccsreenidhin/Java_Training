import java.util.Scanner;


public class Accel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter L for Login");
		s=sc.next();
		if(s.equals("l")){
			Login l=new Login();
			l.display();
		}
		else
			System.out.println("wrong input");

	}

}
