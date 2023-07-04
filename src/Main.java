// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int initialAccount = 100;
        int addedAmount = 300;
        int bonus;
        if (addedAmount > 1000) {
            bonus = addedAmount / 100;
        } else {
            bonus = 0;
        }
        int totalAmount = initialAccount + addedAmount + bonus;

        System.out.println("Количество бонусных рублей: " + bonus);
        System.out.println("Итоговый счёт: " + totalAmount);
    }
}
