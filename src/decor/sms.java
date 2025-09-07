package decor;

public class sms extends base {
    private base wrappee;
    public sms(base wrappee) { this.wrappee = wrappee; }
    public void notify(String msg) {
        wrappee.notify(msg);
        System.out.println("Отправлено в SMS: " + msg);
    }
}