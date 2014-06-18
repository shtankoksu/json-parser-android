package com.json.app;


public class Contact {
    public String id = "";
    public String name = "";
    public String email = "";
    public String address = "";
    public String gender = "";
    public String mobile = "";
    public String home = "";
    public String office = "";

    @Override
    public String toString() {
        return id + ", " + "\n" + name + ", " + "\n" + email +
                ", " + "\n" + address + ", " + "\n" + gender +
                ", " + "\n" + mobile + ", " + "\n" + home +
                ", " + "\n" + office+"\n"+""+"\n";
    }
}
