package OOP_W3;

public class Family {
    public static void main(String[] args) {
        People beckham = new People("Beckham", 'M', "Manchester United");
        People victoria = new People("Victoria", 'F', "Spice Girls");

        Children brooklyn = new Children("Brooklyn", 'M',"Beckham Academy", beckham, victoria);
        Children harper   = new Children("Harper", 'F', "Harper's School", beckham, victoria);
        
        System.out.println(brooklyn);
        System.out.println(harper);

        System.out.println(brooklyn.getFather());
        System.out.println(brooklyn.getMother());

        System.out.println(beckham.getWorkplace());

        System.out.println(brooklyn.getWorkplace());

        harper.equals(victoria);
        harper.equals(beckham);

        System.out.println(brooklyn.respectTo(beckham));
        System.out.println(brooklyn.respectTo(victoria));
        System.out.println(brooklyn.respectTo(new People("ครูสมศรี", 'F')));

        System.out.println(harper.respectTo(victoria));
        System.out.println(harper.respectTo(beckham)); 
    }
}
