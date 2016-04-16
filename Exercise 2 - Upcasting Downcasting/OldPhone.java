public class OldPhone implements Phone {
	
	//Field
	private String brand = null;
	private String number = null;
	
	//Constructor method
	public OldPhone(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void call(String number) {
		System.out.println("Calling " + number);
		this.number = number;
	} 
	
}