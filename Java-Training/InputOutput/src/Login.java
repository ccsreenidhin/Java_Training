import java.util.Scanner;


public class Login {
	public void display()
	{
		String username,password;
		Scanner sc=new Scanner(System.in);
		System.out.println("----------Login----------");
		System.out.println("-------------------------");
		System.out.println("Enter the username");
		username=sc.next();
		System.out.println("Enter the password");
		password=sc.next();
		if(username.equals("admin") && password.equals("admin"))
		{
			Detail r=new Detail();
			r.data();
		}
		else
			System.out.println("wrong user");
	}

}
