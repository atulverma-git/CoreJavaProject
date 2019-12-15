package designPattern;

public class SingletonImpl {

	public static void main(String[] args) {
		
		System.out.println("static binding");
		SingletonStaticBinding obj1 = SingletonStaticBinding.getInstance();
		
		SingletonStaticBinding obj2 = SingletonStaticBinding.getInstance();
		
		if(obj1==obj2){
			System.out.println("obj1==obj2");
		}
		
		System.out.println("lazy binding");
		SingletonLazyBinding lazyObj1 = SingletonLazyBinding.getInstance();
		SingletonLazyBinding lazyObj2 = SingletonLazyBinding.getInstance();
		if(lazyObj1==lazyObj2)
			System.out.println("lazyObj1==lazyObj2");
		
		System.out.println("double check....");
		SingletonStaticBinding dcObj1 = SingletonStaticBinding.getInstance();
		SingletonStaticBinding dcObj2 = SingletonStaticBinding.getInstance();
		if(dcObj1==dcObj2)
			System.out.println("dcObj1==dcObj1");
		
		
		
		
		
	}

}
