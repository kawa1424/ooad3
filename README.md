# OOAD Project 3

##### Maura Winstanley, Kara Wallace, Abbigail Nicholson

**To Run:** `javac *.java -d classes ` `java -cp classes Main.java`

**Language and Environment: ** Java, IntelliJ

**Description/ Assumptions:**

Store is where the majority of the work is being done. We make use of the factory pattern by creating two factories, one to create 12 customers and one to create 24 cars. To add options to the cars we use a decorator pattern that adds any of the three features to the car by giving a description and the rate added on. We use a strategy pattern for the Customer class so that each type of customer will have different operations for getting the number of nights rented and the number of cars rented. In a single day the store will rent out cars, return cars, and return information at the end of the day. 





