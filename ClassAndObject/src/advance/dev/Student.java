package advance.dev;

public class Student {
	private String name;
	private int age;
	private String address;
	private String phone;
	private double averScore;
	
	public Student(String name, int age, String address, String phone, double averScore) {
		this.name=name;
		this.age=age;
		this.address=address;
		this.phone=phone;
		this.averScore=averScore;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public double getAverScore() {
		return averScore;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + ", phone=" + phone + ", averScore="
				+ averScore + "]";
	}
	

}
