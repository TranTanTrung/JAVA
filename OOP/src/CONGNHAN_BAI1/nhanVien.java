package BAI1;

public class nhanVien extends CanBo{
    private String congViec;

    public nhanVien(String hoTen, int tuoi, String gioiTinh, String diaChi, String congViec) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Công Việc: " + congViec);
    }
}
