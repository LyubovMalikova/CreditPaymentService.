public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int Sk = 1_000_000;
        int time = 1;
        double percent = 9.9;
        double P = service.calculate(Sk, time, percent);
        System.out.println("Ежемесячный аннуитетный платеж - " + P);





    }
}
