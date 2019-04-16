package pl.minda.euro_rtv_agd;

import android.app.ActionBar;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FridgeCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        ListView listFridge = getListView();
        ArrayAdapter<Fridge> listAdapter = new ArrayAdapter<Fridge>(this, android.R.layout.simple_list_item_1, Fridge.fridges);
        listFridge.setAdapter(listAdapter);
    }

    @Override
    public void onListItemClick(ListView listView,
                                View itemView,
                                int position,
                                long id) {
        Intent intent = new Intent(FridgeCategoryActivity.this, FridgeActivity.class);
        intent.putExtra(FridgeActivity.EXTRA_FRIDGENO, (int) id);
        startActivity(intent);
    }
    }

