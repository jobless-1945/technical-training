package association.composition;
class Engine{
    void start(){
        System.out.println("Engine starts!");
    }
}
public class Car {
    private Engine engine;
    Car(){
        //Engine object created here
        engine=new Engine();//type coupling
    }
    void drive(){
        engine.start();
        System.out.println("Car is moving");
    }

    public static void main(String[] args) {
        Car c=new Car();
        c.drive();
    }
}
