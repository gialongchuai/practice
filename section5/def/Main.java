package def;

import abc.Cow;

public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow();
//        cow.age = 2;
        ///  age măc định là default chỉ dùng trong class đó hoặc trong cùng 1 package;

        Integer[] a = new Integer[10];

        a[4] = 10;
        System.out.println(a[4] == 10);

        Integer x = 100;
        Integer y = 100;
        System.out.println(x == y); /// true nằm trong phạm vi cache của Integer
                        ///  -128 -> 127 (Integer.valueOf())
        Integer x1 = 1000;
        Integer x2 = 1000;
        System.out.println(x1 == x2); /// false nằm ngoài phạm vi cache của Integer
    }
}
