package edu.shtanko.unarea.app.weeks.week_b;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import edu.shtanko.unarea.app.R;
import edu.shtanko.unarea.app.days_week_b.*;

import java.util.ArrayList;
import java.util.HashMap;


public class WeekB extends Activity {

    private static final String WEEK_DAY = "weekday";
    private static final String DAY_OF_A_WEEK = "day_of_a_week";
    private static final String IMAGE_WEEK = "icon_week";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week_b);

        ListView listView = (ListView) findViewById(R.id.list);


        ArrayList<HashMap<String, Object>> weeks = new ArrayList<HashMap<String, Object>>();
        HashMap<String, Object> hm;

        hm = new HashMap<String, Object>();
        String monday = "Monday";
        String of = " of the week B";
        hm.put(WEEK_DAY, monday);
        hm.put(DAY_OF_A_WEEK, monday + of);
        hm.put(IMAGE_WEEK, R.drawable.monday_b_icon);

        weeks.add(hm);

        hm = new HashMap<String, Object>();
        String tuesday = "Tuesday";
        hm.put(WEEK_DAY, tuesday);
        hm.put(DAY_OF_A_WEEK, tuesday+of);
        hm.put(IMAGE_WEEK, R.drawable.thursday_b_icon);

        weeks.add(hm);

        hm = new HashMap<String, Object>();
        String wednesday = "Wednesday";
        hm.put(WEEK_DAY, wednesday);
        hm.put(DAY_OF_A_WEEK, wednesday+of);
        hm.put(IMAGE_WEEK, R.drawable.wednesday_b_icon);

        weeks.add(hm);

        hm = new HashMap<String, Object>();
        String thursday = "Thursday";
        hm.put(WEEK_DAY, thursday);
        hm.put(DAY_OF_A_WEEK, thursday+of);
        hm.put(IMAGE_WEEK, R.drawable.thursday_b_icon);

        weeks.add(hm);

        hm = new HashMap<String, Object>();
        String friday = "Friday";
        hm.put(WEEK_DAY, friday);
        hm.put(DAY_OF_A_WEEK, friday+of);
        hm.put(IMAGE_WEEK, R.drawable.friday_b_icon);

        weeks.add(hm);

        SimpleAdapter adapter = new SimpleAdapter(this,
                weeks,
                R.layout.list_item, new String[]{
                WEEK_DAY,
                DAY_OF_A_WEEK,
                IMAGE_WEEK
        }, new int[]{
                R.id.text1,
                R.id.text2,
                R.id.img});

        listView.setAdapter(adapter);
        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intentMonday = new Intent(getApplicationContext(), Monday.class);
                        startActivity(intentMonday);
                        break;
                    case 1:
                        Intent intentTuesday = new Intent(getApplicationContext(), Tuesday.class);
                        startActivity(intentTuesday);
                        break;
                    case 2:
                        Intent intentWednesday = new Intent(getApplicationContext(), Wednesday.class);
                        startActivity(intentWednesday);
                        break;
                    case 3:
                        Intent intentThursday = new Intent(getApplicationContext(), Thursday.class);
                        startActivity(intentThursday);
                        break;
                    case 4:
                        Intent intentFriday = new Intent(getApplicationContext(), Friday.class);
                        startActivity(intentFriday);
                        break;
                }
            }
        });
    }


}
