package testProject;

abstract class AnonymousInner {
	   public abstract void mymethod();
	}

public class nestedClass {
	//nested static class call	
	static public class nest{
			void showNest(){
				System.out.println("this is the nested class Method");
			}
			
			static class static_class{
				public void show(){
					System.out.println("static class.....");
				}
			}
		}
		
		public static void main(String[] args) {
			nest.static_class n=new nest.static_class();
//			n.showNest();
			n.show();
			
			//annonimous
			AnonymousInner ani=new AnonymousInner(){
				public void mymethod(){
					System.out.println("AnonymousInner method called");
				}
			};
			ani.mymethod();
			
		}
}
