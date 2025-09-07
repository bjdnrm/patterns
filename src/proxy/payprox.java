package proxy;
import str.card;
import str.cash;

public class payprox {
    private Object realPayment;
    private boolean authorized;

    public payprox(Object realPayment, boolean authorized) {
        this.realPayment = realPayment;
        this.authorized = authorized;
    }

    public void pay(double amount) {
        if (authorized) {
            System.out.println("Доступ разрешен.");
            if (realPayment instanceof card) ((card) realPayment).pay(amount);
            if (realPayment instanceof cash) ((cash) realPayment).pay(amount);
        } else System.out.println("Доступ запрещен!");
    }
}