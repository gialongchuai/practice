import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Lino", "Co bap cuon cuon");
        tiger.phatTiengKeu();
        tiger.ngu();
        System.out.println(tiger.getCoBap());

        System.out.println("=========");

        ChimUng chimUng = new ChimUng("Con meo ung", "Doi canh to khoe, mau trang");
        chimUng.phatTiengKeu();
        chimUng.ngu();
        System.out.println(chimUng.getDoiCanh());

//        List<Animal> animals = new ArrayList<>();
//        animals.add(tiger);
//        animals.add(chimUng);

        ///  do có nhiều đối tượng như Chim ưng và Máy bay đêu có thể bay nên tạo ra interface
        ///  rõ ràng Chim ưng và Máy bay có thể bay nhưng không thể extends đối tượng Cha nào cả
        ///  interface hỗ trợ hành vi bay
        System.out.println("========");
        chimUng.bay();

        MayBay mayBay = new MayBay("E Lai");
        mayBay.bay();
    }
}
