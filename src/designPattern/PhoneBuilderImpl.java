package designPattern;

public class PhoneBuilderImpl {

	public static void main(String[] args) {
		Phone phone = new PhoneBuilder().setMAH(3000).setOs("IOS").setPr("Qualcom").setRam(2000).getPhone();
		System.out.println(phone.toString());
	}

}
