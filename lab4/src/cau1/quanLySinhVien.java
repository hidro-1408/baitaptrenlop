/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

/**
 *
 * @author CNTT
 */
public class quanLySinhVien {

    private ArrayList<sinhVien> dssv;

    public quanLySinhVien() {
        this.dssv = new ArrayList<>();
    }

    public void themSinhVien() {
        sinhVien sv = new sinhVien();
        sv.nhap();
        dssv.add(sv);
    }

    public int soLuongSv() {
        return dssv.size();
    }

    public void timKiemSinhVienTheoLop(String lop) {
        boolean kiemTra = false;
        for (sinhVien object : dssv) {
            if (object.getLop().equalsIgnoreCase(lop)) {
                object.xuat();
                kiemTra = true;
            }
        }

        if (kiemTra == false) {
            System.out.print("Khong co sinh vien nao hoc lop: " + lop + "\n");
        }
    }

    public void suaSinhVien(String massv) {
        for (sinhVien object : dssv) {
            if (object.getMassv().equals(massv)) {
                System.out.print("----------------Dang sua thong tin sinh vien co ma sinh vien: " + massv + "-----------------------------\n");
                object.nhap();
                System.out.print("sua thanh cong! ");
            }
        }
    }

    public void xoaSinhVien(String masv) {
        boolean kiemTra = false;
       Iterator<sinhVien> iterator = dssv.iterator();
        while(iterator.hasNext()){
         sinhVien object = iterator.next();
            if (object.getMassv().equals(masv)) {
                iterator.remove();
                kiemTra = true;
                System.out.println("-------da xoa thanh cong sinh vien co ma:" + masv + "----------------------\n");
               break;
            }
        }
        if (kiemTra==false) {
            System.out.println("-----------------------xoa that bai------------------\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        quanLySinhVien qlsv = new quanLySinhVien();
        while (true) {
            System.out.println("------------------MeNu---------------------");
            System.out.println("------------1.Them sinh vien---------------");
            System.out.println("------------2.Sua sinh vien----------------");
            System.out.println("------------3.Xoa sinh vien----------------");
            System.out.println("------4.Kiem tra so luong sinh vien--------");
            System.out.println("---------5.xuat sinh vien theo lop---------");
            System.out.println(">>>>>>>>>>>>Khac de thoat!<<<<<<<<<<<<<<<<<");
            System.out.print("Nhap lua chon: ");
            int LuaChon = sc.nextInt();
            sc.nextLine();
            switch (LuaChon) {
                case 1:
                    qlsv.themSinhVien();
                    break;
                case 2:
                    System.out.print("Nhap ma sinh vien can sua: ");
                    String masvs = sc.nextLine();
                    qlsv.suaSinhVien(masvs);
                    break;
                case 3:
                    System.out.print("Nhap ma sinh vien can xoa: ");
                    String masvx = sc.nextLine();
                    qlsv.xoaSinhVien(masvx);
                    break;
                case 4:
                    System.out.print("So luong sinh vien: " + qlsv.soLuongSv() + "\n");
                    break;
                case 5:
                    System.out.print("Nhap lop can hien thi danh sach: ");
                    String lop = sc.nextLine();
                    qlsv.timKiemSinhVienTheoLop(lop);
                    break;
                default:
                    System.out.print("-----------Da thoat!-----------\n");
                    return;
            }
        }
    }
}
