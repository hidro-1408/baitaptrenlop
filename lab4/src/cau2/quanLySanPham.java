package cau2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


public class quanLySanPham {

    private ArrayList<sanPham> dssp;

    public quanLySanPham() {
        this.dssp = new ArrayList<>();
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            sanPham sp = new sanPham();
            sp.nhap();
            dssp.add(sp);
            System.out.print("Nhap Them (Y/N)?: ");
            if (sc.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void xuat() {
        for (sanPham sp : dssp) {
            sp.xuat();
        }
    }

    public void xuatNgauNhien() {
        Collections.shuffle(dssp);
        for (sanPham pham : dssp) {
            pham.xuat();
        }
    }

    public void sapXep(String check) {
        if (check.equalsIgnoreCase("t")) {
             dssp.stream().sorted(Comparator.comparing(sanPham::getGia)).forEach(sanPham::xuat);
        } else if (check.equalsIgnoreCase("g")) {
             dssp.stream().sorted(Comparator.comparing(sanPham::getGia).reversed()).forEach(sanPham::xuat);
        }
    }
    
    public void xoa(String ten){
        boolean check = false;
        Iterator<sanPham> iterator = dssp.iterator();
        while (iterator.hasNext()) {            
            sanPham sp = iterator.next();
            if (sp.getTen().equalsIgnoreCase(ten)) {
                iterator.remove();
                check = true;
            }
        }
        
        if (!check) {
            System.out.println("Khong tim thay ten san pham");
        }
    }
}
