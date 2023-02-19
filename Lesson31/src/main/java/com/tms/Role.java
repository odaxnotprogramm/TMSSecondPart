package com.tms;

public enum Role {
    SENIOR("senior",3.5),
    JUNIOR("junior",1);
    private String role;
    private  double koef;

    Role(String role, double koef){
        this.koef = koef;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public double getKoef() {
        return koef;
    }
}
