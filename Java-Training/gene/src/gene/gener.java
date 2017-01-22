package gene;



public class gener {
	public static <T> void printArray(T[] iparray)
	{
		for(T ele:iparray)
			System.out.println( ele);
		System.out.println();
	}
	
	
	

	public static void main(String[] args) {

		Integer[] p={1,2,3,4,5,6};
		Character[] c={'a','b','c','d','e','f'}; 
		
		printArray(p);
		printArray(c);
		
	}

}
