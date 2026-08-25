package OOP_EX1;

public class OOPConcept {
    public static void main(String[] args) {
        ComsciStudent billy = new ComsciStudent("123456789", "Mr.Billy");
        billy.setMajor("Computer Science");
        billy.codingFlutter(false);
        billy.codingAngular(true);
        billy.codingReact(false);
        billy.showSkill();
        billy.codingFlutter(true);
        billy.codingAngular(false);
        billy.codingReact(true);
        billy.showSkill();
    }

}
