/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author HP
 */
public class Student {
    private static Student student;
    private String name;
    private String id;
    private int age;
    private double cgpa;
    
    
    private Student(String name, String id, int age, double cgpa){
        this.name = name;
        this.id = id;
        this.age= age;
        this.cgpa = cgpa;
                
    }
    
    
    public static Student getStudent(String name, String id, int age, double cgpa) {
        if (student == null) {  
            student = new Student(name, id, age, cgpa);
        }
        return student;
    } 
    
    public void show()
    {
        System.out.print(name);
    }
    
    
}
