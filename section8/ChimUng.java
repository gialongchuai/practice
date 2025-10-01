public class ChimUng extends Animal implements IFly {
    private String doiCanh;

    public ChimUng(String name, String doiCanh) {
        super(name);
        this.doiCanh = doiCanh;
    }

    @Override
    public void phatTiengKeu() {
        System.out.println(name + " dang keu ét ét!");
    }

    @Override
    public void bay() {
        System.out.println(name + " dang bay bang doi canh!");
    }

    public String getDoiCanh() {
        return doiCanh;
    }

    public void setDoiCanh(String doiCanh) {
        this.doiCanh = doiCanh;
    }
}
