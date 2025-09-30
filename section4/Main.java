public class Main {
    public static void main(String[] args) {
        System.out.println(MyClass.CONS);
        System.out.println(MyClass.staticField);

        MyClass myClass = new MyClass();
        System.out.println(myClass.defaultField);
        System.out.println(myClass.finalField);
//        System.out.println(myClass.instanceField); // private : chi tiep can dc trong cung 1 class
    }
}
