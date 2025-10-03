public class Monkey extends Animal{
    public Monkey() {
        System.out.println("Monkey");
    }

    public Monkey(Monkey oth) {

    }

    public Monkey(String name) {
        ///  Animal: Ton Ngo Khong -> output mong đợi có tham số ở cha
        ///  nếu muốn tham số phải viết thêm super khởi tạo tham số cho cha;
///        super(name);
        System.out.println("Monkey: " + name);
    }

    public void makeSound() {
        System.out.println("Monkey: ét ét");
    }

    public Monkey clone() {
        return new Monkey(this);
    }
}
