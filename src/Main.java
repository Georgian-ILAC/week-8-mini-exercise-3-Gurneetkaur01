public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Gurneet", "Kaur", 3111, 20.5);
        emp.setHeight(5.7);

        System.out.println(emp);

        System.out.println("Hourly Pay after raise: $" + emp.getRaise());

        int hoursWorked = 45;
        System.out.println("Total pay for " + hoursWorked + " hours: $" + emp.payDay(hoursWorked));
    }
}
