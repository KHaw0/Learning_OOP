package OOP_W1.Ch2;

public class Student {
    String name;
    String id;
    Student classMate;

    Student(String name, String id, Student classMate) {
        this.name = name;
        this.id = id;
        this.classMate = classMate;
    }

    void setClassMate(Student classMate) {
        this.classMate = classMate;
    }

    void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("ClassMate: " + classMate.name);
    }
}
