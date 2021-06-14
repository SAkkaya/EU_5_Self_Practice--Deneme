

/*06/05/2021
 
Review Topics: Inheritance
			   Overriding



method overriding: giving different implementations to a method

					ONLY instance methods can be overriden (cannot be final and private)
					
					MUST happen in sub class

					Access modifier need to be same or morw visible
							public > protected > default

					return-type, method name, parameters MUST be same

					@Override annotation must be applicable



			advantages:
					flexible
					less memory
					reusable


Shape
	attribute:
		 name

	 action:
	 	area(): 0
	 	perimeter(): 0
	 	toString()



Circle extends Shape
		area(): r*r*PI

Rectangle extends Shape
		area(): w*l

Square extends Shape
		area(): side *side


	with method overriding:
			1 method 3 implmentations

	without overriding:
			3 methods 3 implemntations





Car:
	attributes:
		make, model, year, color....

	actions:
		start()
		stop()
		driver()
		.....


Toyota extends Car
	start(): twist the key

Mercedes extends Car
	start(): push start button

Tesla extends Car
	start(): voice Control

BMW extends Car
	start(): call mechanic
			 jump start


	 with overriding:
	 		1 method 4 implementations

	 without overriding:
	 		4 methods 4 implementations




Object Class: parent of all classes




WebDriver
	get()
	close()


ChromeDriver:
			get(URL): opens url in chrome browser
			close()

FirewFoxDriver:
			get(URL):  opens url in firefox browser
			close()

OperaDriver:
			get(URL):  opens url in Opera browser
			close()




100 test cases (classes)



TestBase
	webdriver=  firefox

	setUP(): opens browser
			 maximizes browser
			 implicitwait
			 

	tearDown():
		close browser



*/





























