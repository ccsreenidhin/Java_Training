import java.util.Scanner;


public class Detail {

	public void data()
		{
			String s,s1,s2;
			@SuppressWarnings("resource")
			Scanner c=new Scanner(System.in);
			System.out.println("enter student name");
			s=c.next();
			System.out.println("enter roll no");
			s1=c.next();
			System.out.println("enter ph");
			s2=c.next();

			disp(s,s1,s2);
		}
	

	public void disp(String a,String b, String c)
	{
	System.out.println("name="+a);
	System.out.println("roll no="+b);
	System.out.println("ph="+c);
	}

}

