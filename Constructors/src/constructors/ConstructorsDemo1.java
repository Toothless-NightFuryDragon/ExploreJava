package constructors;
class One{
	private long x ,y;
	One(){
		x=10;y=11;
		System.out.println(x+" "+y);
			}
	One(long x,long y){
		this.x = x; this.y = y;
		System.out.println(x+" "+y);
	}
	//One(One o){
		//o = 
	//}
	
}
public class ConstructorsDemo1 {
	public static void main(String[] args) {
		One a = new One();
		One b = new One(2,3);
		
	}

}
