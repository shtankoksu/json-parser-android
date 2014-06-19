package com.json.app;


import java.util.ArrayList;
import java.util.List;

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

    private List<String> initData(){
        List<String> list=new ArrayList<String>();
        list.add(id);
        list.add(name);
        list.add(email);
        list.add(address);
        list.add(gender);
        list.add(mobile);
        list.add(home);
        list.add(office);

        return list;
    }
}
