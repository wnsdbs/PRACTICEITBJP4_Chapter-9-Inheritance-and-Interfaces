// Consider the following classes:

  public class Vehicle {...}
  public class Car extends Vehicle {...}
  public class SUV extends Car {...}

// Which of the following are legal statements?

 a. SUV s = new Car();
 b. Vehicle v = new SUV();
 c. Car c = new Vehicle();
 d. SUV s = new SUV();
 e. Car c = new SUV();
 f. Vehicle v = new Car();

// Answer(s): 
  b. Vehicle v = new SUV();
  d. SUV s = new SUV(); 
  e. Car c = new SUV();
  f. Vehicle v = new Car();
