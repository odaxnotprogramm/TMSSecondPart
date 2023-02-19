package com.tms;

import java.util.Objects;

public abstract class Employee {
    private String name;
    private String secondName;
    private int experienceYears;
    private Role role;
    private double salary;

    public Employee(String name, String secondName, int experienceYears, Role role) {
        this.name = name;
        this.secondName = secondName;
        this.experienceYears = experienceYears;
        this.role = role;
        this.salary =  1000 * getRole().getKoef() * getExperienceYears();
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public Role getRole() {
        return role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nSecondName: " + secondName +
                "\nExperienceYears: " + experienceYears +
                "\nRole: " + role +
                "\nSalary: " + salary + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return name.equals(employee.name) && secondName.equals(employee.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, secondName);
    }
}
