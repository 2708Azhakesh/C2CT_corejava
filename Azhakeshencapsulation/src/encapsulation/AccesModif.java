package encapsulation;

public class AccesModif {
	private int a=1;
	public int b=2;
	protected int c=3;
	int d=4;
	
	public static void main(String[] args) {
		AccesModif n= new AccesModif();
		System.out.println(n.a);
		System.out.println(n.b);
		System.out.println(n.c);
		System.out.println(n.d);
	}

}
