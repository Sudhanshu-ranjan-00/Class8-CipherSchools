class Car{
    String name;
    String color;
    int year;
    int maxSpeed;
    Car(String name,String color,int year,int maxSpeed)
    {
        this.name=name;
        this.color=color;
        this.year=year;
        this.maxSpeed=maxSpeed;
    }
    void accelerate()
    {
        System.out.println("Car is accelerated!");
    }
}

public class CarStudy{
    public static void main(String args[])
    {
        Car mustang=new Car("Mustang","Greenn",2022,230);
        System.out.println(mustang.name);
        System.out.println(mustang.color);
        System.out.println(mustang.year);
        System.out.println(mustang.maxSpeed);
    }
}