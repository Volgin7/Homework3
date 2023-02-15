public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {

        System.out.println("Задача 1");

        int varInt = 12345;
        System.out.println("Значение переменной varInt с типом int равно " + varInt);
        byte varByte = 123;
        System.out.println("Значение переменной varByte с типом byte равно " + varByte);
        short varShort = 1234;
        System.out.println("Значение переменной varShort с типом short равно " + varShort);
        long varLong = 123456L;
        System.out.println("Значение переменной varLong с типом long равно " + varLong);
        float varFloat = 123.456f;
        System.out.println("Значение переменной varFloat с типом float равно " + varFloat);
        double varDouble = 123.4567899999999;
        System.out.println("Значение переменной varDouble с типом double равно " + varDouble);

    }
    public static void task2() {

        System.out.println("Задача 2");
        float varFloat = 27.12f;
        long varLong = 987_678_965_549L;
        double varDouble = 2.786;
        short varShort = 569;
        int varInt = -159;
        char varChar = 27897;
        byte varByte = 67;
    }
}