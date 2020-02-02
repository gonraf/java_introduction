package classes.basics;

public class Test {

    public static void main(String[] args) {
        String nazwisko = "Kowalski";
        User adam = new User( "Adam", nazwisko, 45);
        //adam.name = "Adam";
        //adam.lastname = "Kowalski";
        //adam.age = 36;
        System.out.println(adam.name);
        System.out.println(adam.lastname);
        System.out.println(adam.age);

        User jozek = new User( "Józek", "Nowak", 34);
        //jozek.name = "Józek";
        //jozek.lastname = "Nowak";
        //jozek.age = 42;
        jozek.introduce();

        User cloneJozek = new User(jozek);
        cloneJozek.introduce();
        cloneJozek.name = "Robert";
        cloneJozek.introduce();

        System.out.println("Józek:" + jozek + ", Robert:" +cloneJozek);
    }
}
