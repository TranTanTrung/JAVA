package BAI1;

public class congNhan extends CanBo{
    private int capCongNhan;
    public congNhan(String hoTen, int tuoi, String gioiTinh, String diaChi, int capCongNhan) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.capCongNhan = capCongNhan;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Cấp công nhân: " + capCongNhan);
    }
}
