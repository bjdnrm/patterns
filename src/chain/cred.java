package chain;

public class cred extends orderpupupu {
    public boolean handle(build.order order) {
        if (order.getAmount() > 1000) {
            System.out.println("Кредитная проверка не пройдена!");
            return false;
        }
        return next == null || next.handle(order);
    }
}