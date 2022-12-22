public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int apples = 20;
        System.out.println("Значение переменной apples с типом int равно " + apples + " кг");
        byte bananas = 30;
        System.out.println("Значение переменной bananas с типом byte равно " + bananas + " кг");
        short pears = 40;
        System.out.println("Значение переменной pears с типом short равно " + pears + " кг");
        long pineapples = 50L;
        System.out.println("Значение переменной pineapples с типом long равно " + pineapples + " кг");
        float cherries = 11.5f;
        System.out.println("Значение переменной cherries с типом float равно " + cherries + " кг");
        double plums = 20.3;
        System.out.println("Значение переменной plums с типом double равно " + plums + " кг");

        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short i = -159;
        short f = 27897;
        byte j = 67;

        System.out.println("Задача 3");
        byte studentsA = 23;
        byte studentsB = 27;
        byte studentsC = 30;
        int totalStudents = studentsA + studentsB + studentsC;
        int totalSheets = 480;
        int sheetsStudent = totalSheets / totalStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsStudent + " листов бумаги");

        System.out.println("Задача 4");
        short oneMinuteBottles = 16 / 2;
        int twentyMinutes = oneMinuteBottles * 20;
        System.out.println("За 20 минут машина произвела " + twentyMinutes + " штук бутылок");
        short oneDayMinutes = 24 * 60;
        int oneDayBottles = oneDayMinutes * oneMinuteBottles;
        System.out.println("За сутки машина произвела " + oneDayBottles + " штук бутылок");
        int threeDayBottles = oneDayBottles * 3;
        System.out.println("За 3 дня машина произвела " + threeDayBottles + " штук бутылок");
        float oneMonthBottles = oneDayBottles * 30.5f;
        System.out.println("За месяц машина произвела " + oneMonthBottles + " штук бутылок");

        System.out.println("Задача 5");
        short totalDye = 120;
        short whiteDyeOneCabinet = 2;
        short brownDyeOneCabinet = 4;
        int totalCabinet = totalDye / (whiteDyeOneCabinet + brownDyeOneCabinet);
        int totalWhiteDye = totalCabinet * whiteDyeOneCabinet;
        int totalBrownDye = totalCabinet * brownDyeOneCabinet;
        System.out.println("В школе, где " + totalCabinet + " классов, нужно " + totalWhiteDye + " банок белой краски и " + totalBrownDye + " банок коричневой краски");

        System.out.println("Задача 6");
        short bananasBreakfast = 80 * 5;
        short milkBreakfast = 200 / 100 * 105;
        short iceCreamBreakfast = 2 * 100;
        short eggsBreakfast = 4 * 70;
        int breakfastGram = bananasBreakfast + milkBreakfast + iceCreamBreakfast + eggsBreakfast;
        float breakfastKg = breakfastGram / 1000f;
        System.out.println("Вес спортзавтрака " + breakfastGram + " грамм или " + breakfastKg + " килограмм");

        System.out.println("Задача 7");
        short totalReduce = 7 * 1000;
        short oneDayReduce1 = 250;
        short oneDayReduce2 = 500;
        int totalDays1 = totalReduce / oneDayReduce1;
        int totalDays2 = totalReduce / oneDayReduce2;
       float crDay = totalReduce/((oneDayReduce1+oneDayReduce2)/2F);
        System.out.println("На похудение уйдет " + totalDays1 + " дней, если спортсмен будет терять каждый день по 250 грамм и " + totalDays2 + " дней, если по 500 грамм");
        System.out.printf("Среднее количесво дней за которое получится похудеть %.2f%n", crDay);

        System.out.println("Задача 8");
        int Masha1 = 67760;
        int Denis1 = 83690;
        int Kristina1 = 76230;
        float Masha2 = Masha1 * 1.1f;
        float Denis2 = Denis1 * 1.1f;
        float Kristina2 = Kristina1 * 1.1f;
        float differenceYearMasha = (Masha2 - Masha1) * 12;
        float differenceYearDenis = (Denis2 - Denis1) * 12;
        float differenceYearKristina = (Kristina2 - Kristina1) * 12;
        System.out.println("Маша теперь получает " + Masha2 + " рублей. Годовой доход вырос на " + differenceYearMasha + " рублей");
        System.out.println("Денис теперь получает " + Denis2 + " рублей. Годовой доход вырос на " + differenceYearDenis + " рублей");
        System.out.println("Кристина теперь получает " + Kristina2 + " рублей. Годовой доход вырос на " + differenceYearKristina + " рублей");



    }
}