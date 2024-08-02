package inheritance;
//public class SingleInhertiance {


	class Student{
		void name() 
		{
		System.out.println("azhakesh");
	
		}
	}
	class Dept extends Student{
		void branch() 
		{
			System.out.println("cse");
		}
		public class SingleInhertiance {
		
		}
	
	public static void main(String[] args) {
		
		Dept a = new Dept();
		a.branch();
	}}


