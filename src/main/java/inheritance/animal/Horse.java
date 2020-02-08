package inheritance.animal;

public class Horse extends Animal {

    private int rating;

    public Horse(String name, int age, int rating) {
        super(name, age);
        this.rating = rating;
    }

    @Override
    public void voice() {
        System.out.println("Horse" + getName() + " says: Ihahaha!!!");
        System.out.println("");
    }

    public void ride(int speed) {
        System.out.println("Hourse " + getName() + " rides width " + speed + " km/h");
    }


}
