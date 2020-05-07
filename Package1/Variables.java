package Package1;

public class Variables {

	String value="flower"; 
	static char val='M';
	
	public static void main(String[] args) {

		Float f=100.0f;
		
		Variables test=new Variables();
		 System.out.println("Instance variable:"+test.value);  
		 
		 System.out.println("Static variable:"+val);  
		 
		 System.out.println("Local variable:"+f);
	}

}
