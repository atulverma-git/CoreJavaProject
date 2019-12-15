package basicProgram;

public class InheritanceStaticOverride {
	public static void main(String[] args){
		Super s = new Child();
		s.show();
		System.out.println(s.i);
	}
}

class Super{
	int i;
	public Super(){
		i=10;
	}
	public static void show(){
		System.out.println("inside super static show()");
	}
	
	
}

class Child extends Super{
	int i;
	
	public Child(){
		i=20;
	}
	
	public static void show(){
		System.out.println("inside child static show()");
	}
	
	public void showVal(){
		System.out.println(i);
	}
}