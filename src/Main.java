public class Main {
    public static void main(String[] args) {

        int amount = 1100;
        int initial = 100;

        int bonus = amount/initial;

        if (amount < 1000) {
            bonus = 0;
        }

        int result = amount + initial + bonus;
        System.out.println("Бонус составит: " + bonus);
        System.out.println("Итоговая сумма: " + result);
    }
}
