package Fishball;

import java.util.*;


public class SMS {

    
    private void addStudent(){
        System.out.println("You have chosen to add a student");
        System.out.println("Please input the name of the student.");
   String name = input.nextLine();
   
   Student student = new Student(name);
        
   db.add(student);
   System.out.printf("Student %s is successfully added to the list\n.", name);
   
    }
    private void readStudent(){
    System.out.println("You have chosen to read the student list");
    for(Student x: db){
        System.out.println("ID: " + x.id + "\t\tName: " + x.name);
    }
    }
    private void updateStudent(){
    System.out.println("You have chosen to update a studnet's information");
        System.out.println("Please input the name of the student.");
    String name = input.nextLine();
    
    int i = 0;
    for(Student x: db){
        if(name.equals(x.name)){
            System.out.println("Student " + x.name + " successfully found in the list.");
            System.out.println("What information do you want to edit?\n[1] Name\n[2] Age");
            int c1 = input.nextInt();
            input.nextLine();
       
        
            switch(c1){
                case 1:
                    System.out.println("You have chosen to edit the student's name.");
                    System.out.println("Please enter new student's name.");
                    name = input.nextLine();
                    x.setName(name);
                    System.out.println("Update successful");
                case 2:
                    System.out.println("You have chosen number 2");
                    break;
                default:
                    System.out.println("Please try again");
                    break;
            
            }
            
            break;
        }
        if(i >= db.size()){
            System.out.println("Student cannot be found in the list.");
        }
        i++;
     
    }
    
    }
    private void deleteStudent()    {
    System.out.println("You have chosen to delete a student's information");
    System.out.println("Please input the name of the student.");
    String name = input.nextLine();
    
    int i = 0;
    for(Student x: db){
        if(name.equals(x.name)){
            System.out.println("Student " + x.name + " successfully found in the list.");
            System.out.println("Deleting student " + x.name);
            db.remove(x);
            break;
        }
        if(i >= db.size()){
            System.out.println("Student cannot be found in the list.");
        }
        i++;
     
    }
    }
    
    private List<Student> db = new ArrayList<Student>();
    private Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        SMS sms = new SMS();
        
        do{
        
            System.out.println("Welcome to Student Management System.");
            System.out.println("Please select within the given choices.");
            System.out.println("[0] End\n[1] Add Student\n[2] Read Student List\n[3] Update Student Information\n[4] Delete Student Information");
            String c1 = input.nextLine();
            switch(c1){
            
                case "1":
                    sms.addStudent();
                    
                    break;
                    
                case "2":
                    sms.readStudent();
                    break;
                    
                case "3":
                    sms.updateStudent();
                    break;
                    
                case "4":
                    sms.deleteStudent();
                    break;
                    
                case "0":
                    System.out.println("You have chosen to terminate the program.");
                    run = false;
                    break;
                    
                default:
                    System.out.println("Please input the given choices.");
                    break;
            }
            
            
            
        }while(run);
              
    }
}
