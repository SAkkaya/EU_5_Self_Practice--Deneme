package week10;

public class notes {
	29/05/2021
	week 10 Review Topics: Static
				   		   Static vs Instance
				   		   Inheritance

	instance: belong to the object. can be called through object
				each object has it's own copy of instance

				Constructor is used for setting instance variables

	static: belong to the class. can be called through the class 
			there is only one copy, shared by all objects
			
			static only accepts static 

			members:
				static variable
				static methods (if method does not involve using isntance members)
				static block: executes only one time at the very beginning
				static inner class


	instance vs static:
				muliple copes vs one copy


	class Circle{
		static  r;
		static PI = 3.14;

	}

	instance:
			3 circle object:
					r=4
					r=5
					r=6

	static:
		3 ciecle objects:
				r = 5;


	class iPhone{
				model;
		static	operatingSystem = "IOS"

	}


	class Employee{
			
			 salary;
			 jobTitle;
			static isHuman;

	}


	class CybertekStudents{
		
		       name;
		static schoolName

	}
}
