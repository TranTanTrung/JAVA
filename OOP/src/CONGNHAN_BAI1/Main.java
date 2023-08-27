package BAI1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*Bài 1
Một đơn vị sản xuất gồm có các cán bộ là công nhân, kỹ sư, nhân viên. Mỗi cán bộ cần quản lý các dữ liệu: Họ tên, tuổi, giới tính(name, nữ, khác), địa chỉ.
 • Cấp công nhân sẽ có thêm các thuộc tính riêng: Bậc (1 đến 10).
 • Cấp kỹ sư có thuộc tính riêng: Nghành đào tạo.
 • Các nhân viên có thuộc tính riêng: công việc.
Yêu cầu 1: Xây dựng các lớp CongNhan, KySu, NhanVien kế thừa từ lớp CanBo.
Yêu cầu 2: Xây dựng lớp QLCB(quản lý cán bộ) cài đặt các phương thức thực hiện các chức năng sau:
 • Thêm mới cán bộ.
 • Tìm kiếm theo họ tên.
 • Hiện thị thông tin về danh sách các cán bộ.
 • Thoát khỏi chương trình.*/

        Scanner scanner = new Scanner(System.in);
        QLCB qlcb = new QLCB();

        while (true) {
            System.out.println("1. Thêm cán bộ mới.");
            System.out.println("2. Tìm kiếm theo họ tên.");
            System.out.println("3. Hiện danh sách các cán bộ.");
            System.out.println("4. Thoát khỏi chương trình.");
            System.out.print("Mời bạn chọn chức năng hệ thống: ");

            int chucNang = scanner.nextInt();
            scanner.nextLine();

            switch (chucNang) {
                case 1:
                    System.out.println("Nhập loại cán bộ (1. Công nhân, 2. Kỹ Sư, 3. Nhân viên): ");
                    int loaiCanBo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Mời bạn nhập họ tên: ");
                    String hoTen = scanner.nextLine();
                    System.out.print("Mời bạn nhập tuổi: ");
                    int tuoi = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Mời bạn nhập giới tính: ");
                    String gioiTinh = scanner.nextLine();
                    System.out.print("Mời bạn nhập địa chỉ: ");
                    String diaChi = scanner.nextLine();

                    if(loaiCanBo==1){
                        System.out.print("Mời bạn nhập cấp công nhân: ");
                        int capCongNhan = scanner.nextInt();
                        congNhan congNhan = new congNhan(hoTen, tuoi, gioiTinh, diaChi, capCongNhan);
                        qlcb.themCanBo(congNhan);
                    } else if (loaiCanBo==2) {
                        System.out.print("Mời bạn nhập ngành đạo tạo: ");
                        String nganhDaoTao = scanner.nextLine();
                        kySu kySu = new kySu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao);
                        qlcb.themCanBo(kySu);
                    } else if (loaiCanBo==3) {
                        System.out.print("Mời bạn nhập công việc: ");
                        String congViec = scanner.nextLine();
                        nhanVien nhanVien = new nhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec);
                        qlcb.themCanBo(nhanVien);
                    } else {
                        System.out.println("Không có loại cán bộ này!!!");
                        System.exit(0);
                    }

                    break;
                case 2:
                    System.out.print("Mới bạn nhập họ tên cán bộ cần tìm: ");
                    String hoTenCanBoCanTim = scanner.nextLine();
                    qlcb.timCanBoTheoHoTen(hoTenCanBoCanTim);
                    break;
                case 3:
                    qlcb.hienDanhSachCanBo();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Hệ thống không có chức năng này???");
                    System.exit(0);
            }
        }
    }
}
