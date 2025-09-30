package abc;

public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.age = 2;

        Cow cow2 = new Cow();
        cow2 = cow;
        System.out.println(cow == cow2); /// 2 chuỗi bit (tham chiếu đối tượng) giống nhau đang
                                ///  trỏ tới cùng 1 đối tượng

        Cow cow3 = new Cow();
        System.out.println(cow == cow3); /// 2 chuỗi bit tham chiếu đối tượng khác nhau
                                ///  trỏ tới 2 đối tượng khác nhau

        /// biến tham chiếu đối tượng cow, cow2, cow3 nằm trong stack
        ///  đối tượng được cow, cow2, cow3 được tạo bằng new Cow()
        /// nằm trong heap

        ///  lúc đầu new Cow() từ 2 được tạo ra trong heap nhưng do gán cow2 = cow
        ///  thay đổi chuỗi bit cow2 giống cow 1 trỏ tới chug 1 đứa từ cow1
        ///  garage colector thu gom đối tượng không còn được trỏ từ cow2 nữa ...

        ///  age dùng được do cùng 1 package
    }
}
