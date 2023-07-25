 // Consider the following two classes:

public class Car {
    public void m1() {
        System.out.println("car 1");
    }

    public void m2() {
        System.out.println("car 2");
    }

    public String toString() {
        return "vroom";
    }
}
public class Truck extends Car {
    public void m1() {
        System.out.println("truck 1");
    }
}

// And assuming that the following variables have been declared:

  Car mycar = new Car();
  Truck mytruck = new Truck();
  
// What is the output from the following statements?
        
                                     // OUTPUT:
System.out.println(mycar);              [vroom]
mycar.m1();	                        [car 1]
mycar.m2();	                        [car 2]
System.out.println(mytruck);	       [vroom]
mytruck.m1();	                       [truck 1]
mytruck.m2();	                       [car 2]
