package OOP_EX1;

public class ComsciStudent extends Student implements MobileDaveloper, WebDaveloper{
    private boolean canCodeFlutter;
    private boolean canCodeAngular;
    private boolean canCodeReact;

    ComsciStudent(String id, String name){
        super(id, name);
    }

    @Override
    public void showSkill() {
        System.out.print("Student ID: " + getId() + " ");
        System.out.print("Name: " + getName() + " ");
        System.out.print("Major: " + getMajor() + " ");
        System.out.print("Flutter Skill: " + canCodeFlutter + " ");
        System.out.print("Angular Skill: " + canCodeAngular + " ");
        System.out.println("React Skill: " + canCodeReact);
    }

    @Override
    public void codingAngular(boolean canCode) {
        canCodeAngular = canCode;
    }

    @Override
    public void codingFlutter(boolean canCode) {
        canCodeFlutter = canCode;
    }

    @Override
    public void codingReact(boolean canCode) {
        canCodeReact = canCode;
    }
}