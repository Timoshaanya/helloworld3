public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int q = 37000;
        byte w = 10;
        short e = 238;
        long r = 3158457259L;
        float t = 1.5f;
        double y = 2.859678459;
        System.out.println("Зна*чение переменной q" + " с типом int равно " + q);
        System.out.println("Значение переменной w" + " с типом byte равно " + w);
        System.out.println("Значение переменной e" + " с типом short равно " + e);
        System.out.println("Значение переменной r" + " с типом long равно " + r);
        System.out.println("Значение переменной t" + " с типом float равно " + t);
        System.out.println("Значение переменной y" + " с типом double равно " + y);

        float u = 27.12f;
        long i = 987678965549L;
        float o = 2.786f;
        short p = 569;
        short a = -159;
        short s = 27897;
        byte d = 67;
        System.out.println(u);
        System.out.println(i);
        System.out.println(o);
        System.out.println(p);
        System.out.println(a);
        System.out.println(s);
        System.out.println(d);

        byte oneClass = 23;
        byte twoClass = 27;
        byte threeClass = 30;
        short paper = 480;
        int totalPerson = oneClass + twoClass + threeClass;
        int onePerson = paper / totalPerson;
        System.out.println("На каждого ученика рассчитано " + onePerson + " листов бумаги");

        int bottles = 8;
        int minutes = 1;
        int minutes2 = 2;
        int minutes20 = 20;
        int minutesOneDay = 24 * 60;
        int minutesThreeDay = 3 * minutesOneDay;
        int minutesOneMonth = 30 * minutesOneDay;

        int bottlesMinutes2 = minutes2 * bottles;
        int bottlesMinutes20 = minutes20 * bottles;
        int bottlesMinutesOneDay = minutesOneDay * bottles;
        int bottlesMinutesThreeDay = minutesThreeDay * bottles;
        int bottlesMinutesOneMonth = minutesOneMonth * bottles;

        System.out.println("За " + minutes2 + " минуты машина произвела " + bottlesMinutes2 + " штук бутылок");
        System.out.println("За " + minutes20 + " минут машина произвела " + bottlesMinutes20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesMinutesOneDay + " штук бутылок");
        System.out.println("За три дня машина произвела " + bottlesMinutesThreeDay + " штук бутылок");
        System.out.println("За один месяц машина произвела " + bottlesMinutesOneMonth + " штук бутылок");

        int cans = 120;
        int whiteCansOneClass = 2;
        int brownCansOneClass = 4;
        int totalClass = cans / (whiteCansOneClass + brownCansOneClass);
        int totalWhiteCans = totalClass * whiteCansOneClass;
        int totalBrownCans = totalClass * brownCansOneClass;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");

        int bananas = 5;
        int milk = 200;
        int iceCream = 2;
        int egg = 4;

        int grBananas = 80 * bananas;
        int grMilk = 105 * 2;
        int grIceCream = 100 * iceCream;
        int grEgg = 70 * egg;

        int totalWeightGr = grBananas + grMilk + grIceCream + grEgg;
        float totalWeightkg = totalWeightGr / 1000.0f;

        System.out.println("Количество граммов спортзавтрака равно " + totalWeightGr);
        System.out.println("Количество килограммов спортзавтрака равно " + totalWeightkg);

        int totalWeightKg = 7;
        float weightMin = 0.25f;
        float weightMax = 0.5f;
        int daysMin = (int) (totalWeightKg / weightMin);
        int daysMax = (int) (totalWeightKg / weightMax);
        int averageDays = (daysMin + daysMax) /2;
        System.out.println(daysMin + " дней уйдет на похудение, если терять по " + weightMin + "гр в день");
        System.out.println(daysMax + " дней уйдет на похудение, если терять по " + weightMax + "гр в день");
        System.out.println("Среднее количество дней для похудения " + averageDays);

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;

        int raisingSalaryMasha = (int) (salaryMasha * 1.1);
        int raisingSalaryDenis = (int) (salaryDenis * 1.1);
        int raisingSalaryKristina = (int) (salaryKristina * 1.1);

        int currentSalaryInYearMasha = salaryMasha * 12;
        int currentSalaryInYearDenis = salaryDenis * 12;
        int currentSalaryInYearKristina = salaryKristina * 12;

        int newSalaryInYearMasha = raisingSalaryMasha * 12;
        int newSalaryInYearDenis = raisingSalaryDenis * 12;
        int newSalaryInYearKristina = raisingSalaryKristina * 12;

        System.out.println("Маша теперь получает " + raisingSalaryMasha + " рублей. Годовой доход вырос на " + (newSalaryInYearMasha - currentSalaryInYearMasha) + " рублей.");
        System.out.println("Денис теперь получает " + raisingSalaryDenis + " рублей. Годовой доход вырос на " + (newSalaryInYearDenis - currentSalaryInYearDenis) + " рублей.");
        System.out.println("Кристина теперь получает " + raisingSalaryKristina + " рублей. Годовой доход вырос на " + (newSalaryInYearKristina - currentSalaryInYearKristina) + " рублей.");






    }
}