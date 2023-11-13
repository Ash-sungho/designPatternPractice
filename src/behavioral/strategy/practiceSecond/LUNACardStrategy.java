package behavioral.strategy.practiceSecond;

public class LUNACardStrategy implements PaymentStrategy{

    private String emailId;
    private String password;

    public LUNACardStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + "원 paid using LUNACard.");
    }
}
