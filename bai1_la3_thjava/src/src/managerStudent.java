/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 *
 * @author CNTT
 */
public class managerStudent extends student{
    private ArrayList<student> dsstudent;

    public managerStudent(String name, int age, String nativeplace, String id) {
        super(name, age, nativeplace, id);
        this.dsstudent = new ArrayList<student>();
    }

    public managerStudent() {
        this.dsstudent = new ArrayList<>();
    }
    
    
    
    public void nhapds(int n){
        for (int i = 0; i < n; i++) {
            student st = new student();
            st.input();
            dsstudent.add(st);
        }
    }
       
    public void xuatds(int n)
    {
        for (student object : dsstudent) {
            object.display();
        }
    }
    
    public void sortds()
    {
        dsstudent.sort((s1,s2)->s1.getName().compareTo(s2.getName()));
        dsstudent.forEach(student->student.display());
    }
    
    public void search(String nametimkiem)
    {
        boolean check = false;
        for (student object : dsstudent) {
            if (object.getName().equalsIgnoreCase(nametimkiem)) {
                object.display();
                check = true;
            }else
            {
                check = false;
            }
        }
        if (check == false) {
            System.out.println("khong tim thay sinh vien ten: " + nametimkiem);
        }
    }
    
    
    public static void main(String[] args) {
        managerStudent ms = new managerStudent();
        
    }
}
