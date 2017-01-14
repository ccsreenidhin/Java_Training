package files;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Frw {
	
	
	

	public static void main(String[] args) {
		
		
		
		try{
			Fin f=new Fin();
			FileOutputStream fout= new FileOutputStream("C:/eclipse/workspace/newfile.txt");
			String s="welcome to";
			byte b[]=s.getBytes();
		
			
			fout.write(b);
			
			fout.close();
	
		f.read();
		}catch (Exception e){
			e.printStackTrace();
		};
		
		
		
		
	}

}
