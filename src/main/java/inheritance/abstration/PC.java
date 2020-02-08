package inheritance.abstration;

public class PC implements Computer{
    @Override
    public void sendEmail(String address, String content) {
        System.out.println("Sending email " + content + " to adress " + address + " using PC");

    }

    @Override
    public void browseInternet() {
        System.out.println("Browsing Internet using PC");

    }
}
