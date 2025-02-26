/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

/**
 *
 * @author CNTT
 */
public class managerStudent extends student {

    private ArrayList<student> dsstudent;

    public managerStudent(String name, int age, String nativeplace, String id) {
        super(name, age, nativeplace, id);
        this.dsstudent = new ArrayList<student>();
    }

    public managerStudent() {
        this.dsstudent = new ArrayList<>();
    }

    public void nhapds(int n) {
        for (int i = 0; i < n; i++) {
            student st = new student();
            st.input();
            dsstudent.add(st);
        }
    }

    public void xuatds() {
        for (student object : dsstudent) {
            object.display();
            System.out.println("--------------------------------\n");
        }
    }

    public void sortds() {
        dsstudent.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
        dsstudent.forEach(student -> student.display());
    }

    public void search(String nametimkiem) {
        boolean check = false;
        for (student object : dsstudent) {
            if (object.getName().equalsIgnoreCase(nametimkiem)) {
                System.out.println("-------------Thong tin sinh vien "+ nametimkiem + "-----------");
                object.display();
                check = true;
            } else {
                check = false;
            }
        }
        if (check == false) {
            System.out.println("khong tim thay sinh vien ten: " + nametimkiem);
        }
    }

    public static void main(String[] args) {
        managerStudent ms = new managerStudent();
        Scanner sc = new Scanner(System.in);
        int choce;

        while (true) {
            System.out.println("\n----------MeNu----------------");
            System.out.println("1.Nhap sinh vien");
            System.out.println("2.hien thi ds sinh vien");
            System.out.println("3.sap xep sinh vien");
            System.out.println("4.tim kiem sinh vien");
            System.out.println(">>>Khac de thoat!<<<");
            System.out.print(" moi nhap lua chon: ");
            
            choce = sc.nextInt();
            switch (choce) {
                case 1:
                    System.out.print("Nhap so luong sinh vien: ");
                    int n = sc.nextInt();
                    ms.nhapds(n);
                    break;
                case 2:
                    System.out.println("--------------danh sach sinh vien----------------\n");
                    ms.xuatds();
                    break;
                case 3:
                    ms.sortds();
                    break;
                case 4:
                    System.out.print("Nhap ten can tim: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                     ms.search(name);
                     break;
                default:
                    System.out.print("Da thoat!\n");
                   return;
            }
        }
    }
}
