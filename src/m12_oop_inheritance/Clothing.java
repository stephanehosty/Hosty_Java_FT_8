package m12_oop_inheritance;

/*constuctor in inhertance.
  Super class constructor called first then sub class cosntructor
  super () is used to calll parent class constructor

 */

public class Clothing
{
    String company;

    public Clothing()
    {
        System.out.println("Company no args contructor");
    }


    public Clothing(String company)
    {
        System.out.println("Clothing 1 args contructor");
        this.company = company;
    }



}

class Jacket extends Clothing
{
    public Jacket(){};


        public Jacket(String company)
        {
            super(company);
            System.out.println("Jacket 1 args contructor");
        }
}


class ClothingObject
{
    public static void main(String[] args)
    {
      Jacket jacket = new Jacket();
      Jacket jacket2 = new Jacket("GAP");
    }
}