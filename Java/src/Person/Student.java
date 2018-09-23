package Person;

public class Student extends Person {

    int course = 1;

    void say (){
        System.out.println("I'm student of "+course+" course :)");
    }

    public Student() {
    }

    public Student(int course) {
        this.course = course;
    }
}
