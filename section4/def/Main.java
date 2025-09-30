package def;

import abc.Person;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
//        System.out.println(p.nameProtected); // loi : khac package
    }

    void info() {
        Person p = new Person();
//        System.out.println(p.ten);
    }
}
