
package cau2;

import java.util.Scanner;

public class sanPham {
       private String ten;
       private double gia;

    public sanPham() {
    }
    
       
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
       
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        this.setTen(sc.nextLine());
        System.out.println("Gia: ");
        this.setGia(sc.nextDouble());
        
        
    }
       
    public void xuat(){
    
        System.out.println("Ten san pham: " + this.getTen());
        System.out.println("Gia: " + this.getGia());
        System.out.println("------------------------------\n");
    }
            
}

