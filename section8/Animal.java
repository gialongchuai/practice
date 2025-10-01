public abstract class Animal {
    protected String name; /// thuộc tính chung cho tất cả animal
    /// nên là protected thể hiện tính kế thừa ở lớp con và lớp con có thể truy cập được

    public Animal(String name) {
        this.name = name;
    }

    public void ngu() {
        System.out.println(name + " dang ngu");
    }

    abstract void phatTiengKeu();
}
