
public class CreditPaymentService {
    public double calculate(int Sk, int time, double percent) {

        int n = time * 12; // количество месяцев
        double i = percent / 12; // процентная ставка в месяц

        double P;
        double a = 1 + i;
        double b = -n;
        Math.pow(a, b); // расчеты для возведения в степень
        return P = (Sk * i) / (1 - Math.pow(a, b)); // формула расчета аннуитетного платежа


    }


}
