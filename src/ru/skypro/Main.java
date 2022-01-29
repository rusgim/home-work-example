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




    }
}
