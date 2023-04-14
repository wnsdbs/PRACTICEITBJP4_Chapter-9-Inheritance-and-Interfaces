public class Car {
    public void m1() {
        System.out.println("car 1");
    }
​
    public void m2() {
        System.out.println("car 2");
    }
​
    public String toString() {
        return "vroom";
    }
}
public class Truck extends Car {
    public void m1() {
        System.out.println("truck 1");
    }
     
    public void m2() {
        super.m1();
    }
     
    public String toString() {
        return super.toString() + super.toString();
    }
}

And assuming that the following variable has been declared:

  Truck mytruck = new Truck();

What is the output from the following statements?

                                            OUTPUT:
System.out.println(mytruck);	        [vroomvroom]
mytruck.m1();	                          [truck 1]
mytruck.m2();                               [car 1]
