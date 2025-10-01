public class Tiger extends Animal{
    private String coBap; /// thuộc tính riêng của hổ
    public Tiger(String name, String coBap) {
        super(name);
        this.coBap = coBap;
    }

    @Override
    public void phatTiengKeu() {
        System.out.println(name + " dang keu gầm gừ!");
    }

    public String getCoBap() {
        return coBap;
    }

    public void setCoBap(String coBap) {
        this.coBap = coBap;
    }
}
