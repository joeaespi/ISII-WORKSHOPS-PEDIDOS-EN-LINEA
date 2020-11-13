package ec.edu.espol.workshops.second;

public class Customer {
	private int age;
	private String sex;
	private String state;
	private int prima ;
	
	public Customer(int age, String sex, String state) {
		this.age = age;
		this.sex = sex;
		this.state = state;
		this.prima = 500;
	}

	public int getAge() {
		return this.age;
	}
	
	public String getSex() {
		return this.sex;
	}
	
	public String getState() {
		return this.state;
	}
	
	public int getPrima() {
		return this.prima;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setSex(String sex) {
		this.sex=sex;
	}
	
	public void setState(String state) {
		this.state=state;
	}
	
	public void setPrima(int prima) {
		this.prima=prima;
	}
}
