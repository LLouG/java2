package dayTwelve.abstractClasses;

public class AbstractClasses {
    public static void main(String[] args) {
        Car obj = new UpdatedFx50();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}


abstract class Car { // Cannot create an object of an abstract class
    public abstract void drive();
    public abstract void fly();

    public void playMusic()
    {
        System.out.println("Playing music...");
    }
}

abstract class Fx50 extends Car {
    public void drive()
    {
        System.out.println("Driving...");
    }
}

class UpdatedFx50 extends Fx50 { // Concrete class
    public void fly() 
    {
        System.out.println("Flying...");
    }
}