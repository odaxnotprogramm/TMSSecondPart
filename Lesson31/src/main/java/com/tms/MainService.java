package com.tms;

import java.util.List;

public class MainService implements EmployeeFindService {
    @Override
    public String findEmployeeInSubmission(Senior senior,Employee employee) {
        List<Employee> submission = senior.getSubmissionList();
        for (Employee person: submission){
            if(person.getRole() == Role.SENIOR){
                return findEmployeeInSubmission((Senior) person,employee);
            }
            if(person.equals(employee)) {
                return employee.getName() + " " + employee.getSecondName()
                        + " is in submission to " + senior.getName() + " " + senior.getSecondName();
            }
        }
        return employee.getName() + " " + employee.getSecondName()
                + " is not submission to " + senior.getName() + " " + senior.getSecondName();
    }
}
