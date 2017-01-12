import java.util.Scanner;


public class Collage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your branch");
		s=sc.next();
		EC ec=new EC();
		ME me=new ME();
		if(s.equals("EC"))
		{
			ec.det();
			ec.time();
		}
		else if(s.equals("ME"))
		{
			me.det();
			me.time();
		}
			
			
		
		
	}

}
