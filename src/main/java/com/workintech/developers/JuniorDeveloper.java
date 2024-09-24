package com.workintech.developers;

public class JuniorDeveloper extends Employee {
    public JuniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work(){
        System.out.println(getName() + " junior developer starts to working");
        setSalary(10000);
    }
}
