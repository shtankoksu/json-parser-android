package com.json.app;


import java.util.ArrayList;
import java.util.List;

public class Timetable {
    public String one = "";
    public String group = "";
    public String id = "";
    public String is_full = "";
    public String number = "";
    public String room_number = "";
    public String room_type = "";
    public String sub_group = "";
    public String subject = "";
    public String subject_type = "";
    public String teacher = "";
    public String time_end = "";
    public String time_start = "";

    @Override
    public String toString() {
        return "Timetable{" +
                "time_start='" + time_start + '\'' +
                ", time_end='" + time_end + '\'' +
                ", teacher='" + teacher + '\'' +
                ", subject_type='" + subject_type + '\'' +
                ", subject='" + subject + '\'' +
                ", sub_group='" + sub_group + '\'' +
                ", room_type='" + room_type + '\'' +
                ", room_number='" + room_number + '\'' +
                ", number='" + number + '\'' +
                ", is_full='" + is_full + '\'' +
                ", id='" + id + '\'' +
                ", group='" + group + '\'' +
                ", one='" + one + '\'' +
                '}';
    }

    /*@Override
    public String toString() {
        return id + ", " + "\n" + name + ", " + "\n" + email +
                ", " + "\n" + address + ", " + "\n" + gender +
                ", " + "\n" + mobile + ", " + "\n" + home +
                ", " + "\n" + office+"\n"+""+"\n";
    }*/

}
