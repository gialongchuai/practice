package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
///  kiểu collection được override equals, toString
    public static void main(String[] args) {
        test6();
    }

    public static void test8() {
        Integer[] arr1 = {1000, 100};
        Integer[] arr2 = {1000, 100};

        System.out.println(arr1 == arr2); /// false : so sánh 2 tham chiếu bộ nhớ (tham chiếu đối tượng) khác nhau
        System.out.println(arr1.equals(arr2)); /// false : không dc override nên equals với == giống nhau

        System.out.println(arr1[0] == arr2[0]); ///  false : ngoài phạm vi cache Integer
        System.out.println(arr1[0].equals(arr2[0])); /// true : so sánh giá trị trực tiếp
    }

    public static void test7() {
        String[] arr1 = {"hello world", "abc"};
        String[] arr2 = {"hello world", "abc"};

        System.out.println(arr1 == arr2); /// false : so sánh 2 tham chiếu bộ nhớ (tham chiếu đối tượng) khác nhau
        System.out.println(arr1.equals(arr2)); /// false : không dc override nên equals với == giống nhau

        System.out.println(arr1[0] == arr2[0]); ///  true : String pool
        System.out.println(arr1[0].equals(arr2[0])); /// true : so sánh giá trị trực tiếp
    }

    public static void test6() {
        List<String> list1 = new ArrayList<>();
        list1.add("hello world");
        list1.add("xin chao");

        List<String> list2 = new ArrayList<>();
        list2.add("hello world");
        list2.add(new String("xin chao"));

        System.out.println(list1.get(1) == list2.get(1)); /// false : 1 cái nằm trong
        ///  String pool, 1 cái object mới

        System.out.println(list1.get(1).equals(list2.get(1))); /// true: so sánh giá trị trực tiếp

        System.out.println(list1.equals(list2)); ///  true : so sánh equals từng index
    }

    public static void test5() {
        List<String> list1 = new ArrayList<>();
        list1.add("hello world");
        list1.add("xin chao");

        List<String> list2 = new ArrayList<>();
        list2.add("hello world");
        list2.add("xin chao");

        System.out.println(list1 == list2); /// false : 2 đối tượng khác nhau
        System.out.println(list1.equals(list2)); /// true : được override equals từ ArrayList
                                ///  so sánh từng giá trị trực tiếp

        System.out.println(list1.get(0) == list2.get(0)); /// true: cùng trỏ tới đối tượng trong String Pool
        System.out.println(list1.get(0).equals(list2.get(0))); /// true: cùng giá trị trực tiếp

    }

    public static void test4() {
        Integer[] arr1 = {128,127,4};
        Integer[] arr2 = {128,127,4};

        System.out.println(arr1[0] == arr2[0]); /// false do nằm ngoài phạm vi cache của Integer
        System.out.println(arr1[1] == arr2[1]);/// true -128 -> 127

        System.out.println(arr1.equals(arr2)); /// false : 2 đối tuong khác nhau

        System.out.println(arr1[0].equals(arr2[0])); /// true do cùng giá trị trực tiếp

    }

    public static void test3() {
        Integer[] arr1 = {3,4,2,5}; /// autoboxing Integer.valueOf(3,4,2,5);
        Integer[] arr2 = {3,4,2,5};

        System.out.println(arr1 == arr2); /// false: 2 đối tượng khác nhau;
        System.out.println(arr1.equals(arr2)); /// false do mảng không được Object override equals

        System.out.println(Arrays.equals(arr1, arr2)); /// true do so sánh cùng nội dung trong mảng
    }

    public static void tets2() {
        int[] arr1 = {3,2,4,2};
        int[] arr2 = {3,2,4,2};
        System.out.println(arr1 == arr2); /// false : 2 đối tượng khác nhau
        System.out.println(arr1.equals(arr2)); /// false : kiểu primitive không hỡ trợ equals
        ///  so sánh nó như so sánh == vậy, tham chiếu bộ nhớ (địa chỉ của đối tượng)
        System.out.println(Arrays.equals(arr1, arr2)); /// true so sánh nội dung trong 2 mảng
        ///  không hỗ trợ equals cho việc so sánh dữ liệu kiểu primitive
        System.out.println(arr1[0] == arr2[0]); /// true so sánh giá trị trực tiếp

    }

    public static void test1() {
        List<Integer> list1 = new ArrayList();
        list1.add(100);
        List<Integer> list2 = new ArrayList();
        list2.add(100);

        System.out.println(list1.get(0) == list2.get(0)); /// true: phạm vi Integer cache

        List<Integer> list12 = new ArrayList();
        list12.add(1000);
        List<Integer> list22 = new ArrayList();
        list22.add(1000);

        System.out.println(list12.get(0) == list22.get(0)); /// false : ngoài phạm vi Integer cache
    }


}
