package files;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class seq {

	public static void main(String[] args)throws Exception {
		FileInputStream input1=new FileInputStream("C:/eclipse/workspace/newfile.txt");
		FileInputStream input2=new FileInputStream("C:/eclipse/workspace/newfile1.txt");
		SequenceInputStream inst=new SequenceInputStream(input1,input2);
		int j;
		while((j=inst.read())!=-1)
		{
			System.out.println((char)j);	
		}
		inst.close();
		input1.close();
		input2.close();

	}

}
