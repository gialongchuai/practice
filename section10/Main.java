public class Main {
    public static void main(String[] args) {
        Person.PersonInner p = new Person.PersonInner();
        p.name = "word";
        Person.PersonInner p1 = new Person.PersonInner();
        System.out.println(p1.name);
        System.out.println(p.name);

        /// Non-static field 'address' cannot be referenced from a static context
        /// System.out.println(Person.address);
        /// Lỗi trên do static class thuộc về class nên khi tạo đối tuongn
        /// nên khi tạo đối tượng thì static class đó được tạo chứ Person ngoài
        /// chưa được tạo nên biến instance field đó thuộc về đối tượng Person cho mỗi instance nên lỗi .
        ///  do chưa hề có 1 đối tượng person cụ thể được tạo ra
        Person p2 = new Person();
        p2.say();
        Person.thue = 2; /// thuế thay đổi do static class dùng cho mọi đối tượng
//        Person.address = "def";
        Person p4 = new Person();
        p4.say();
    }
}
