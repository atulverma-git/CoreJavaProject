package jvm;


public class Adress{
	private String addLine1;
	private String addLine2;
	private String city;
	private int pin;
	public Adress(String addLine1, String addLine2, String city, int pin) {
		super();
		this.addLine1 = addLine1;
		this.addLine2 = addLine2;
		this.city = city;
		this.pin = pin;
	}
	public String getAddLine1() {
		return addLine1;
	}
	public void setAddLine1(String addLine1) {
		this.addLine1 = addLine1;
	}
	public String getAddLine2() {
		return addLine2;
	}
	public void setAddLine2(String addLine2) {
		this.addLine2 = addLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	@Override
	public String toString() {
		return "Adress [addLine1=" + addLine1 + ", addLine2=" + addLine2 + ", city=" + city + ", pin=" + pin + "]";
	}
	

}
