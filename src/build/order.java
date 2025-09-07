package build;
import str.card;
import str.cash;

public class order {
    private String customer;
    private double amount;
    private Object payment;

    private order() {}
    public String getCustomer() { return customer; }
    public double getAmount() { return amount; }
    public Object getPayment() { return payment; }

    public static class Builder {
        private String customer;
        private double amount;
        private Object payment;

        public Builder setCustomer(String customer) { this.customer = customer; return this; }
        public Builder setAmount(double amount) { this.amount = amount; return this; }
        public Builder setPayment(Object payment) { this.payment = payment; return this; }

        public build.order build() {
            build.order o = new build.order();
            o.customer = customer;
            o.amount = amount;
            o.payment = payment;
            return o;
        }
    }
}