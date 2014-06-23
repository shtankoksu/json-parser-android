package edu.shtanko.testprogramlistview.app;


import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import edu.shtanko.testprogramlistview.week.WeekA;
import edu.shtanko.testprogramlistview.week.WeekB;

public class WeeksActivity extends TabActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();


        TabHost.TabSpec weekAspec = tabHost.newTabSpec("Week A");
        weekAspec.setIndicator("Week A", getResources().getDrawable(R.drawable.ic_launcher));
        Intent photosIntent = new Intent(this, WeekA.class);
        weekAspec.setContent(photosIntent);


        TabHost.TabSpec weekBspec = tabHost.newTabSpec("Week B");
        weekBspec.setIndicator("Week B", getResources().getDrawable(R.drawable.ic_launcher));
        Intent songsIntent = new Intent(this, WeekB.class);
        weekBspec.setContent(songsIntent);

        tabHost.addTab(weekAspec);
        tabHost.addTab(weekBspec);
    }
}
