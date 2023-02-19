package com.tms;

import java.sql.SQLOutput;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("---------------FIRST TASK---------------");
        Junior firstJunior = new Junior("Daniil","Vecher",1,Role.JUNIOR);
        Junior secondJunior = new Junior("Evgeniy","Zaichenko",1,Role.JUNIOR);
        Senior firstSenior = new Senior("Sergey","Makarov",500,Role.SENIOR);

        System.out.println(firstJunior.toString());
        System.out.println(secondJunior.toString());
        System.out.println(firstSenior.toString());

        System.out.println("---------------SECOND TASK---------------");
        firstSenior.addEmployeeToSubmission(firstJunior);
        firstSenior.addEmployeeToSubmission(secondJunior);
        System.out.println(firstSenior.toString());
        firstSenior.showAllSubmission();

        System.out.println("---------------THIRD TASK---------------");
        Senior secondSenior = new Senior("Denis","Listopad",5,Role.SENIOR);
        Junior thirdJunior = new Junior("Andrey","Zastupnevich",1,Role.JUNIOR);
        secondSenior.addEmployeeToSubmission(thirdJunior);
        firstSenior.addEmployeeToSubmission(secondSenior);

        System.out.println("---------------4-TH TASK---------------");
        firstSenior.showAllSubmission();

        System.out.println("---------------5-TH TASK---------------");
        MainService mainService = new MainService();
        System.out.println(mainService.findEmployeeInSubmission(secondSenior,firstJunior));
    }
}
