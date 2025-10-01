public class Main {
        ///        0
        ///        null

///        false
///        null

///        0.0
///        null

///        0
///        null

/**
 * Lưu ý về kiểu dữ liệu trong Entity:
 * - Ưu tiên sử dụng Wrapper class (Long, Integer, Boolean, BigDecimal, v.v.) thay vì primitive.
 * - Lý do:
 *   + Cho phép biểu diễn trạng thái "chưa xác định" hoặc "chưa được thiết lập" bằng `null`.
 *   + Tránh nhầm lẫn giữa giá trị mặc định (0, false) và dữ liệu thực sự chưa có.
 *   + Tương thích tốt với Spring Data JPA (ví dụ: `id = null` → entity mới; `id = 0` → hiểu nhầm là đã tồn tại).
 *   + Jackson xử lý JSON linh hoạt hơn khi field bị thiếu (gán `null` thay vì ép giá trị mặc định).
 * - Chỉ dùng primitive khi field luôn có giá trị và business rule không cho phép trạng thái "chưa biết"
 *   (trường hợp này rất hiếm trong hệ thống e-commerce).
 */
    public static void main(String[] args) {
        Student student = new Student();

        System.out.println(student.getId_pri());
        System.out.println(student.getId_wra());

        System.out.println(student.getTrangThai_pri());
        System.out.println(student.getTrangThai_wra());

        System.out.println(student.getDiem_pri());
        System.out.println(student.getDiem_wra());

        System.out.println(student.getSbd_pri());
        System.out.println(student.getSbd_wra());

        System.out.println(student.soTien);
    }
}
