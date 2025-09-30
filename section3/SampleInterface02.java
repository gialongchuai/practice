public interface SampleInterface02 {
    String name = "Nguyen Van A";

    void say();

    default void say5() {
        System.out.println("xin chao");
    }
}
