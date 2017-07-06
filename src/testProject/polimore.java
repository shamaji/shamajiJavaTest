package testProject;

public class polimore extends override{
	public void sum(){
		System.out.println("sum method called......");
	}
	
	public void sum(int a){
		System.out.println("Two sum Called...."+a);
	}
	
	public static void main(String[] args) {
		polimore obj=new polimore();
		obj.sum();
		obj.sum(5);
	}
}

class override{
	public void sum(int a){
		System.out.println("sum in another class!!!"+a);
	}
} 