import build.order;
import chain.*;
import str.card;
import str.cash;
import chain.orderpupupu;
import chain.orderpupupu;
import proxy.payprox;
import decor.base;
import decor.mail;
import decor.sms;
import adapt.old;
import adapt.payad;

public class Main {
    public static void main(String[] args) {
        // Создаем заказ с картой
        card cardPayment = new card();
        order order = new order.Builder()
                .setCustomer("Иван")
                .setAmount(500)
                .setPayment(cardPayment)
                .build();

        // Цепочка проверок
        orderpupupu credit = new cred();
        orderpupupu stock = new stock();
        credit.setNext(stock);

        if (credit.handle(order)) {
            // Прокси для оплаты
            payprox payment = new payprox(order.getPayment(), true);
            payment.pay(order.getAmount());

            // Уведомления
            base notifier = new base();
            notifier = new mail(notifier);
            notifier = new sms(notifier);
            notifier.notify("Заказ оплачен: " + order.getAmount());

            // Адаптер для старого сервиса
            payad oldService = new payad(new old());
            oldService.pay(order.getAmount());
        }
    }
}