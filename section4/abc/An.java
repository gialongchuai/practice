package abc;

public class An{
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.nameProtected); // ac do cung package

        System.out.println(p.ten);
    }
    void info() {
        Person p = new Person();
        System.out.println(p.ten);
    }
}
