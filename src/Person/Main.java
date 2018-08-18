package Person;

public class Main {
    public static void main(String[] args) {
        Person Vasia = new Person(190,"Vasia");
        System.out.println(Vasia.namePerson+" height is :"+Vasia.height);
        Person Someone = new Person();
        //Vova.height =;
        System.out.println(Someone.height);

        Vasia.say();
        Someone.say();

         Student StudentOfFirstCourse = new Student();

        System.out.println(StudentOfFirstCourse.height);
        StudentOfFirstCourse.say();

        Student StudentOfSecondCourse = new Student(2);
        StudentOfSecondCourse.say();

    }
}
