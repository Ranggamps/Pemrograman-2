/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal3;

/**
 *
 * @author Asus
 */
public class Manager extends Employee {
    
    int bonus;

    public Manager(String name, String address, int salary, int bonus) {
        super(name, address, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

 //   @Override
//    public void setSalary(int salary) {
//        int total = salary+getBonus();
//        super.setSalary(total);
//    }

    @Override
    public int getSalary() {
            //int total = salary+getBonus();
        return super.getSalary()+getBonus();
    }
    

    
}