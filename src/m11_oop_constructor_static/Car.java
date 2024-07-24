package m11_oop_constructor_static;

public class Car
{
    //instance or object variables : each object has own copy of instance variable
    String make;
    String model;
    int year;

    //static variable, shared variable, ONE copy only

    static String purpose;
    static int count;


   // no argument cosntuctor

    public Car()
    {
        this("unknown", "unknon", 0);

        System.out.println();

       /* make = "unknown";
        model = "unknown";
        year = 0;

        */
        count++;
    }

    //overload constructor
    //constuctor is a special method with same name as classname
     //   and no return type, runs automatically when we create object

    public Car(String make, String model, int year)
    {
        System.out.println("in overload, 3 args contructor");

        this.make = make;
        this.model = model;
        this.year = year;

    }


    //instance or object method. Need to create obect to access. Provides behavior or action

    public void drive ()
    {
        System.out.println("Driving " + make + " " + model + " " + year);
    }

    //static method can be called using class name
    public static void build ()
    {
        System.out.println("building a car for " + purpose);
    }

}


class CarObject{

    public static void main(String[] args) {

        //Car.make = "kia"   make is obect varible, need object to access
        Car car1 = new Car();
        car1.make = "Kia";
        car1.model = "Sorento";
        car1.year = 2024;

        System.out.println(car1.make);

        //static variable does not need object to be access
        Car.purpose = "transportation";
        Car.count = 1000;

        System.out.println("Car.count = " + Car.count);


        //===================================================
        //creeate car obect using overloaded constructor with 3 parameters

        Car honda = new Car("honda", "Accord", 2024);
        System.out.println(honda.year);
        System.out.println(honda.purpose);
        System.out.println("car1 make= " + car1.make);

        //===================================================

        honda.drive(); // calling instance object using method

        //===================================================

        Car.build();

        System.out.println(car1.purpose);
        System.out.println(honda.purpose);
        System.out.println(Car.purpose);

        Car.purpose = "Uber";

        System.out.println(car1.purpose);
        System.out.println(honda.purpose);
        System.out.println(Car.purpose);

        System.out.println(Math.max(14, 5));


    }
}
