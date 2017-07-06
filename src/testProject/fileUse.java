package testProject;
import java.io.*;
public class fileUse {
	int roll;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public static void main(String[] args) {
		fileUse f=new fileUse();
		f.setRoll(15);
		System.out.println("roll : "+f.getRoll());
		
//		FileInputStream fis=null;
//		FileOutputStream fos=null;
//		try{
//			File file = new File("input.txt");
//            System.out.println(file.getCanonicalPath());
//			fis = new FileInputStream(file);
//	         fos = new FileOutputStream("output.txt");
//	         
//	         int c;
//	         while ((c = fis.read()) != -1) {
//	            fos.write(c);
//	         }
//		}catch(Exception e){
//			System.out.println("error is "+e);
//		}		
	}
}
