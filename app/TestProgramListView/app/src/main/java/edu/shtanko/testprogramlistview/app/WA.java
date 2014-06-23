package edu.shtanko.testprogramlistview.app;

public class WA {
    public String monday = "";
    public String tuesday = "";
    public String wednesday = "";
    public String thursday = "";
    public String friday = "";
    public String saturday = "";

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
        return

                "Group: " + group + "\n" +
                        "ID: " + id + "\n" +
                        "Is full: " + is_full + "\n" +
                        "Number: " + number + "," + "\n" +
                        "Room number: " + room_number + "\n" +
                        "Room type: " + room_type + "\n" +
                        "Sub group: " + sub_group + "\n" +
                        "Subject: " + subject + "," + "\n" +
                        "Subject type: " + subject_type + "\n" +
                        "Teacher: " + teacher + "\n" +
                        "Time end: " + time_end + "\n" +
                        "Time start: " + time_start;
    }
}
