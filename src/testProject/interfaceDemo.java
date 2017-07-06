package testProject;

interface intface{
	public void show();
}

public class interfaceDemo implements intface,newins{
	public void show(){
		System.out.println("Showing.....");
	}
	public void display(){
		System.out.println("Displaying.....");
	}
	public void view(){
		System.out.println("Viewing...");
	}
	public static void main(String[] args) {
		interfaceDemo obj=new interfaceDemo();
		obj.show();
		obj.display();
		obj.view();
	}
}
