package basicProgram;


class SuperClass{
	public static void display(){
		System.out.println("inside SuperClass static display");
	}
	
	/*private void show(){
		System.out.println("Inside Private Method of Super");
	}*/
	
	public void show(){
		System.out.println("Inside Private Method of Super");
	}
}

class ChildClass extends SuperClass{
	public static void display(){
		System.out.println("inside ChildClass static display");
	}
	
	public void show(){
		System.out.println("Insdie Public method of Child");
	}
}

class GrandChild extends ChildClass{
	// this method is hiding ChildClass static display() method
	public static void display(){
		System.out.println("inside Grand Child static display");
	}
}

public class InheritanceTest {


	public static void main(String[] args) {
		SuperClass childObj = new ChildClass();
		GrandChild grandChild = new GrandChild();
		//childObj.show(); // will throw compiler error
		ChildClass.display();
		grandChild.show();
		
	}

}
