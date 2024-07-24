package m12_oop_inheritance;

public class IsAvsHasARelation
{

}


class Computer{}
class Laptop extends Computer{};

class Camera{}
class Engine{}
class Vehicle
{
    Camera camera;
    Engine engine;
}

class Address
{
    String street;
    int number;
    String city;
    String ZipCode;

    public Address(String street, int number, String city, String zipCode, String country) {
        this.street = street;
        this.number = number;
        this.city = city;
        ZipCode = zipCode;
        Country = country;
    }

    String Country;

}
class House
{
    Address houseAddress;

    public static void main(String[] args)
    {
      House house = new House();
      house.houseAddress = new Address("Main", 3, "Miami", "33027", "USA");

    }
}