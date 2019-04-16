package pl.minda.euro_rtv_agd;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Menu;

import android.widget.ShareActionProvider;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> listView,
                                            View v,
                                            int position,
                                            long id) {
                        if (position == 0) {
                            Intent intent = new Intent(MainActivity.this, FridgeCategoryActivity.class);
                            startActivity(intent);
                        }
                        else if (position == 1) {
                            Intent intent = new Intent(MainActivity.this, VacummCleanerCategoryActivity.class);
                            startActivity(intent);
                        }
                        else if (position == 2) {
                            Intent intent = new Intent(MainActivity.this, WashingMachilneCategoryActivity.class);
                            startActivity(intent);
                        }

                    }
                };
        // Dodajemy obiekt nasłuchujący do widoku listy
        ListView listView = (ListView) findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Przygotowujemy menu; jeśli jest pasek akcji, to dodajemy do niego elementy
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_create_order:
                // Kod wykonywany po kliknięciu przycisku Złóż zamówienie
                Intent intent = new Intent(this, InfoActivity.class);
                startActivity(intent);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
