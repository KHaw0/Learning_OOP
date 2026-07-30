package OOP_W2.Ch01;

public class Person {
    public String name;
    public char gender;
    private String telno;
    public Person fan;
    Person[] gig = new Person[2];
 
    Person (String name){
        this.name = name;
    }

    Person (String name, char gender, String telno){
        this.name = name;
        this.gender = gender;
        this.telno = telno;
    }
    /*
    @Override
    public public String toString (){
        return name;
    }*/

    public void setTelno (String telno) {
        this.telno = telno;
    }

    public String getPhone (Person someone) {
        if(this.gender != someone.gender) {
            return telno;
        }
        return "ม่ายบอก";
    }

    public String setFan (Person fan) {
        if(this.fan == null){
            if (this.gender != fan.gender) {
                this.fan = fan;
                return "เป็นแฟนกันแล้วนะ";
            } else {
                return "เพศเดียวกันเป็นเเฟนกันไม่ได้นะ";
            }
        } else{
            return "เปลี่ยนแฟนตอนนี้ไม่ได้นะ";
        }
    }

    public String getFan (Person requester) {
        if (this.fan != requester) {
            return "ยังไม่มีแฟนจ้า";
        } else {
            return "สุดที่รักไงล่ะจ้ะ";
        }
    }

    public String setGig(Person gig){
        if(this.gig[0] == null){
            this.gig[0] = gig;
        } else if(this.gig[1] == null){
            this.gig[1] = gig;
        } else {
            return "แค่ 2 คนพอแล้ว";
        }
        return null;
    }

    public String getGig(Person requester){
        if (requester.gender != this.gender) {
            return "ยังไม่มีแฟนเลยสักคน";
        } else {
            for (int i = 0; i < gig.length; i++) {
                System.out.print(gig[i].name + " ");
            }
            return null;
        }
    }

    public void removeGig(Person gig){
        if(this.gig[0].equals(gig)){
            this.gig[0] = null;
        } else if(this.gig[1].equals(gig)){
            this.gig[1] = null;
        }
    }

    public void removeGig(){
        this.gig = null;
    }

    public void getPersonInfo(Person somone){
        System.out.println("========================");
        System.out.println("ชื่อ: " + this.name + "\n" + "เพศ: " + this.gender);
        System.out.println("เบอร์: " + getPhone(somone));
        System.out.println("แฟน: " + this.fan.name);
        System.out.print("กิ๊ก: ");
        System.out.println(getGig(somone));
        System.out.println("========================");
    }
}
