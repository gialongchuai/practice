public class Person {
    public String address = "abc";
    public static Integer thue = 1;

    public void say() {
        System.out.println(address);
        System.out.println(thue);
    }

    public static class PersonInner {
        static String name = "Hello";
    }
}
