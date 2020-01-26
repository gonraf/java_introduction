package introduction;

public class SimpleTypes {

    public static void main(String[] args) {
        int age;
        age = 0;
        System.out.println("Wiek to " + age);

      long lottoReward = 32_000_000L;
      System.out.println("Wygrana w lotto to " + lottoReward);

      short dayOfMonth = 29;
      System.out.println("Dzień miesiąca to " + dayOfMonth);
      dayOfMonth = 23;
      System.out.println("Dzień miesiąca to " + dayOfMonth);

      final float PI_PI = 3.14F;
      System.out.println("Liczba PI to " + PI_PI);

      double liczby = 1.4500023D;
      System.out.println("Liczba po przecinku to " + liczby);

      boolean isPaid = false;
      System.out.println("Czy zapłacono rachunek? " + isPaid);
      isPaid = true;
      System.out.println("A może teraz już zapłacono? " + isPaid);
    }
}
