package designPattern;

public class PhoneBuilder {
	private String os;
	private int MAH;
	private int ram;
	private String pr;
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setMAH(int mAH) {
		MAH = mAH;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setPr(String pr) {
		this.pr = pr;
		return this;
	}
	
	public Phone getPhone(){
		return new Phone(os, MAH, ram, pr);
	}
	
	
}
