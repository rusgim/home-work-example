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
        int bananas = banana * 5;
        int milk2 = milk * 2;
        int iceCream2 = iceCream * 2;
        int eggs = egg * 4;
        int sportsBreakfast = (bananas + milk2 + iceCream2 + eggs);
        System.out.println("Общий вес завтрака " + sportsBreakfast + " грамм");
        double bananasKg = bananas * 0.001;
        double milkKg = milk2 * 0.001;
        double iceCreamKg = iceCream2 * 0.001;
        double eggsKg = eggs * 0.001;
        double sportsBreakfast2 = (bananasKg + milkKg + iceCreamKg + eggsKg);
        System.out.println("Общий вес завтрака " + sportsBreakfast2 + " кг");

        short loseWeight = 250;
        short loseWeight2 = 500;
        double loseWeightKg = loseWeight * 0.001;
        double loseWeight2Kg = loseWeight2 * 0.001;
        double numberOfDays = 7 / loseWeightKg;
        System.out.println("При похудении по 250 грамм в день, нужно " + numberOfDays + " дней");
        double numberOfDays2 = 7 / loseWeight2Kg;
        System.out.println("При похудении по 500 грамм - " + numberOfDays2 + " дней");
        double averageValue2 = (numberOfDays + numberOfDays2) / 2;
        System.out.println("Чтобы добиться результата похудения в среднем нужно " + averageValue2 + " дней");

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int mashaPerYear = masha * 12;
        int denisPerYear = denis * 12;
        int kristinaPerYear = kristina * 12;
        double mashaAfterThePromotion = masha + masha * 0.1;
        double denisAfterThePromotion = denis + denis * 0.1;
        double kristinaAfterThePromotion = kristina + kristina * 0.1;
        System.out.println("Маша получает зарплату в месяц после повышения " + mashaAfterThePromotion + " руб");
        System.out.println("Денис получает зарплату в месяц после повышения " + denisAfterThePromotion + " руб");
        System.out.println("Кристина получает зарплату в месяц после повышения " + kristinaAfterThePromotion + " руб");
        double mashaNewYear = mashaAfterThePromotion * 12 - mashaPerYear;
        double denisNewYear = denisAfterThePromotion * 12 - denisPerYear;
        double kristinaNewYear = kristinaAfterThePromotion * 12 - kristinaPerYear;
        System.out.println("У Маши разница между годовыми доходами составит " + mashaNewYear + "руб");
        System.out.println("У Дениса разница между годовыми доходами составит " + denisNewYear + " руб");
        System.out.println("У Кристины разница между годовыми доходами составит " + kristinaNewYear + "руб");







    }
}
