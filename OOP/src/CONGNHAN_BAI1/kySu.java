package BAI1;

public class kySu extends CanBo{
    private String nganhDaoTao;

    public kySu(String hoTen, int tuoi, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Ngành đào tạo: " + nganhDaoTao);
    }

}
