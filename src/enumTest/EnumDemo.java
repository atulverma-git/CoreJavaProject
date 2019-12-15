package enumTest;

public class EnumDemo {
	public static void main(String arg[]){
		
		//basic enum test
			for(EnumTest1 day:EnumTest1.values()){
				System.out.println(day);
			}
			
		// valusOf() method of Enum
			
			System.out.println(EnumTest1.valueOf("SATURDAY"));
			
		// String to Enum
			HomeLoanEnumTest homeLoan = HomeLoanEnumTest.valueOf("Home_Loan");
			System.out.println(homeLoan);
		
		// enum to String
			
		String homeLoanString = HomeLoanEnumTest.Home_Loan.name();
		System.out.println(homeLoanString);
		
		
	}
}
