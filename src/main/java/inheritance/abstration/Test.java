package inheritance.abstration;

public class Test {

    public static void main(String[] args) {
        Phone nokia = new Nokia3310(5);
        nokia.makeCall(555444333);
        nokia.sendSms(555444333,"Cześć Maciek co słychać");
        Computer pc = new PC();
        pc.browseInternet();
        pc.sendEmail("halina@example.com", "Cześć Halina, podeślesz ten ostatni przepis?");

        SmartPhone smartPhone3 = new SmartPhone();
        Phone smartPhone = smartPhone3;
        smartPhone.sendSms(234346786, "Hello zbóju");
        smartPhone.makeCall(435609785);

    }
}
