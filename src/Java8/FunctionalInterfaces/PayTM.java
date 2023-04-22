package Java8.FunctionalInterfaces;

public class PayTM implements UPIPayment{
    @Override
    public String doPayment(String source, String destination) {
        String txDate = UPIPayment.datePatterns("yyyy-MM-dd");
        return null;
    }

    @Override
    public double getCrashCard() {
        return UPIPayment.super.getCrashCard();
    }

}
