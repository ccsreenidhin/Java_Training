package files;

import java.io.FileInputStream;

public class Fin {
	
	public void read()
	{
		try
		{
		FileInputStream fin= new FileInputStream("C:/eclipse/workspace/newfile.txt");
		
		int i=0;
		while((i=fin.read())!=-1)
		{
		System.out.println((char)i);
		}
		
		fin.close();
		
		}catch (Exception e){
			e.printStackTrace();
		};
		

	}

}
