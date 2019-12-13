package Assigments2;

public class Practice1 {
    public static void main(String[] args) {
        new Test();
    }
}


class Animal {
    protected String Animal_Type;
    private String Animal_Color;

    public Animal() {
        System.out.println("I am a Animal");
    }

    public void eat() {
        System.out.println("I can eat");
    }

    public void sleep() {
        System.out.println("I can sleep");
    }

    public String getAnimal_Color() {
        return Animal_Color;
    }

    public void setAnimal_Color(String animal_Color) {
        Animal_Color = animal_Color;
    }
}


class Dog extends Animal {

    public Dog() {
        System.out.println("I am a Dog");
    }

    public void eat() {
        System.out.println("I’m eating food");
    }

    public void sleep() {
        System.out.println("I’m sleeping now");
    }

    public void bark() {
        System.out.println("I can bark");
    }

    public void DisplayInfo() {
        Animal d = new Animal();
        Animal_Type = "Husky";
        d.setAnimal_Color("Blue");

        System.out.println("I am a " + Animal_Type);
        System.out.println("My color is " + d.getAnimal_Color());
    }
}


class Test {
    public Test() {
        Animal obj1 = new Animal();
        Dog obj2 = new Dog();

        new Animal();
        new Dog();

        obj1.eat();
        obj1.sleep();
        obj2.bark();
        obj2.eat();
        obj2.sleep();
        obj2.bark();
        obj2.DisplayInfo();
    }
}