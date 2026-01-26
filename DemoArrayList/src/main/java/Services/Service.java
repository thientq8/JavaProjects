/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Models.Book;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Service {

    public ArrayList<Book> ds_book = new ArrayList<>();

    public Service(ArrayList<Book> ds_book) {
        this.ds_book = ds_book;
    }

    public Service() {
    }

    public ArrayList<Book> getDs_book() {
        return ds_book;
    }

    public void setDs_book(ArrayList<Book> ds_book) {
        this.ds_book = ds_book;
    }

    public void Nhap(Scanner scan) {
        Book book = new Book();
        System.out.println("Nhập ID: ");
        book.setID(scan.nextLine());
        System.out.println("Nhập Name: ");
        book.setName(scan.nextLine());
        System.out.println("Nhập Author: ");
        book.setAuthor(scan.nextLine());
        System.out.println("Nhập Year: ");
        book.setYear(Integer.parseInt(scan.nextLine()));
        this.ds_book.add(book);

    }

    public void XuatBook(Book b) {
        System.out.println("ID: " + b.getID());
        System.out.println("Name: " + b.getName());
        System.out.println("Author: " + b.getAuthor());
        System.out.println("Year: " + b.getYear());
    }

    public int TimKiem(String ID) {
        for (Book b : this.ds_book) {
            if (b.getID().equalsIgnoreCase(ID)) {
                b.printThongtin();
                return this.ds_book.indexOf(b);
            }
        }
        System.out.println("Không tìm thấy ID sách " + ID);
        return -1;// Không tìm thấy
    }

    public int XoaSach(String ID) {
        int vitriSach = -1;
        vitriSach = this.TimKiem(ID);
        if (vitriSach >= 0) {
            this.ds_book.remove(vitriSach);
            System.out.println("Đã xoá thông tin sách ID: " + ID);
        }
        return vitriSach;
    }

    public void Xuat() {
        for (Book b : this.ds_book) {
            System.out.println("ID: " + b.getID());
            System.out.println("Name: " + b.getName());
            System.out.println("Author: " + b.getAuthor());
            System.out.println("Year: " + b.getYear());
        }
    }

    ;
    
    public int Tim(String ID) {
        for (Book b : ds_book) {
            if (b.getID().equalsIgnoreCase(ID)) {
                b.printThongtin();
                return ds_book.indexOf(b);
            }
        }
        return -1;
    }

    public int Xoa(String ID) {
        int position = this.Tim(ID);
        if (position > 0) {
            ds_book.remove(position);
            return 1;
        } else {
            System.out.println("Không tìm thấy thông tin ID " + ID);
        }
        return -1;
    }

    public void EditName(Book b) {
        // Thay đổi thông tin sách tìm thấy trong ds_book
    }

    public void EditAuthor(String BookID) {
        // Thay đổi thông tin sách tìm thấy trong ds_book;
    }
}
