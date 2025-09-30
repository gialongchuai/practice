public class MyClass {
    private String instanceField;
    public static String staticField;
    public final String finalField = "final String field";
    public static final String CONS = "static final String";

    String defaultField;

    static {
        System.out.println("Hello world static!");
    }

}
