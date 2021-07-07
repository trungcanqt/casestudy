package casestudy;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

    }
    public static void menuMain(){
        System.out.println("1. Thông tin tài khoản");
        System.out.println("2. Quản lý phòng");
        System.out.println("3. Quản lý hóa đơn");
        System.out.println("4. Thống kê doanh thu");

    }
    public static void menuQLPhong(){
        System.out.println("1. Danh sách phòng");
        System.out.println("2. Chọn phòng theo giá");
        System.out.println("3. Kiểm tra phòng");
    }
    public static void menuQLHoaDon(){

    }
    public static void menuThongKeDoanhThu(){
        System.out.println("1. Danh sách  hóa đơn");
        System.out.println("2. Tạo hóa đơn");
        System.out.println("3. Sửa hóa đơn theo ID");
    }
}
