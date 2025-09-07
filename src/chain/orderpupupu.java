package chain;

public abstract class orderpupupu {
    protected orderpupupu next;
    public void setNext(orderpupupu next) { this.next = next; }
    public abstract boolean handle(build.order order);
}