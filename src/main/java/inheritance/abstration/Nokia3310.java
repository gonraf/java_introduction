package inheritance.abstration;

     public class Nokia3310 implements Phone{

    @Override
    public void sendSms(int number, String content) {
        System.out.println("Sending SMS to " + number + " with content " + content + " using Nokia 3310 ");
    }

    @Override
    public void makeCall() {
        System.out.println("Calling " + number + " using Nokia 3310");



    }
}
