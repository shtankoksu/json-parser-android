package edu.shtanko.testprogramlistview.app;


import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class Parser extends Activity {

    private static final String TAG_WEEK_A = "1";
    private static final String TAG_WEEK_B = "1";
    private static final String TAG_MONDAY = "1";
    private static final String TAG_TUESDAY = "tuesday";
    private static final String TAG_WEDNESDAY = "wednesday";
    private static final String TAG_THURSDAY = "thursday";
    private static final String TAG_FRIDAY = "friday";
    private static final String TAG_SATURDAY = "saturday";
    private static final String TAG_1 = "1";
    private static final String TAG_2 = "2";
    private static final String TAG_3 = "3";
    private static final String TAG_4 = "4";
    private static final String TAG_5 = "5";
    private static final String TAG_6 = "6";
    private static final String TAG_GROUP = "group";
    private static final String TAG_ID = "id";
    private static final String TAG_IS_FULL = "is_full";
    private static final String TAG_NUMBER = "number";
    private static final String TAG_ROOM_NUMBER = "room_number";
    private static final String TAG_ROOM_TYPE = "room_type";
    private static final String TAG_SUB_GROUP = "sub_group";
    private static final String TAG_SUBJECT = "subject";
    private static final String TAG_SUBJECT_TYPE = "subject_type";
    private static final String TAG_TEACHER = "teacher";
    private static final String TAG_TIME_END = "time_end";
    private static final String TAG_TIME_START = "time_start";


    ProgressDialog dialog;
    ArrayList<WA> weekA;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);
        initializer();
        new ParseJSONTask().execute();
    }

    public void initializer() {
        dialog = new ProgressDialog(this);
        weekA = new ArrayList<WA>();
        textView = (TextView) findViewById(R.id.textView);
    }

    public void updateUi() {
        String contactString = "";
        for (WA aWeekA : weekA) {
            contactString += aWeekA.toString();
        }
        textView.setText(contactString);
    }

    public class ParseJSONTask extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            dialog.setMessage("Loading...");
            dialog.setCancelable(false);
            dialog.show();
        }

        @Override
        protected Void doInBackground(Void... params) {
            WebService webService = new WebService();
            String jsonUrl = webService.getJSONData("https://json-parser-android.googlecode.com/git/json/test/timetable.json");

            try {
                JSONObject jsonObject = new JSONObject(jsonUrl);

                JSONObject weekaJSONObject = jsonObject.getJSONObject(TAG_WEEK_A);
                JSONObject mondayJSONObject = weekaJSONObject.getJSONObject(TAG_MONDAY);
                JSONArray jsonArray = mondayJSONObject.getJSONArray(TAG_4);

                for (int i = 0; i < jsonArray.length(); i++) {
                    WA aweekA = new WA();
                    JSONObject dayObject = jsonArray.getJSONObject(i);

                    aweekA.group = dayObject.getString(TAG_GROUP);
                    aweekA.id = dayObject.getString(TAG_ID);
                    aweekA.is_full = dayObject.getString(TAG_IS_FULL);
                    aweekA.number = dayObject.getString(TAG_NUMBER);
                    aweekA.room_number = dayObject.getString(TAG_ROOM_NUMBER);
                    aweekA.room_type = dayObject.getString(TAG_ROOM_TYPE);
                    aweekA.sub_group = dayObject.getString(TAG_SUB_GROUP);
                    aweekA.subject = dayObject.getString(TAG_SUBJECT);
                    aweekA.subject_type = dayObject.getString(TAG_SUBJECT_TYPE);
                    aweekA.teacher = dayObject.getString(TAG_TEACHER);
                    aweekA.time_end = dayObject.getString(TAG_TIME_END);
                    aweekA.time_start = dayObject.getString(TAG_TIME_START);
                    weekA.add(aweekA);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }


        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            if (dialog.isShowing()) {
                dialog.dismiss();
            }
            updateUi();
        }

    }
}
