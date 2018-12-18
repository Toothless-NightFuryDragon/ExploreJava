
public class App {
public static void main(String[] args) {
	String gender = "Male";
	Human h = null;
	
	if(gender == "Male") {
		/*Male m = new Male();
		m.sayHi();*/
		h = new Male();
	}
	else
	{
		/*Female f = new Female();
		f.sayHi();*/
		h = new Female();
	}
	h.sayHi();
}
}
