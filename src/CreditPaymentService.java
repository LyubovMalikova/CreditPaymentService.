
public class CreditPaymentService {
    public double calculate(int sk, int time, double percent) {

        int n = time * 12; // количество месяцев
        double i = percent / 12 / 100; // процентная ставка в месяц

        double p; // размер аннуитетного платежа
        double a = 1 + i;
        double b = -n;
        Math.pow(a, b); // расчеты для возведения в степень
        return p = (double) Math.round ((sk * i) / (1 - Math.pow(a, b))); // формула расчета аннуитетного платежа
    }
}
