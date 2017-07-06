package testProject;
import java.util.*;
public class map {
	
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();  
		  map.put(100,"kishan");
		  map.put(101,"Vijay");  
		  map.put(102,"Rahul");  
		  map.put(103,"Amit");
		  map.put(104,"savan");
//		  map.remove(104);
		  for(Map.Entry m:map.entrySet()){  
		   System.out.println("Map  : ID "+m.getKey()+" - Vaule"+m.getValue());  
		  }  
		  
		  
		  Set<String> set = new HashSet<>();
		  set.add("abc");
		  set.add("abc");
		  set.add("abce");
		  set.add("abcd");
//		  set.remove("abc");
		  for(String s : set){
			  System.out.println("str : "+s);
		  }
	}
}
