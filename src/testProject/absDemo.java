package testProject;
interface newins{
	public void view();
}

 abstract class move {
	public abstract void walk();
	public abstract void talk();
}
 
 abstract class call extends move{
	 public abstract void walk();
	 public void talk(){
		 System.out.println("Talking.....");
	 }
 }

public class absDemo extends call{
	public void walk(){
		System.out.println("Walking....");
	}
	public static void main(String[] args) {
		absDemo obj=new absDemo();
		obj.walk();
		obj.talk();
	}
}
