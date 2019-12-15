package basicProgram;

public class InterfacediamondProblem implements InterfaceTest1, InterfaceTest2 {
	
		@ Override
		public void show() {
		System.out.println("inside Interface Diamond Problem");

	}
		
		public static void main(String args[]){
			InterfacediamondProblem obj = new InterfacediamondProblem();
			obj.show();
		}

}
