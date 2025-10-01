public class MayBay implements IFly {
    private String name;

    public MayBay(String name) {
        this.name = name;
    }

    @Override
    public void bay() {
        System.out.println(this.name + " dang bay voi dong co cuc manh!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
