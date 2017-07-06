package testProject;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
class Addition {
	int t;
	void add(int x, int y){
		t=x+y;
		System.out.println("total is : "+ t);
		//return t;
	}
	
	void subtraction(int x,int y){
		t=x-y;
		System.out.println("Substraction Is : "+t);
		//return t;
	}
}

public class extendClass extends Addition{
	int c;
	void multiplication(int x,int y){
		c=x+y;
		System.out.println("Multiplication is : " + c);
	}
	
	void devision(int x,int y){
		c=x/y;
		System.out.println("Devision is : " + c);
	}
	
	//generic entry
	   public <E> void printArray(E... inputArray ) {
		      // Display array elements
		      for(E element : inputArray) {
		         System.out.printf("%s ",element);
		      }
		   }
	   
	
	public static void main(String[] args) {
		Integer[] arr={1,2,3,4,5,6};
		String[] strarr={"shamaji","kishan"};
		
		//List
		List<String> list1 = new ArrayList<String>();
		list1.add("abc");
		list1.add("abc");
		list1.add("abcd");
		list1.add("abce");
		list1.add("kishan");
		list1.remove(0);
		for(String str : list1){
		     System.out.println("List Is : "+str);
		}
		
		
		
		extendClass obj=new extendClass();
		obj.add(10, 20);
		obj.subtraction(20, 5);
		obj.multiplication(12, 2);
		obj.devision(50, 5);
		obj.printArray(arr);
		obj.printArray(strarr);
		obj.printArray(new String[]{"a", "b", "c"});
	}
}
