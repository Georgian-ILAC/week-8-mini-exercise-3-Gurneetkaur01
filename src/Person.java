public class Person {
    private String firstName;
    private String lastName;
    private double height;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getHeight(){
        return height;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setHeight(double height){
        this.height = height;
    }
}
class Employee extends Person {
    private int id;
    private double hourlyPay;

    public Employee(String firstName, String lastName, int id, double hourlyPay) {
        super(firstName, lastName);
        this.id = id;
        this.hourlyPay = hourlyPay;
    }

    public int getId() {
        return id;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public double getRaise() {
        this.hourlyPay *= 1.15;
        return this.hourlyPay;
    }

    public double payDay(int hoursWorked) {
        double totalPay;
        if (hoursWorked > 40) {
            int overtimeHours = hoursWorked - 40;
            totalPay = (40 * hourlyPay) + (overtimeHours * hourlyPay * 1.5);
        } else {
            totalPay = hoursWorked * hourlyPay;
        }
        return totalPay;
    }

    @Override
    public String toString() {
        int heightFeet = (int) getHeight();
        int heightInches = (int) ((getHeight() - heightFeet) * 12);
        return "Name: " + getFirstName() + " " + getLastName() + "\n" +
                "She is " + heightFeet + "'" + heightInches + "\"\n" +
                "She make $" + hourlyPay + "\n" +
                "She has the employee ID " + id + "\n";
    }
}
