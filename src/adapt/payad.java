package adapt;

public class payad {
    private old oldService;
    public payad(old oldService) { this.oldService = oldService; }
    public void pay(double amount) { oldService.oldPay(amount); }
}