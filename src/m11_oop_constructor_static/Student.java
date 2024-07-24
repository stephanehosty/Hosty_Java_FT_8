package m11_oop_constructor_static;

public class Student extends Object
{
    //if you do not add any constructors, compilors will add one
    // no ars default constructor

    public Student()
    {
        super(); // call to object call constructor
    }
}


class StudentObjects
{
    public static void main(String[] args)
    {
        Student student = new Student();

    }
}