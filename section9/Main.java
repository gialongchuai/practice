import java.awt.desktop.AboutHandler;

public class Main {
    public static void main(String[] args) {
//        Person p = new Person();
///        hello 1
///        hello 2
///        constructor

        /// Animal
        /// Monkey
        Monkey m = new Monkey();

        ///  Animal -> mặc định gọi super không tham số của lớp cha
        ///  Monkey: Ton Ngo Khong
        System.out.println("===========");
        Monkey monkey = new Monkey("Ton Ngo Khong");
        System.out.println("=========");
        Dog dog1 = new Dog();
        Dog dog2 = new Dog(dog1); /// copy object
        System.out.println(dog1.equals(dog2)); /// true

        System.out.println("=======");
        Monkey a = new Monkey();
        a.makeSound(); /// Monkey: ét ét : ouput mong đợi
        Animal b = new Animal(a); /// nhưng output dòng dưới : "hur" không phải Monkey
        b.makeSound(); /// mong muốn rằng Animal nhận Monkey thì ra Monkey

        Animal c = a.clone();
        c.makeSound(); /// output mong đợi : Monkey
    }
}
///        hello 1 : khối static work thì 1 class extends nó
///public class Main extends Persom {
///    public static void main(String[] args) {
            ///
///    }
///}
