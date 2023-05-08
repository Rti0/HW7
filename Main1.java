public class Main {
    public static void main(String[] args) {
        Employee Inovar = new Employee("1234","Rahaf",4000);
        System.out.println(Inovar.getSalary());
        System.out.println(Inovar.getAnnualSalary());
        Inovar.raisedSalary(50);
        System.out.println(Inovar.getSalary());

        System.out.println(Inovar.toString());
    }
}