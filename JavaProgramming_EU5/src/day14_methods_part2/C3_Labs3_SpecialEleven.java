package day14_methods_part2;

public class C3_Labs3_SpecialEleven {

	public static void main(String[] args) {
		/* Question-3

				We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
				Write a method that accepts a number and prints true if the given number is special.
				
				specialEleven(22) → true
				specialEleven(23) → true
				specialEleven(24) → false  */
		
		
				
				specialEleven(45);

	}

	public static void specialEleven(int number) {
		
		if (number%11==0 || number%11==1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		
	}
	
	

}
