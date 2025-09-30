public class Person implements SampleInterface01, SampleInterface02 {
    String name;
    Integer age;

    public static Integer salary = 15;

    public Person() {
    }

    public Person(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public void say() {
        System.out.println("Xin chao");
    }

    // Khong dc phep override do static method
//    @Override
//    public void say3() {
//        System.out.println("Xin chao");
//    }

    @Override
    public void say4() {
        System.out.println("say 04");
    }

    @Override
    public void say5() {
        System.out.println("say 05");
    }
}
