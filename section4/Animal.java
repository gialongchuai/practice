abstract class Animal {
    protected String name;

    // Constructor của lớp abstract
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called");
    }

    public abstract void makeSound();
}

class Dog extends Animal {
    public Dog(String name) {
        super(name); // Gọi constructor của lớp cha (Animal)
        System.out.println("Dog constructor called");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}

//public class Main {
//    public static void main(String[] args) {
//        // Animal a = new Animal("Lucky"); // ❌ Lỗi: không thể khởi tạo lớp abstract
//
//        Dog d = new Dog("Buddy"); // ✅ OK
//        d.makeSound();
//    }
//}

//Animal constructor called
//Dog constructor called
//Buddy says: Woof!