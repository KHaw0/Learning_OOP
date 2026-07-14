package OOP_W1.Ch2;

public class MyStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Khaw", "2097", null);
        Student s2 = new Student("Keng", "2041", s1);

        s1.setClassMate(s2);

        s1.printInfo();
        s2.printInfo();
    }
}