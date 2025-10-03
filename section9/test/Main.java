package test;

public class Main {
    public static void main(String[] args) {
        Animal cat1 = new Cat();
        Animal cat2 = new Cat();
        System.out.println(cat1 == cat2); /// false
        /// Cat = class (khuôn mẫu) → có thể tạo vô số object.
        ///
        /// new Cat(...) mỗi lần = một object mới, duy nhất (có địa chỉ riêng).

        cat1 = cat2;
        System.out.println(cat1 == cat2); /// true
        /// cat1 cat2 cùng trỏ cùng 1 đối tượng
        ///  đối tượng cat1 trỏ ban đầu không dùng nữa -> Garage Collector thua gom đối tượng
        /// không dùng đến
    }
}
