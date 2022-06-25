public class Main {
    public static void main(String[] args) {
        int initialAccount = 300;
        int depositAccount = 100;
        int bonus;
        if (depositAccount > 1000) {
            bonus = depositAccount / 100;
        }
        else {
            bonus = 0;
        }
        int balance = initialAccount + depositAccount + bonus;
        System.out.println("Баланс: " + balance + " руб. Бонус: " + bonus + " руб.");
    }
}
