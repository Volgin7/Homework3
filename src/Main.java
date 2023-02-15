public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
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
    public static void task3() {

        System.out.println("Задача 3");
        int pupilsInClassOne = 23;
        int pupilsInClassTwo = 27;
        int pupilsInClassThree = 30;
        int totalNumberOfPupils = pupilsInClassOne + pupilsInClassTwo + pupilsInClassThree;
        int totalNumberOfSheets = 480;
        int numberOfSheetPerPupil = totalNumberOfSheets / totalNumberOfPupils;
        System.out.println("На каждого ученика рассчитано " + numberOfSheetPerPupil + " листов бумаги ");
    }
    public static void task4() {

        System.out.println("Задача 4");
        int productivityPerTwoMinuties = 16;
        int productivityPerMinute = productivityPerTwoMinuties / 2;
        int productionInTwentyMinuties = productivityPerMinute * 20;
        System.out.println("За 20 минут машина произвела " + productionInTwentyMinuties + " штук бутылок");
        int productionInOneDay = productivityPerMinute * 60 * 24;
        System.out.println("За сутки машина произвела " + productionInOneDay + " штук бутылок");
        int productionInThreeDays = productionInOneDay * 3;
        System.out.println("За 3 дня машина произвела " + productionInThreeDays + " штук бутылок");
        int productionInOneMonth = productionInOneDay * 30;
        System.out.println("За 1 месяц (30 дней) машина произвела " + productionInOneMonth + " штук бутылок");
    }
    public static void task5() {

        System.out.println("Задача 5");
        int cansTotalNumber = 120;
        int whiteCansPerRoom = 2;
        int brownCansPerRoom = 4;
        int totalNumberOfRooms = cansTotalNumber / (whiteCansPerRoom + brownCansPerRoom);
        int whiteCansTotal = totalNumberOfRooms * whiteCansPerRoom;
        int brownCansTotal = totalNumberOfRooms * brownCansPerRoom;

        System.out.println("В школе, где " + totalNumberOfRooms + " классов, нужно " + whiteCansTotal + " банок белой краски и " + brownCansTotal + " банок коричневой краски");
    }
    public static void task6() {

        System.out.println("Задача 6");
        int bananasNumber = 5;
        float bananaWeight = 80f;
        int milkAmount = 200;
        float milkWeight = 105f/100;
        int iceСreamNumberOfBlocks = 2;
        float iceСreamWeightOfBlock = 100f;
        int eggsNumber = 2;
        float eggWeight = 70f;

        float breafastWeightGramms = bananasNumber * bananaWeight + milkAmount * milkWeight + iceСreamNumberOfBlocks * iceСreamWeightOfBlock + eggsNumber * eggWeight;
        System.out.println("Вес спортивного завтрака " + breafastWeightGramms + " грамм");

        float breafastWeightKilos = breafastWeightGramms / 1000;
        System.out.println("Вес спортивного завтрака " + breafastWeightKilos + " килограмм");

        // System.out.println("Значение переменной varDouble с типом double равно " + varDouble);
    }
}