package BAI1;

import java.util.ArrayList;

public class QLCB {
    private ArrayList<CanBo> danhSachCanBo;

    public QLCB() {
        danhSachCanBo = new ArrayList<>();
    }

    public QLCB(ArrayList<CanBo> danhSachCanBo) {
        this.danhSachCanBo = danhSachCanBo;
    }
    public void themCanBo (CanBo canBo) {
        danhSachCanBo.add(canBo);
        System.out.println("Thêm cán bộ thành công!!!");
    }
    public void hienDanhSachCanBo(){
        if(danhSachCanBo.isEmpty()){
            System.out.println("Danh sách cán bộ trống");
        } else {
            for(CanBo canBo: danhSachCanBo){
                canBo.display();
                System.out.println("============================");
            }
        }
    }
    public void timCanBoTheoHoTen(String hoTen) {
        boolean found = false;
        for(CanBo canBo: danhSachCanBo){
            if(canBo.getHoTen().equalsIgnoreCase(hoTen)){
                canBo.display();
                found=true;
            }
        }
        if(!found){
            System.out.println("Không tìm thấy cán bộ với h tên: " + hoTen);
        }
    }
}
