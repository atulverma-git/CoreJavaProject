package designPattern;

public class Phone {
	private String os;
	private int MAH;
	private int ram;
	private String pr;
	
	

	public Phone(String os, int mAH, int ram, String pr) {
		super();
		this.os = os;
		this.MAH = mAH;
		this.ram = ram;
		this.pr = pr;
	}



	@Override
	public String toString() {
		return "Phone [os=" + os + ", MAH=" + MAH + ", ram=" + ram + ", pr=" + pr + "]";
	}
	
	

}
