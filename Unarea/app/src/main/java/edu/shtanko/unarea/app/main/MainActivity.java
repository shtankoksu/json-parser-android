package edu.shtanko.unarea.app.main;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import edu.shtanko.unarea.app.R;
import edu.shtanko.unarea.app.weeks.week_a.WeekA;
import edu.shtanko.unarea.app.weeks.week_b.WeekB;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
