package decor;

public class mail extends base {
    private base wrappee;
    public mail(base wrappee) { this.wrappee = wrappee; }
    public void notify(String msg) {
        wrappee.notify(msg);
        System.out.println("Отправлено на email: " + msg);
    }
}