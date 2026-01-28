/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Views;

import Services.*;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class View {

    public static Scanner scan = new Scanner(System.in);
    public static Service service = new Service();

    public static void main(String[] args) {
        service = new Service();
        while (true) {
            System.out.println("1. Nhập");
            System.out.println("2. Xuất thông tin");
            System.out.println("3. Tìm kiếm");
            System.out.println("4. Xóa");
            System.out.println("5. Chỉnh sửa thông tin");
            System.out.println("0. Thoát chương trình");
            System.out.println("Vui lòng nhập giá trị cần làm"
                    + ": ");
            int option = 0;
            option = Integer.parseInt(scan.nextLine());
            switch (option) {
                case 1 -> {
                    service.Nhap(scan);
                }
                case 2 ->
                    service.Xuat();
                case 3 ->
                    service.TimKiem(scan);
                case 4 ->
                    service.Xoa(scan);
                case 5 ->
                    service.Update(scan);
                case 0 -> {
                    System.out.print("Đang thoát chương trình");
                    System.exit(0);
                }
                default ->
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
