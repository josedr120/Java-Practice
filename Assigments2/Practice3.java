package Assigments2;

public class Practice3 {
    public static void main(String[] args) {
        Students obj = new Students();
        Students obj1 = new Students();
        Students obj2 = new Students();
        Students obj3 = new Students();

        obj.Students(101, "Jose", 20);
        obj1.Students(102, "Perez", 27);
        Students.Students1("Caribbean University");
        obj3.Students(500, "Alex", 31);

        System.out.println("Student Roll: "
                + obj.stuRoll
                + "\nStudent Name: " + obj.stuName
                + "\nStudent Age: " + obj.stuAge
                + "\nCollege Name: " + Students.collegeName);


        System.out.println("Student Roll: "
                + obj1.stuRoll
                + "\nStudent Name: " + obj1.stuName
                + "\nStudent Age: " + obj1.stuAge
                + "\nCollege Name: " + Students.collegeName);

        System.out.println("Student Roll: "
                + obj1.stuRoll
                + "\nStudent Name: " + obj1.stuName
                + "\nStudent Age: " + obj1.stuAge
                + "\nCollege Name: " + Students.collegeName);

        System.out.println("Student Roll: "
                + obj3.stuRoll
                + "\nStudent Name: " + obj3.stuName
                + "\nStudent Age: " + obj3.stuAge
                + "\nCollege Name: " + Students.collegeName);
    }
}

class Students {
    static String collegeName = "EDP University";
    int stuRoll;
    String stuName;
    int stuAge;

    static void Students1(String cName) {
        collegeName = cName;
    }

    void Students(int roll, String name, int age) {
        this.stuRoll = roll;
        this.stuName = name;
        this.stuAge = age;
    }
}
