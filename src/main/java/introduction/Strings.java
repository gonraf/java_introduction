package introduction;

public class Strings {

    public static void main(String[] args) {
        String text = "Ala ma kota";
        String text2 = "Ala ma kota";
        String text3 = "Litwo! ojczyzno moja!";

        System.out.println("Text 1: " + text + ", text 2: " + text2);

        System.out.println("Czy obie zmienne to to samo? " + text.equals(text2));

        // Utwórz String "Ala ma kota" używając StringBuildera i metody append.
        StringBuilder builder = new StringBuilder();
        builder.append("Ala ");
        builder.append(" ma ");
        builder.append(" kota");
        String resultText = builder.toString();
        System.out.println("Napis utworzony przez buildera: " + builder.toString());

        // Znajdź znak na piątej pozycji w napisie "Ala ma kota" (metoda charAt())
        char char5 = text.charAt(4);
        System.out.println(" 5 znak to: " + char5);

        // Sprawdź czy napis "Ala ma kota" zaczyna się od słowa "Ala" (startsWith()) i kończy słowem "kota" (endsWith)
        System.out.println("Zaczyna się od Ala " + text.startsWith("Ala"));
        System.out.println("Kończy się na kota " + text.endsWith("kota"));

        // Sprawdź długość napisu "Litwo! ojczyzno moja!" (lenght())


        // Sprawdź, na którym miejscu występuje znak d w napisie "abcdefgh" (indexOf())

        // Wytnij z napisu "Ala ma kota, a kot ma mleko" napis od 7 do 12 znaku (substring)

        // Sprawdź czy napis "Ala ma kota" zawiera napis "ALA" (contains). Nie zwrocaj uwagi na wielkość
        // liter (toUpperCase() lub toLowerCase())

    }

}
