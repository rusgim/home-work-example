package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte a = 127;
        short b = 32767;
        long c = 2147483647;
        long d = a + b + c;
        double e = d / a;
        System.out.println(e);

        double boxer1 = 78.2;
        double boxer2 = 87.2;
        double totalWeight = boxer1 + boxer2;
        System.out.println("Общий вес бойцов " + totalWeight + " кг");
        double differenceWeight = boxer2 - boxer1;
        System.out.println("Разница между двумя бойцами " + differenceWeight + " кг");
        var differenceWeight2 = boxer2 % boxer1;
        System.out.println("Разница между бойцами " + differenceWeight2 + " кг");

        byte banana = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte egg = 70;
        int sportsBreakfast = (banana * 5 + milk * 2 + iceCream * 2 + egg * 4);
        System.out.println("Общий вес завтрака " + sportsBreakfast + " грамм");
        double sportsBreakfast2 = (banana * 5 * 0.001 + milk * 2 * 0.001 + iceCream * 2 * 0.001 + egg * 4 * 0.001);
        System.out.println("Общий вес завтрака " + sportsBreakfast2 + " кг");

        short loseWeight = 250;
        short loseWeight2 = 500;
        double numberOfDaysOfDiet = (7 / (loseWeight * 0.001));
        System.out.println("При похудении по 250 грамм в день, нужно " + numberOfDaysOfDiet + " дней");
        double numberOfDaysOfDiet2 = (7 / (loseWeight2 * 0.001));
        System.out.println("При похудении по 500 грамм - " + numberOfDaysOfDiet2 + " дней");
        double averageValue2 = (numberOfDaysOfDiet + numberOfDaysOfDiet2) / 2;
        System.out.println("Чтобы добиться результата похудения в среднем нужно " + averageValue2 + " дней");

        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        int MashaPerYear = Masha * 12;
        int DenisPerYear = Denis * 12;
        int KristinaPerYear = Kristina * 12;
        double MashaAfterThePromotion = Masha + Masha * 0.1;
        double DenisAfterThePromotion = Denis + Denis * 0.1;
        double KristinaAfterThePromotion = Kristina + Kristina * 0.1;
        System.out.println("Маша получает зарплату в месяц после повышения " + MashaAfterThePromotion + " руб");
        System.out.println("Денис получает зарплату в месяц после повышения " + DenisAfterThePromotion + " руб");
        System.out.println("Кристина получает зарплату в месяц после повышения " + KristinaAfterThePromotion + " руб");
        double MashaNewYear = MashaAfterThePromotion * 12 - MashaPerYear;
        double DenisNewYear = DenisAfterThePromotion * 12 - DenisPerYear;
        double KristinaNewYear = KristinaAfterThePromotion * 12 - KristinaPerYear;
        System.out.println("У Маши разница между годовыми доходами составит " + MashaNewYear + "руб");
        System.out.println("У Дениса разница между годовыми доходами составит " + DenisNewYear + " руб");
        System.out.println("У Кристины разница между годовыми доходами составит " + KristinaNewYear + "руб");







    }
}
