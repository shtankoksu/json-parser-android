package edu.shtanko.unarea.app.days_week_b;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import edu.shtanko.unarea.app.R;
import edu.shtanko.unarea.app.weeks.week_b.monday_lessons_week_b.*;

public class Monday extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monday);

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
