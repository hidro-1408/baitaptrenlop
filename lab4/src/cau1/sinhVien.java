/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau1;

import java.util.Scanner;

/**
 *
 * @author CNTT
 */
public class sinhVien {

    private String massv;
    private String hoTen;
    private String namSinh;
    private String diaChi;
    private String lop;
    
    

    
    public sinhVien() {
    }

    public String getMassv() {
        return massv;
    }

    public void setMassv(String massv) {
        this.massv = massv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        this.setMassv(sc.nextLine());
        System.out.print("Ho Ten: ");
        this.setHoTen(sc.nextLine());
        System.out.print("Nam sinh: ");
        this.setNamSinh(sc.nextLine());
        System.out.print("Dia chi: ");
        this.setDiaChi(sc.nextLine());
        System.out.print("Lop: ");
        this.setLop(sc.nextLine());
    }

    public void xuat() {
        System.out.print("Ma sinh vien: " + this.getMassv() + "\n");

        System.out.print("Ho ten: " + this.getHoTen() + "\n");

        System.out.print("Nam sinh: " + this.getNamSinh() + "\n");

        System.out.print("Dia chi: " + this.getDiaChi() + "\n");

        System.out.print("Lop: " + this.getLop() + "\n");
        System.out.println("----------------------------------------\n");
    }
}
