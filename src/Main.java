//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Products:%n%s, witch price is  $ %f %n", product1, price1);
        System.out.printf("%s, witch price is  $ %f %n%n", product2, price2);
        System.out.printf("Record: %d years old, code %d and gender %s%n%n", age, code, gender);
        System.out.printf("Measure with eight decimal places: %f%nRounded (three decimal places): %f%nUS decimal point: %f", measure, measure, measure);

    }
}