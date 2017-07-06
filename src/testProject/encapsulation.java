package testProject;

public class encapsulation extends demoEncapsulation{
	
	public static void main(String[] args) {
		encapsulation obj=new encapsulation();
		obj.setName("Kishan");
		obj.setNo(10);
		System.out.println("No : "+obj.getNo()+" - Name : "+obj.getName());
	}
}


class demoEncapsulation{
	private String name;
	private int no,nos;
	
	//getter Settter Method
	void setNo(int no){
		this.no=no;
	}
	public int  getNo(){
		return no;
	}
	void setName(String n){
		this.name=n;
	}
	public String getName(){
		return name;
	}
}