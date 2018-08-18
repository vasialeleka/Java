package Person;

import java.util.Scanner;

public class Person {
    public int height = 190;
    String namePerson = "Unknown";

    void say() {
        Scanner in = new Scanner(System.in);
        if (namePerson == "Unknown") {

            System.out.print("Hi.\nPlease,Enter your name:");
        } else {
            System.out.print("Hi,I'm " + namePerson + ".\nPlease,Enter your name:");
        }
        String name = in.nextLine();
        System.out.print("Hi," + name + ".\nEnter what I need to say:");
        String say = in.nextLine();
        System.out.println(say);
    }

    public Person(int height, String name) {

        this.height = height;
        namePerson = name;

    }

    public Person() {
    }
}
