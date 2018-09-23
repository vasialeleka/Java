package Polimorfizm;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

         Shape shape ;
         Random random = new Random();
        int number = random.nextInt(3);

        switch(number){

            case 0 :
                shape= new Circule();
                break;
            case 1:
                shape = new Square();
                break;
            case 2:
                shape = new Triangle();
                break;
            default :
                throw new RuntimeException();

         }
         shape.draw();
    }
}
