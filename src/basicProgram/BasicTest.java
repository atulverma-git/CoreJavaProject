package basicProgram;

import java.util.concurrent.TimeUnit;

import com.dao.Employee;

class A{
	String str = "hello";
	
	public void print(A a){
		a.str="Bye";
	}
}

@SuppressWarnings("unused")
public class BasicTest {
	static int a = 1111;
	
	static{
		System.out.println("inside static block");
		a=a-- - --a;
		System.out.println("inside statci block: a= "+a);
	}
	
	{
		System.out.println("inside anonymus block");
		a=a++ + ++a;
		System.out.println("inside anonymus block: a="+a);
	}
	

	public static void main(String[] args) {
		
		A a = new A();
		a.print(a);
		System.out.println("a.str "+a.str);
		
		// check max limit of Integer
		System.out.println("Integer max value"+Integer.MAX_VALUE); 
		
		// name of the Enum of TimeUnit
		System.out.println(TimeUnit.MILLISECONDS.name());
		
		
		// checking length of the String....
		String str= "123456789";
		
		System.out.println("length: "+str.length());
		
		System.out.println("string at length-1 is: "+str.charAt(str.length()-1));
		
		// test the output of the below:
		
		BasicTest obj = new BasicTest();	// will initialize anonymous block
		obj.waitDemo();
		
		
//		int i = obj.getValue();		// calling getValue will throw NPE
		
		System.out.println("null==null is always: "+(null==null));
		
		System.out.println("-------------------------------------------------------------");
		Employee emp = new Employee();
		System.out.println("reference emp: "+emp);
		System.out.println("hashcode emp: "+emp.hashCode());
		
		
	}
	
	public void waitDemo(){
		System.out.println("calling wait demo");
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("calling notify");
		notify();
	}
	/*@SuppressWarnings("null")
	public int getValue(){
		return (true?null:0);
	}*/
}


