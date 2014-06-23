package edu.shtanko.testprogramlistview.app;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import edu.shtanko.testprogramlistview.week.WeekA;
import edu.shtanko.testprogramlistview.week.WeekB;

public class MainActivity extends TabActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabSpec;
        tabSpec = tabHost.newTabSpec("tag1");
        tabSpec.setIndicator("Week A");
        tabSpec.setContent(new Intent(this, WeekA.class));
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("tag2");
        tabSpec.setIndicator("Week B");
        tabSpec.setContent(new Intent(this, WeekB.class));
        tabHost.addTab(tabSpec);
    }
}