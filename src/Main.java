public class Main {
    public static void main(String[] args) {

        int initialSum = 100; // сумма на счету до пополнения
        int amount = 900; // сумма пополнения
        int bonus; // количество бонусных рублей
        if (amount >= 1100) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }
        int totalSum = initialSum + amount + bonus; // итоговый счет после пополнения

        System.out.println(bonus + " руб");
        System.out.println(totalSum + " руб");

    }
}
