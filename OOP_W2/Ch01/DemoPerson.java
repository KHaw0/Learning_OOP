package OOP_W2.Ch01;

public class DemoPerson {
    public static void main(String[] args) {
        Person dome = new Person(null);
        dome.name = "dome";
        dome.gender = 'm';
        dome.setTelno("001");
        Person ken = new Person("ken", 'm', "002");
        Person ploy = new Person(null);
        ploy.name = "ploy";
        ploy.gender = 'w';
        ploy.setTelno("003");
        Person may = new Person("may", 'w', "004");
        Person ann = new Person("ann", 'w', "005");
        Person fon = new Person("fon", 'w', "006");

        //System.out.println(dome.getPhone(ploy));

        //System.out.println(dome.fan);
        dome.setFan(ploy);
        // System.out.println(dome.fan.name);
        // System.out.println(dome.getFan(may));
        dome.setGig(may);
        dome.setGig(ann);

        dome.getPersonInfo(ken);
    }
}
