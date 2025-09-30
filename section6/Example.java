import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example {
    public static void ss() {

        Person p1 = new Person(3,"Nguyen van a", 19);
        Person p2 = new Person(3,"Nguyen Van A", 19);

        System.out.println(p1 == p2); /// false : 2 đối tượng khác nhau (so sánh tham chiếu đối tượng)
        System.out.println("so sanh equals: " + p1.equals(p2)); /// false do so sánh 2 giá trị trực tiếp khác nhau của 2 object
        System.out.println("so sanh equals: " + p1.equals(p2)); /// true nếu đã override so sánh các trường (field)
        ///  dựa vào id của đối đượng mà override để so sánh

        Set<Person> s = new HashSet<>(); ///
        s.add(p1);
        s.add(p2);
        System.out.println(s.size()); /// 2 do chưa override hashCode
        System.out.println(s.size()); /// 1 do đã override hashCode của các field

        ///  lưu vào set dựa và hashCode của id (đã được override)
    }


    List<Integer> list = new ArrayList<>(); /// list: instance variable
    ///  list nằm trong heap do thuộc về Example

    public void infor() {
        List<String> list1 = new ArrayList<>(); /// local variable
        ///  list1 nằm trong stack , biến cục bộ ko thuộc
        /// Example chỉ hữu dụng trong scope method infor

        list.add(Integer.valueOf(100)); /// 2 dòng trên dưới y chang do autoboxing

        list.add(200); /// 100 200 là Integer cũng nằm trong Heap nốt do Wrapper class
    }

    ///  2 ông ArrayList nằm trong Heap do là đối tượng được tạo mới

    public static void main(String[] args) {
        ss();

        String[] names = {new String("Hello world"),  new String("Hello world")};
        System.out.println(names[0] == names[1]); /// false do tạo 2 đối tượng khác nhau trong heap

        String[] names_copy = {("Hello world"),("Hello world")};
        System.out.println(names_copy[0] == names_copy[1]); /// true do
                    /// Java tự động lưu các String literal vào
                    /// vùng nhớ đặc biệt gọi là String Pool (nằm trong heap từ Java 7+).
        ///  đối với kiểu wrapper còn equals thì so sánh giá trị trực tiếp
        ///  thay vì == so sánh tham chiếu đối tượng

        int[] age = {30, 30, 40}; /// do là kiểu nguyên thủy nên chỉ có
        ///  1 cách so sánh duy nhất là so sánh giá trị trực tiếp
        System.out.println(age[0] == age[1]); /// true

        System.out.println("=============================");

        String a = "Hello";
        String b = "Hello";
        String c = new String("Hello");

        System.out.println(a == b);        /// true (cùng String Pool)
        System.out.println(a == c);        /// false (c là đối tượng mới)
        System.out.println(a.equals(c));   /// true (nội dung giống nhau)

        /// Integer p = new Integer(10);
        /// 'Integer(int)' is deprecated since version 9 and marked for removal

        Integer x = 100;
        Integer y = 100;
        Integer z = 200;
        Integer t = 200;

        System.out.println(x == y);  /// true (do caching -128 → 127)
        System.out.println(z == t);  /// false (ngoài phạm vi cache → tạo object mới)
        System.out.println(z.equals(t)); /// true (so sánh giá trị)

        ///   Lưu ý: Integer có Integer Cache cho giá trị từ
        /// -128 đến 127, nên == đôi khi "ăn may" ra true, nhưng không nên dựa vào điều đó!
    }
}
