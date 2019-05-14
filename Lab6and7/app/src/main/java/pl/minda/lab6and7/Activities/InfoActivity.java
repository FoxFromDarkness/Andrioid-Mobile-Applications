package pl.minda.lab6and7.Activities;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

import pl.minda.lab6and7.R;


public class InfoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
