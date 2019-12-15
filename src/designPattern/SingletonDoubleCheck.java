package designPattern;

public class SingletonDoubleCheck {
	private volatile static SingletonDoubleCheck obj;
	
	private SingletonDoubleCheck(){}
	
	public static SingletonDoubleCheck getInstance(){
		if(obj==null){
			synchronized (SingletonDoubleCheck.class) {
				if(obj==null){
					return new SingletonDoubleCheck();
				}
			}
			
		}
		return obj;
		
	}

}
