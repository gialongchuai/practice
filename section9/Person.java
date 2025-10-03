public class Person {

    /// third
    public Person() {
        System.out.println("constructor");
    }

    { /// second
        System.out.println("hello 2");
    }

    static { ///  first
        System.out.println("hello 1");
    }
}
