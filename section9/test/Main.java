package test;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Animal cat1 = new Cat();
        Animal cat2 = new Cat();
        HashSet<Animal> treeSet = new TreeSet<>(); /// error ko lỗi nếu dùng hashset và linkedhashset
        treeSet.add(cat1);
        treeSet.add(cat2);
        /// chỉ có TreeSet và TreeMap là
        /// Cần Comparable hoặc Comparator để biết so sánh gì mà sắp xếp

///        Exception in thread "main" java.lang.ClassCastException: class test.Cat cannot be cast to class java.lang.Comparable (test.Cat is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
///        at java.base/java.util.TreeMap.compare(TreeMap.java:1569)
///        at java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:776)
///        at java.base/java.util.TreeMap.put(TreeMap.java:785)
///        at java.base/java.util.TreeMap.put(TreeMap.java:534)
///        at java.base/java.util.TreeSet.add(TreeSet.java:255)
///        at test.Main.main(Main.java:10)


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
