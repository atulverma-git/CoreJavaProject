package designPattern;

public class SingletonStaticBinding {
	
	private static SingletonStaticBinding object = new SingletonStaticBinding();
	
//	private flag = false
	
	private SingletonStaticBinding(){}
	
	public static SingletonStaticBinding getInstance(){
		return object;
	}

}
