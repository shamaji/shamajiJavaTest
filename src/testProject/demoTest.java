package testProject;

public class demoTest {
	int a=10;
	int tot;
	int large;
	
	static int b=5;
	int[] arr={6,9,3,4,5,8,1,2};
	static String[] data={"abc","india","123","shamaji","kishan","savan","rahul"};
	
	void data(){
		System.out.println("data function"+a);
		
		for(int i=0;i<arr.length;i++){
				System.out.println("data arr is : "+arr[i]);
				this.tot += arr[i];
				System.out.println("total is : "+tot);
		}
		
		//finding largest integer
		large=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i] > large) large=arr[i];
			System.out.println("Larger Number Is : " + large);
		}
	}
	
	void passArray(int[] arrayVar){
		for(int da=0;da<arrayVar.length;da++){
			System.out.println("Passing array Parameter is "+arrayVar[da]);			
		}
	}
	
	static void show(){
		System.out.println("static function"+b);
		for(String a:data){
			System.out.println("static arr"+a);
		}
	}
	

	public static void main(String[] args) {
		String name="shamaji";
		System.out.println("hello india");
		Boolean check=name instanceof String; 
		System.out.println("check values is : "+check);
		System.out.println("Max Number : "+Math.max(12, 15));
		if(check){
			System.out.println("true instanceof Is :"+check);
		}else{
			System.out.println("false instanceof Is :"+check);
		}
		demoTest dt=new demoTest();
		dt.data();
		dt.passArray(new int[]{1,2,3,4,5,6});
		show();
	}
	
}

//class box extends demoTest
//{
//	int data=1;
//	
//}

