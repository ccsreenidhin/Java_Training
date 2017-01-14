package files;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Bytear {

	public static void main(String[] args)throws Exception {
		FileOutputStream input1=new FileOutputStream("C:/eclipse/workspace/newfile.txt");
		FileOutputStream input2=new FileOutputStream("C:/eclipse/workspace/newfile1.txt");
		
		ByteArrayOutputStream bout=new ByteArrayOutputStream();
		bout.write(65);
		bout.writeTo(input1);
		bout.writeTo(input2);
		
		bout.flush();
		
		input1.close();
		input2.close();
		
		

	}

}
