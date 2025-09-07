package chain;

public class stock extends orderpupupu {
    public boolean handle(build.order order) {
        System.out.println("Проверка наличия товаров...");
        return next == null || next.handle(order);
    }
}