package OOP_W3;

public class Children extends People implements GoodChild{
    private People father;
    private People mother;
    private String school;

    Children(String name, char gender, People father, People mother){
        super(name, gender);
        this.father = father;
        this.mother = mother;
    }

    Children(String name, char gender, String school, People father, People mother){
        this(name, gender, father, mother);
        this.school = school;
    }

    @Override
    public String toString(){
        if(gender == 'M') return name + " (Boy)";
        else return name + " (Girl)";
    }

    public People getFather(){
        return father;
    }
    
    public People getMother(){
        return mother;
    }

    public String getWorkplace() {
        return "ยังเรียนหนังสืออยู่เลย ที่โรงเรียน " + school;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == mother){
            System.out.println("รักแม่ที่สุดเลย สุขสันต์วันเเม่");
            return true;
        } else{
            System.out.println("ไม่ใช่แม่หนูสักหน่อย");
            return false;
        }
    }

    @Override
    public String respectTo(People people){
        String politeSuffix = (gender == 'M') ? "ครับ" : "ค่ะ";
        if(people == this.father){
            return "สวัสดี" + politeSuffix + " คุณพ่อ";
        } else if(people == this.mother){
            return "สวัสดี" + politeSuffix + " คุณแม่";
        } else {
            return "สวัสดี" + politeSuffix;
        }
    }
}
