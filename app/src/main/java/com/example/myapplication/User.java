package com.example.myapplication;

public class User {
    String name;
    String empno;
    String loc;
    String phone_num;
    String blood_group;

    public User(String name, String empno, String loc, String phone_num, String blood_group) {
        this.name = name;
        this.empno = empno;
        this.loc = loc;
        this.phone_num = phone_num;
        this.blood_group = blood_group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public String getBlood_group() {
        return blood_group;
    }

    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }
}
