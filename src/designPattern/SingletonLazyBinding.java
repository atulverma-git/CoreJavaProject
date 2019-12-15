package designPattern;

public class SingletonLazyBinding {
	private static SingletonLazyBinding obj;
	
	private SingletonLazyBinding(){}
	
	public static SingletonLazyBinding getInstance(){
		if(obj==null){
			obj=new SingletonLazyBinding();
			return obj;
		}
		return obj;
		
	}

}
