package BAI1;

public class CanBo {
    private String hoTen;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;

    public CanBo(String hoTen, int tuoi, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }
    public void display() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Giới Tính: " + gioiTinh);
        System.out.println("Địa chỉ: " + diaChi);
    }
}
