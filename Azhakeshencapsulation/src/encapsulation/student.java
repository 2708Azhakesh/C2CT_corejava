package encapsulation;

public class student {
	int regno;
	String name;
	int age;
	float per;
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "student [regno=" + regno + ", name=" + name + ", age=" + age + ", per=" + per + "]";
	}
	
	
	

}
