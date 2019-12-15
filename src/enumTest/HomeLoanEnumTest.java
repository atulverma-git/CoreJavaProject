package enumTest;

public enum HomeLoanEnumTest {
	Home_Loan{
		@Override
		public String toString(){
			return "A home loan is not cheaper";
		}
	},
	
	Auto_Loan{
		@Override
		public String toString(){
			return "An auto loan is cheaper to home loan";
		}
	},
	
	Personal_Loan{
		@Override
		public String toString(){
			return "A Personal loan is cheapest";
		}
	}

}
