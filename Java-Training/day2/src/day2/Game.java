package day2;

public class Game {
	public String train(String s,int b)
		{
		System.out.println("Time out");
		return "bye";
		}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Game g=new Game();
		System.out.println(g.train("hai",3));

	}

}
