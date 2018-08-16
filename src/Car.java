public class Car {

     int speed = 100;

    public static void main(String[] args){

        System.out.println("Hell World");
        Car car = new Car();
        car.ride();
       System.out.println( car.CarSpeed());
    }

    void ride () {


            System.out.println("I will ride!");

    }

    int CarSpeed () {
            return speed;
    }
}
