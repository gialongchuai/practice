public class Main {
    public static void main(String[] args) {
        // Cant change
        // SampleInterface01.name_01 = "def"; -> error : Cannot assign a value to final variable 'name_01'

        System.out.println(SampleInterface01.name);
        System.out.println(SampleInterface01.name_01);
        System.out.println(SampleInterface02.name);

        Person p = new Person();
        p.say();

        p.say4();
        p.say5();

        // call static method
        SampleInterface01.say3();

//        Person.salary = 18;
        System.out.println(p.salary);
    }

}
