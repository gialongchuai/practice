package def;
import abc.Person;

public class ClassConKhacPackage extends Person {

    String name2 = nameProtected;

    void info() {
        System.out.println(nameProtected);
    }
}
