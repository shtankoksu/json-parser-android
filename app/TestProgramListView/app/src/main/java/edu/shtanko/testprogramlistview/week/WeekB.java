package edu.shtanko.testprogramlistview.week;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import edu.shtanko.testprogramlistview.app.R;
import edu.shtanko.testprogramlistview.daysWeekB.*;

import java.util.ArrayList;
import java.util.HashMap;

public class WeekB extends Activity {
    private ArrayList<HashMap<String, Object>> weeks;
    private static final String WEEK_DAY = "weekday";
    private static final String DAY_OF_A_WEEK = "dayofaweek";
    private static final String IMAGE_WEEK = "iconweek";

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.week_b);

        ListView listView = (ListView) findViewById(R.id.listweekb);
        weeks = new ArrayList<HashMap<String, Object>>();
        HashMap<String, Object> hm;

        hm = new HashMap<String, Object>();
        hm.put(WEEK_DAY, "Monday");
        hm.put(DAY_OF_A_WEEK, "Monday of the week B");
        hm.put(IMAGE_WEEK, R.drawable.monday144b);

        weeks.add(hm);

        hm = new HashMap<String, Object>();
        hm.put(WEEK_DAY, "Tuesday");
        hm.put(DAY_OF_A_WEEK, "Tuesday of the week B");
        hm.put(IMAGE_WEEK, R.drawable.tuesday144b);

        weeks.add(hm);

        hm = new HashMap<String, Object>();
        hm.put(WEEK_DAY, "Wednesday");
        hm.put(DAY_OF_A_WEEK, "Wednesday of the week B");
        hm.put(IMAGE_WEEK, R.drawable.wednesday144b);

        weeks.add(hm);

        hm = new HashMap<String, Object>();
        hm.put(WEEK_DAY, "Thursday");
        hm.put(DAY_OF_A_WEEK, "Thursday of the week B");
        hm.put(IMAGE_WEEK, R.drawable.thursday144b);

        weeks.add(hm);

        hm = new HashMap<String, Object>();
        hm.put(WEEK_DAY, "Friday");
        hm.put(DAY_OF_A_WEEK, "Friday of the week B");
        hm.put(IMAGE_WEEK, R.drawable.friday144b);

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