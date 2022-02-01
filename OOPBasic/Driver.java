package OOPBasic;

abstract class Car{
    abstract void accelerate(int speed);
    abstract void decelerate(int speed);
}
class PorscheCar extends Car{

    @Override
    void accelerate(int speed) {

    }

    @Override
    void decelerate(int speed) {

    }
}

class ModelX extends Car{

    @Override
    void accelerate(int speed) {

    }

    @Override
    void decelerate(int speed) {

    }
}
public class Driver {

    ModelX modelX = new ModelX();
    PorscheCar porsche = new PorscheCar();
    Car car = new ModelX();
    Car car2 = new PorscheCar();

    public void Driver(Car car){
        if(this.car == modelX){
            car.accelerate(100);
            car.decelerate(60);
        }else if(this.car == porsche){
            car.accelerate(110);
            car.decelerate(70);
        }
    }
}
