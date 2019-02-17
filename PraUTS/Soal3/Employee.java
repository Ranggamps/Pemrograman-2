package Soal3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Employee {
    String name, address;
        int salary;
        
    public Employee(String name , String address,int salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public static void main(String [] args){
        Manager boss = new Manager("Naufal","Dago",5000000,1000000);
        
        Staff staff1 = new Staff("Rangga","Pahlawn", 4000000);
        Staff staff2 = new Staff("Saepul","Ciroyom", 4000000);
        //boss
        System.out.println("Manager \t=\t"+ boss.getName()+"\t" + boss.getAddress()+"\t" + boss.getSalary());
        //staf
        System.out.println("Staff 1 \t=\t"+ staff1.getName()+ "\t" + staff1.getAddress()+ "\t" + staff1.getSalary());
        System.out.println("Staff 2 \t=\t"+ staff2.getName()+ "\t"+ staff2.getAddress() + "\t" + staff2.getSalary());
        
    }
    
}
