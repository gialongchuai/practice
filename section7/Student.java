import java.math.BigDecimal;

public class Student {
    private int id_pri;
    private Integer id_wra;

    private boolean trangThai_pri;
    private Boolean trangThai_wra;

    public BigDecimal soTien;

    private double diem_pri;
    private Double diem_wra;

    private long sbd_pri;
    private Long sbd_wra;

    public boolean getTrangThai_pri() {
        return trangThai_pri;
    }

    public void setTrangThai_pri(boolean trangThai_pri) {
        this.trangThai_pri = trangThai_pri;
    }

    public Boolean getTrangThai_wra() {
        return trangThai_wra;
    }

    public void setTrangThai_wra(Boolean trangThai_wra) {
        this.trangThai_wra = trangThai_wra;
    }

    public int getId_pri() {
        return id_pri;
    }

    public void setId_pri(int id_pri) {
        this.id_pri = id_pri;
    }

    public Integer getId_wra() {
        return id_wra;
    }

    public void setId_wra(Integer id_wra) {
        this.id_wra = id_wra;
    }

    public long getSbd_pri() {
        return sbd_pri;
    }

    public void setSbd_pri(long sbd_pri) {
        this.sbd_pri = sbd_pri;
    }

    public Long getSbd_wra() {
        return sbd_wra;
    }

    public void setSbd_wra(Long sbd_wra) {
        this.sbd_wra = sbd_wra;
    }

    public double getDiem_pri() {
        return diem_pri;
    }

    public void setDiem_pri(double diem_pri) {
        this.diem_pri = diem_pri;
    }

    public Double getDiem_wra() {
        return diem_wra;
    }

    public void setDiem_wra(Double diem_wra) {
        this.diem_wra = diem_wra;
    }
}
