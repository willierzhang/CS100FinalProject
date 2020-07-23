# CS 100 Programming Project
Group member:
Yiyang Zhang – yzhan670@ucr.edu
Marlon Lucas – mluca006@ucr.edu

Title of project:
Pizza Store Order System

Project:
	We want to write a simple order system for a pizza store. 

Why interesting:
	We think it is interesting because it is useful in real life situation. It also can help us being familiar with different design pattern such as factory pattern and decorator pattern.

Tools:    
  We want to use c++, but we are open to java.

I/O:
There is no input required. The main class serves as a driver to test all the funtions and simulate a pizza order situation, which includes order a base pizza and add add-on to the pizza and calculate the correct price for the pizza with all add-ons. The consule output shows the result.


Project Report:
	We planed to write a application for a pizza store to handle the order and process of pizza. We initially plan to implement at least these funtion: 
		1. Order a pizza
		2. Add toppings on the pizza
		3. Cancel a existing order
		4. Togo or dine in
		5. checkout with cash or credit card
     However, due to lack of one team member and short summer term, we are only able to implement the first two functions. If we want to make the application fully functional,          the rest three functions must be implemented. This small project serves as a demonstration of design patterns.
	We used two design patterns: Factory Pattern and Decorator Pattern. We used Factory Pattern to create a pizza store, and the store can create different pizza at runtime.  	This disign pattern allows we create different stores that serve different pizza without write new store classes for each store. We used Decorator Pattern to allow add-ons to 	    the base pizza. The Decorator Pattern enable us to add more add-ons without modifying the pizza classes, which makes the program more maintainable. 
	
	![Image of output](output.png)
