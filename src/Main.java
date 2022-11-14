public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int sk = 1_000_000; // сумма кредита
        int time = 3; // кол-во лет
        double percent = 9.9; // процентная ставка в год
        double p = service.calculate(sk, time, percent);
        System.out.println("Ежемесячный аннуитетный платеж - " + p + " рублей");
    }
}

