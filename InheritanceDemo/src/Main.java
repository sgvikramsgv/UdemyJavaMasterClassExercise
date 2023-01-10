public class Main {
    public static void main(String[] args) {
        Employee vikram = new Employee("Vikram", "23/06/1982", "10/12/2006");
        System.out.println(vikram);
        System.out.println("Age = " + vikram.getAge());
        System.out.println("Pay = " + vikram.collectPay());

        SalariedEmployee nishant = new SalariedEmployee("Vikram", "14/11/2012", "10/12/2015", 35000);
        System.out.println(nishant);
        System.out.println("Age = " + nishant.getAge());
        System.out.println("Pay = " + nishant.collectPay());
        nishant.retire();
        System.out.println("Pay = " + nishant.collectPay());

        HourlyEmployee navtej = new HourlyEmployee("navtej", "23/12/2015", "23/12/2018", 40);
        System.out.println(navtej);
        System.out.println("Navtej's PayCheck = " + navtej.collectPay());
        System.out.println("Navtej's Holiday PayCheck = " + navtej.getDoublePay());
    }
}
