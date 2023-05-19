package collection2_Hashmap;

public class Customer {
	private String name;
	private long adhaarNum;
	private int age;
	private String gender;
	private int purchaseAmount;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAdhaarNum() {
		return adhaarNum;
	}
	public void setAdhaarNum(long adhaarNum) {
		this.adhaarNum = adhaarNum;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getPurchaseAmount() {
		return purchaseAmount;
	}
	public void setPurchaseAmount(int purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}
	public Customer(String name, long adhaarNum, int age, String gender, int purchaseAmount) {
		super();
		this.name = name;
		this.adhaarNum = adhaarNum;
		this.age = age;
		this.gender = gender;
		this.purchaseAmount = purchaseAmount;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", adhaarNum=" + adhaarNum + ", age=" + age + ", gender=" + gender
				+ ", purchaseAmount=" + purchaseAmount + "]";
	}
	
	

}
