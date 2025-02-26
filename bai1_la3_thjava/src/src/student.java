
package src;

import java.util.Scanner;

/**
 *
 * @author CNTT
 */
public class student implements person{

 private String name;
 private int age;
 private String nativeplace;
 private String id;

    public student(String name, int age, String nativeplace, String id) {
        this.name = name;
        this.age = age;
        this.nativeplace = nativeplace;
        this.id = id;
    }

    public student() {
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNativeplace() {
        return nativeplace;
    }

    public void setNativeplace(String nativeplace) {
        this.nativeplace = nativeplace;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
 
 
    
    
    
    
    
   

    @Override
    public void display() {
        System.out.println("Ten: " + this. getName());
        System.out.println("Tuoi: "+this. getAge());
        System.out.println("NativePlace: " + this. getNativeplace());
        System.out.println("ID: "  + this. getId());
        
    }

    @Override
    public void input() {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap name: ");
        this.setName(sc.nextLine());
        
        System.out.print("nhap tuoi: ");
        this.setAge(sc.nextInt());
        
        System.out.print("Nhap native place: ");
        sc.nextLine();
        this.setNativeplace(sc.nextLine());
        
        System.out.print("Nhap id: ");
        this.setId(sc.nextLine());
    }
    
}
