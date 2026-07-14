package OOP_W1.Ch1;

public class MyMain {
    public static void main(String[] args) {
        MyDate date = new MyDate();
        date.setDay(1);
        date.setMonth(8);
        date.setYear(2023);
        date.printInfo();

        MyDate date2 = new MyDate(5, 7, 2025);
        date2.printInfo();
    }
}