/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fishball;

/**
 *
 * @author DONZ ELECTRONIC PS
 */
public class Student {
    String name; 
    private static int instance;
    int id;
  
    
    public Student(String name){
        this.name = name;
        instance++;
        id = instance;

    }
    
    void setName(String name){
        
        this.name = name;
    }
}
