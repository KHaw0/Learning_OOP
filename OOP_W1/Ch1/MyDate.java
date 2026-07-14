package OOP_W1.Ch1;

public class MyDate {
    int day;
    int month;
    int year;

    MyDate() {
      this.day = 1;
      this.month = 1;
      this.year = 2025;
    }

    MyDate(int day, int month, int year) {
      this.day = day;
      this.month = month;
      this.year = year;
    }

    void setDay(int day) {
        if (day < 1 || day > 31) {
        System.out.println("Invalid day. Please enter a value between 1 and 31.");
        this.day = 0; // Return an error code or handle it as needed
        }
      this.day = day;
    }

    void setMonth(int month) {
        if (month < 1 || month > 12) {
        System.out.println("Invalid month. Please enter a value between 1 and 12.");
        this.month = 0; // Return an error code or handle it as needed
        }
      this.month = month;
    }
   
    void setYear(int year) {
      this.year = year;
    }

    int getDay() {
      return day;
    }

    int getMonth() {
      return month;
    }

    int getYear() {
      return year;
    }

    void printInfo() {
      System.out.println(day + "/" + month + "/" + year);
    }
}