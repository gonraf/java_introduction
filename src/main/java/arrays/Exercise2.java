package arrays;

public class Exercise2 {

    public static void main(String[] args) {
        String [] names = new String [] {
                "Ala",
                "Ola",
                "Andrzej",
                "Bożydar",
                "Gniewomir",
                "Mścisław",
                "Wiercisław",
                "Sławomir",
                "Petronela",
                "Kunegunda",
        };
        /*
        Zad 1 wypisz imiona żeńskie
        Zad 2 wypisz imiona żeńskie nie dłuższe niż 3 znaki
        Zad 3 Wypisz imiona słowiańskie (kończą się na "sław" lub "mir")
        Zad 4 Znajdź najdłuższe imię
         */
        // zad 1
        System.out.println("Zad 1");
        for (String name : names) {
            if (name.endsWith("a")) {
                System.out.println(name);
            }
        }

        // zad 2
        System.out.println(" ");
        System.out.println("Zad 2");
        for (String name : names) {
            if (name.length() <= 3) {
                System.out.println(name);
            }
        }

        // zad 3
        System.out.println("");
        System.out.println("Zad 3");
        for (String name : names) {
            if (name.endsWith("sław") || name.endsWith("mir")) {
                System.out.println(name);
            }
        }

        // zad 4
        System.out.println(" ");
        System.out.println("Zad 4");
        int longest = 0;
        String longestName = names[0];
        for ( int i =0; i< names.length; i++) {
            if (names[i].length() > longest) {
                longest=names[i].length();
                longestName = names [i] ;
            }
            System.out.println(names[i] + " : " + names[i].length());
        }
        System.out.print("Najdłuższe imię to: " + longestName +" ");
        System.out.print(longest);


    }
}
