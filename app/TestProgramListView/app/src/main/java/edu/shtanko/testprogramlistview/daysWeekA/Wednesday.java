package edu.shtanko.testprogramlistview.daysWeekA;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import edu.shtanko.testprogramlistview.app.R;
import edu.shtanko.testprogramlistview.weekA.lessonsWednesdayA.*;

public class Wednesday extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wednesday);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabSpec;
        tabSpec = tabHost.newTabSpec("tag1");
        tabSpec.setIndicator("1");
        tabSpec.setContent(new Intent(this, One.class));
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("tag2");
        tabSpec.setIndicator("2");
        tabSpec.setContent(new Intent(this, Two.class));
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("tag3");
        tabSpec.setIndicator("3");
        tabSpec.setContent(new Intent(this, Three.class));
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("tag4");
        tabSpec.setIndicator("4");
        tabSpec.setContent(new Intent(this, Four.class));
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("tag5");
        tabSpec.setIndicator("5");
        tabSpec.setContent(new Intent(this, Five.class));
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("tag6");
        tabSpec.setIndicator("6");
        tabSpec.setContent(new Intent(this, Six.class));
        tabHost.addTab(tabSpec);
    }
}
