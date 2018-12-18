
public class App  {

	public static void main(String[] args) {
		String gender = "Male";
		Human h = null;
		
		if(gender == "Male") {
			 Male m = new Male();
			m.sayHello();
			
		}
		else
		{
			Female f = new Female();
			f.sayHello();
			
			
		}
	
		
	}

}
