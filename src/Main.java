public class Main {
    public static void main(String[] args) {
        int balance = 100; //деньги, которые были на счету пользователя до пополнения
        int replenish = 999; //сумма, на которую пополнили баланс
        int needMoney = 100; //бонус 1р начисляется за каждые 100р пополнения
        int bonus = 1; //бонусом дается 1р за каждые 100р пополнения сверх 1000р

        boolean addMoney = replenish >= 1000; //пополнение должно быть больше или равно 1000

        if(addMoney) {
            int bonusAmount = replenish / needMoney;
            int finalBalance = bonusAmount + balance + replenish;

            System.out.println("Ваш баланс:"); System.out.println(finalBalance);

            System.out.println("Спасибо за участие в программе «Мой Булайн»");
        } else {
            int final_balance = balance + replenish;

            System.out.println("Ваш баланс:"); System.out.println(final_balance);}
    }
}
