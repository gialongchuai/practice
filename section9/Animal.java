public class Animal {
    public Animal(){
        System.out.println("Animal");
    }

    public Animal(String name) {
        System.out.println("Animal: " + name);
    }

    public Animal(Animal a) {};

    public void makeSound() {
        System.out.println("hur");
    }
}
