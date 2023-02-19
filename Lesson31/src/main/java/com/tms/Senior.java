package com.tms;

import java.util.ArrayList;
import java.util.List;
public class Senior extends Employee{

    private final List<Employee> submission = new ArrayList<>();

    public void addEmployeeToSubmission(Employee employee){
        submission.add(employee);
    }

    public void showAllSubmission(){
        System.out.println("All employees in " + getName() + " " + getSecondName() + " submission: ");
        int counter = 1;
        for(Employee employee : submission){
            System.out.println("#" + counter + "\n" + employee.toString());
            counter++;
        }
    }

    public List<Employee> getSubmissionList() {
        return submission;
    }

    public Senior(String name, String secondName, int experienceYears, Role role) {
        super(name, secondName, experienceYears, role);
        this.setSalary(1000 * (getRole().getKoef() + submission.size() * 0.1) * getExperienceYears());
    }
}
