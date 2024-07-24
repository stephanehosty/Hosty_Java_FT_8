package m11_oop_constructor_static;

//static block is called static initializer block
// purpose = runs first and only once.
//used to initialize static variable or load data

public class StaticBlock
{
    public static int num;

    static
    {
        System.out.println("static block");
        num = 100;
    }
}


class StaticBlockTest
{
    public static void main(String[] args)
    {
        StaticBlock st = new StaticBlock();
        StaticBlock st2 = new StaticBlock(); //didnt work since static block works only once

        System.out.println(StaticBlock.num);
    }
}
