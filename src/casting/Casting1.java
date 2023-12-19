package casting;

public class Casting1 {

    public static void main(String[] args) {
        int intvalue = 10;
        long longValue;
        double doubleValue;

        longValue = intvalue;
        System.out.println("longValue = " + longValue);

        doubleValue = intvalue;
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L;
        System.out.println("doubleValue2 = " + doubleValue);
    }

}
