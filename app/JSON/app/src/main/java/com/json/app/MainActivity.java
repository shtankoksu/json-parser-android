package com.json.app;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;


public class MainActivity extends Activity {
    private static final String TAG_ONE = "one";
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
    ArrayList<Timetable> timetables;
    TextView tvData;
    // private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //listView = (ListView) findViewById(R.id.listView);
        // List<String> strings = initData();
        // ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, strings);

        //listView.setAdapter(adapter);
        initializer();
        new ParseJSONTask().execute();

    }
    /*private List<String> initData(){
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
    }*/

    private void initializer() {
        dialog = new ProgressDialog(this);
        timetables = new ArrayList<Timetable>();
        tvData = (TextView) findViewById(R.id.tvData);
    }


    private void updateUi() {
        String contactString = "";
        for (Timetable aTimetable : timetables) {
            contactString += aTimetable.toString();
        }
        tvData.setText(contactString);
    }

    private class ParseJSONTask extends AsyncTask<Void, Void, Void> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            dialog.setMessage("Loading...");
            dialog.setCancelable(false);
            dialog.show();
        }

        @Override
        protected Void doInBackground(Void... params) {
            WebService webservice = new WebService();
            String jsonStr = webservice.getJSONData("https://json-parser-android.googlecode.com/git/json/timetabletest.json");

            try {
                JSONObject jsonObject = new JSONObject(jsonStr);
                JSONArray timetableJSON = jsonObject.getJSONArray(TAG_ONE);

                for (int i = 0; i < timetableJSON.length(); i++) {
                    Timetable aTimetable = new Timetable();
                    JSONObject contactObject = timetableJSON.getJSONObject(i);

                    aTimetable.group = contactObject.getString(TAG_GROUP);
                    aTimetable.id = contactObject.getString(TAG_ID);
                    aTimetable.is_full = contactObject.getString(TAG_IS_FULL);

                    aTimetable.number = contactObject.getString(TAG_NUMBER);
                    aTimetable.room_number = contactObject.getString(TAG_ROOM_NUMBER);
                    aTimetable.room_type = contactObject.getString(TAG_ROOM_TYPE);
                    aTimetable.sub_group = contactObject.getString(TAG_SUB_GROUP);
                    aTimetable.subject = contactObject.getString(TAG_SUBJECT);
                    aTimetable.subject_type = contactObject.getString(TAG_SUBJECT_TYPE);
                    aTimetable.teacher = contactObject.getString(TAG_TEACHER);
                    aTimetable.time_end = contactObject.getString(TAG_TIME_END);
                    aTimetable.time_start = contactObject.getString(TAG_TIME_START);

                    //JSONObject phoneObject = contactObject.getJSONObject(TAG_PHONE);


                    timetables.add(aTimetable);
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

