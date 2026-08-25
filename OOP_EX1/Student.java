package OOP_EX1;

public abstract class Student {
    private String id;
    private String major;
    private String name;

    Student(String id, String name){
        this.id = id;
        this.name = name;
    }

    Student(String id, String name, String major){
        this(id, name);
        this.major = major;
    }

    public abstract void showSkill();

    public void setMajor(String major){
        this.major = major;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getMajor(){
        return major;
    }
}
