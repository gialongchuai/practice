public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(System.getProperty("java.version"));     // phiên bản Java
        System.out.println(System.getProperty("java.vendor"));      // nhà cung cấp JVM
        System.out.println(System.getProperty("java.vm.name"));     // tên JVM (HotSpot/OpenJ9…)
        System.out.println(System.getProperty("java.home"));        // thư mục JVM
//        17.0.12
//        Oracle Corporation
//        Java HotSpot(TM) 64-Bit Server VM
//        C:\Program Files\Java\jdk-17

    }
}
