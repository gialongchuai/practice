import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {

        // Public class Person -> Đó là mã nguồn (source code).
        //Khi bạn biên dịch → thành file .class (bytecode).
        //Khi bạn chạy chương trình, JVM nạp (load) class Person vào bộ nhớ.
        //
        //Lúc này, JVM tạo ra một object đặc biệt để đại diện cho class Car trong bộ nhớ.
        //Object đó có kiểu là java.lang.Class<Person>.

        try {
            Class<Person> cls = Person.class;
            Constructor<Person> constructor = cls.getConstructor(String.class, String.class);
            Person person = constructor.newInstance("Nguyen Van", "A");
            System.out.println(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
