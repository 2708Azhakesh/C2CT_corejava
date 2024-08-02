package encapsulation;

public class StudentMain {

	public static void main(String[] args) {
		student s = new student();
		s.setName("alagesh");
		s.setRegno(686856688);
		s.setAge(2);
		s.setPer(99.8f);
		System.out.println();
		student g = new student();
		
		System.out.println(s.getAge());
		
	
		

	}

}
